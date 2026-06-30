static void main () {

    System.out.println ("Testando nome: ");
    testarNome ();

    System.out.println ("Testando email: ");
    testarEmail ();

    System.out.println ("Testando Adm");
    testaAdm ();

}


public static void testarNome () {
    try{
        Usuario usuario = new Usuario ("", "lucas@gmail.com");
        usuario.visualizar ();
    } catch (Exception e) {
        System.out.println ("Mensagem de erro capturada: " + e.getMessage ());
        ;
    }

}

public static void testarEmail () {
    try{
        Usuario usuarioDois = new Usuario ("Luana", "luanagmail.com");
        usuarioDois.visualizar ();
    } catch (Exception e) {
        System.out.println ("Mensagem de erro capturada " + e.getMessage ());

    }
}

public static void testaAdm () {
    try{
        Administrador adm = new Administrador ("Denji", "denji@gmail.com", "");
        adm.visualizar ();
    } catch (Exception e) {
        System.out.println ("Mensagem de erro capturada " + e.getMessage ());
    }
}
