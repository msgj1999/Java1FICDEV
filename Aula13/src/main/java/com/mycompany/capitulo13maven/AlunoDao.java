/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo13maven;

import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.swing.JOptionPane;

public class AlunoDao {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        String nome = JOptionPane.showInputDialog("Enter student name:");
        String cpf = JOptionPane.showInputDialog("Enter student CPF:");
        

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setCpf(cpf);

        Transaction transaction = session.beginTransaction();
        session.persist(aluno);
        transaction.commit();

        TypedQuery<Aluno> query = session.createQuery("FROM Aluno", Aluno.class);
        List<Aluno> alunos = query.getResultList();
        for (Aluno alunoI : alunos) {
            System.out.println(alunoI.getId());
            System.out.println(alunoI.getNome());
            System.out.println(alunoI.getCpf());
        }

        // Alterar dados usando JOptionPane
        String alunoId = JOptionPane.showInputDialog("Enter student ID to update:");
        Long id = Long.parseLong(alunoId);
        Aluno alunoToUpdate = session.get(Aluno.class, id);
        if (alunoToUpdate != null) {
            String novoNome = JOptionPane.showInputDialog("Enter new student name:");
            String novoCpf = JOptionPane.showInputDialog("Enter new student CPF:");
            alunoToUpdate.setNome(novoNome);
            alunoToUpdate.setCpf(novoCpf);
            Transaction updateTransaction = session.beginTransaction();
            session.update(alunoToUpdate);
            updateTransaction.commit();
            System.out.println("Student data updated successfully!");
        } else {
            System.out.println("Student not found!");
        }

        session.close();
    }
}


