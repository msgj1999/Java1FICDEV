package aula6;

import java.util.LinkedList;
import java.util.Queue;

public class Aula6 {
    public static void main(String[] args) {
        Queue<Carro> minhaFila = new LinkedList<Carro>();
        minhaFila.add(new Carro("Ford", "Mustang", 2020));
        minhaFila.add(new Carro("Chevrolet", "Camaro", 2021));
        minhaFila.add(new Carro("Dodge", "Charger", 2019));
        Carro carroRemovido = minhaFila.remove();
        
        for (Carro carro : minhaFila) {
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println();
        }
    }
}