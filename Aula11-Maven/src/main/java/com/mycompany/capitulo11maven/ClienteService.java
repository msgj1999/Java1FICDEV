/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo11maven;

import javax.persistence.*;
import java.util.*;
import java.text.*;

public class ClienteService {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Ana Paula ");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ClientePU") ;
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
