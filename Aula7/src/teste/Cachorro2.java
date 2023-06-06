package teste;

public class Cachorro2 extends Animal2{
    int corPelo;
    
    public Cachorro2(int p, int a){
        super(p, a);
    }
    public Cachorro2(int p, int a, int corPelo){
        super(p,a);
        this.corPelo = corPelo;
    }
    public void falar(){
        latir();
    }
    private void latir(){
        System.out.println("auau!");
    }
}
