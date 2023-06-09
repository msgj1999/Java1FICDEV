package registroLog;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Teste {
    private static Logger log;

    public static void main(String[] args){
        log = Logger.getLogger(Teste.class.getName());
        
        log.log(Level.INFO, "Mensagem informativa");
        log.log(Level.WARNING, "Mensagem de aviso");
    }
}
