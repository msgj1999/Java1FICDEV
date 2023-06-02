package Metodos1;

public class Metodos1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Antes de chamar o metodo:");
        System.out.println("A = " + a + ", b = " + b);
        
        soma(a, b);
        
        System.out.println("Depois de chamar o metodo:");
        System.out.println("A = " + a + ", b = " + b);  
    }
    
    public static void soma(int x, int y){
        int resultado = x + y;
        System.out.println("Resultado da soma: " + resultado);
        
        x = 0;
        System.out.println("Valor de x dentro do metodo: " + x);
    }
}
