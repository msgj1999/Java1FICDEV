package com.mycompany.capitulo11maven;
import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name = " clientes ")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = " nome ")
    private String nome;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
}
