package herançaTeste;

public class Cachorro extends Animal {
    int corPelo;
    
    public Cachorro(int p, int a){
        super(p, a);
    }
    public Cachorro(int p, int a, int corPelo){
        super(p,a);
        this.corPelo = corPelo;
    }
    
}
