public class Administrador extends Usuario{
    private String nivelDeAcesso;

    public Administrador (String nome, String email, String nivelDeAcesso) {
        super (nome, email);
        Validacao.validarAcesso (nivelDeAcesso);
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getNivelDeAcesso () {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso (String nivelDeAcesso) {
        Validacao.validarAcesso (nivelDeAcesso);
        this.nivelDeAcesso = nivelDeAcesso;
    }

    //sobrescrita do método visualizar
    @Override
    public void visualizar () {
        super.visualizar ();
        System.out.println ("Nivel de Acesso: " +this.getNivelDeAcesso ());
    }


}