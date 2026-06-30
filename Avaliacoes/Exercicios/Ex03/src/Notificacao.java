public abstract class Notificacao {
    private String destinatario;

    protected void validarDestinatarioEspecifico (String destinatario){
        Validacao.validarVazio (destinatario);
        this.destinatario = destinatario;
    }

    public abstract void validarTipoDestinatario(String destinatario);


    //Construtor
    public Notificacao(String destinatario){
        Validacao.validarVazio (destinatario);
        validarTipoDestinatario (destinatario);
        this.destinatario = destinatario;
    }

    //Getters e Setters
    public String getDestinatario () {

        return destinatario;
    }

    public void setDestinatario (String destinatario) {
        Validacao.validarVazio (destinatario);
        validarTipoDestinatario (destinatario);
        this.destinatario = destinatario;
    }

    public abstract void enviar(String mensagem);

}