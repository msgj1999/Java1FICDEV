package teste;

public class Gato2 extends Animal2{
    int corPelo;
    
    public Gato2(int p, int a){
        super(p, a);
    }
    public Gato2(int p, int a, int corPelo){
        super(p,a);
        this.corPelo = corPelo;
    }
    public void falar(){
        miar();
    }
    private void miar(){
        System.out.println("miau!");
    }
}
