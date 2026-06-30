public class NotificacaoEmail extends Notificacao{

    @Override
    public void validarTipoDestinatario (String destinatario) {
        Validacao.validarEmail (destinatario);
    }

    public NotificacaoEmail (String destinatario) {
        super (destinatario);
    }

    @Override
    public void enviar (String mensagem) {
        Validacao.validarMensagem (mensagem);
        System.out.println ("Enviando Email para: "+getDestinatario ());
        System.out.println ("Mensagem: "+mensagem);
        LogEnvios.registrar ("Email: ",getDestinatario ());
    }
}