public class Validacao {
    public static void validarAceleracao(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Aceleração deve ser maior que 0!");
        }

    }
    public static void validarBateria(int bateria) {
        if (bateria < 0 || bateria > 100) {
            throw new IllegalArgumentException("Nível da bateria deve estar entre 0 e 100!");
        }

    }
}