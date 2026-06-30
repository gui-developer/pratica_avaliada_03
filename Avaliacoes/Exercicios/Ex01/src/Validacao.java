public class Validacao {
    public static void validarNome (String nome){
        if (nome == null || nome.trim ().isEmpty ()){
            throw new IllegalArgumentException ("O nome não pode ser vazio!");
        }
    }
    public static void validarEmail(String email) {
        if (email == null || !email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("O e-mail não é valido!");
        }
    }

    public static void validarAcesso(String nivel){
        if (nivel == null || nivel.trim ().isEmpty () ){
            throw new IllegalArgumentException("Seu nível de acesso não é valido!");
        }
    }

}