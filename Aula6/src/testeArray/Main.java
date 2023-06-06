package testeArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        for(Integer numero : numeros){
            System.out.println(numero);
        }
        
        HashMap<String, Integer> idades = new HashMap<String, Integer>();
        idades.put("Alice", 25);
        idades.put("Bob", 30);
        idades.put("Charlie", 35);
        
        for(String nome : idades.keySet()){
            
            Integer idade = idades.get(nome);
            System.out.println(nome + " tem " + idade + " anos ");
        }
        
        /*HashMap<String, Integer> idades = new HashMap<String, Integer>();
        
        idades.put("Alice", numeros.get(0));
        idades.put("Bob", numeros.get(1));
        idades.put("Charlie", numeros.get(2));
        
        for(String nome : idades.keySet()){
            Integer idade = idades.get(nome);
            System.out.println(nome + " tem " + idade + " anos ");
        }*/
    }   
}
