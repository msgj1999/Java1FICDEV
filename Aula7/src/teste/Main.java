package teste;

public class Main {
    public static void main(String[] args){
        Animal2 meusAnimais[] = new Animal2[10];
        meusAnimais[0] = new Animal2(4,30);
        meusAnimais[1] = new Cachorro2(4,15);
        meusAnimais[2] = new Gato2(4,10);
        meusAnimais[0].falar();
        meusAnimais[1].falar();
        meusAnimais[2].falar();
    }
}
