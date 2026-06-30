import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LogEnvios {
    private static final List<String> historico = new ArrayList<> ();

    public static void registrar(String tipo, String destinatario){
        String log = "["+ LocalDateTime.now ()+"]"+tipo+"enviado para: "+destinatario;
        historico.add (log);
    }

    public static void exibirHistorico(){
        for (String i : historico){
            System.out.println ("Histórico: "+i);
        }
    }

}