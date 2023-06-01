package menu;
import java.util.Scanner;

public class menubebidas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual bebida você deseja comprar?");
        System.out.printf("Coca-Cola  1%nCafé       2%nCerveja    3%nAgua       4%nEnergetico 5%n");
        
        int n = sc.nextInt();
        
        switch(n){
            case 1:
                System.out.println("Coca-cola custa 8,00$");
                break;
            case 2:
                System.out.println("Café custa 3,00$");
                break;
            case 3:
                System.out.println("Cerveja custa 7,50%");
                break;
            case 4:
                System.out.println("Agua custa 4,50$");
                break;
            case 5:
                System.out.println("Energetico custa 10,00$");
                break;
            default:
                System.out.println("Opção invalida!");
        }
    }
}
