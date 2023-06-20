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
