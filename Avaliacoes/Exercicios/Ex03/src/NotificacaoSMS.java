public class NotificacaoSMS extends Notificacao{
    @Override
    public void validarTipoDestinatario (String destinatario) {
        Validacao.validarTelefone (destinatario);
    }

    public NotificacaoSMS (String destinatario) {
        super (destinatario);
    }

    @Override
    public void enviar (String mensagem) {
        Validacao.validarMensagem (mensagem);
        System.out.println ("Enviando SMS para "+getDestinatario ());
        System.out.println ("Mensagem: "+mensagem);
        LogEnvios.registrar ("SMS ",getDestinatario ());
    }
}