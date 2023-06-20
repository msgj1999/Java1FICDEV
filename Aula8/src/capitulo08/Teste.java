/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo08;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        String senhaCorreta = "senha123";
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();
        
        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha correta. Acesso concedido!");
        } else {
            System.out.println("Senha incorreta. Acesso negado!");
        }
        
        scanner.close();
    }
}
