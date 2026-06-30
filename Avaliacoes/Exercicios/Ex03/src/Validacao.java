public class Validacao {
    public static void validarEmail(String email){
        if (email == null || email.trim ().isEmpty ()){
            throw new IllegalArgumentException ("Destinatário não pode ser vazio!");
        }else if (!email.matches ("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$") && !email.matches ("^\\d{10,11}$")){
            throw new IllegalArgumentException ("Destinatario inválido (deve ser e-mail ou telefone)!");
        }
    }

    public static void validarTelefone(String telefone){
        if(telefone == null || !telefone.matches ("^\\d{10,11}$")){
            throw new IllegalArgumentException ("Telefone inválido! Use apenas números (DDD + 8 ou 9 dígitos).");
        }
    }

    public static void validarMensagem(String msg) {
        if (msg == null || msg.trim().isEmpty()) {
            throw new IllegalArgumentException("A mensagem não pode estar vazia!");
        }
    }

    public static void validarVazio(String destinatario){
        if (destinatario == null || destinatario.trim().isEmpty()) {
            throw new IllegalArgumentException("O Destinatário está vazio");
        }
    }
}