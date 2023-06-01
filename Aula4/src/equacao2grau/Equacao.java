package equacao2grau;
import java.util.Scanner;

public class Equacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c, delta;
        double x1, x2;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a == 0){
            System.out.println("Não é possivel calcular a equação para X = 0");
        } else {
            delta = ((b*b) - 4*a*c);
            if(delta < 0){
                System.out.println("A equação não possui raizes reais!");
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.printf("As raizes são x1 = %.2f e x2 = %.2f%n", x1, x2);
            }
        }
    }
}
