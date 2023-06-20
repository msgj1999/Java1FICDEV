/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo08;
import java.util.ArrayList;
import java.util.List;

public class Teste2 {
     public static void main(String[] args) {
        try {
            String mensagem = "Hello, World!";
            System.out.println(mensagem);

            int numero = 42;
            System.out.println("O número é: " + numero);

            boolean condicao = false;
            if (condicao) {
                System.out.println("A condição é verdadeira!");
            } else {
                System.out.println("A condição é falsa!");
            }

            List<String> lista = new ArrayList<>();
            lista.add("Maçã");
            lista.add("Banana");
            lista.add("Laranja");
            System.out.println("Elementos da lista: " + lista);

            for (String elemento : lista) {
                System.out.println(elemento);
            }

            int resultado = somar(10, 20);
            System.out.println("A soma é: " + resultado);

            int resultadoDivisao = dividir(50, 0);
            System.out.println("O resultado da divisão é: " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
