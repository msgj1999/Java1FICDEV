package Primo;
import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int primo, i, contador = 0;
        System.out.print("Digite um numero para saber se ele é primo: ");
        
        primo = sc.nextInt();
        
        for(i=1; i<=primo;i++){
            if(primo % i == 0){
                contador++;
            }
        }    
        if(contador == 2){
            System.out.printf("%d É um numero primo!%n", primo);
        }  else {
            System.out.printf("%d Não é um numero primo%n", primo);
        }
    }  
}
