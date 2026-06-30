public class Usuario {
    private String nome;
    private String email;

    public Usuario (String nome, String email) {
        Validacao.validarEmail (email);
        Validacao.validarNome (nome);
        this.nome = nome;
        this.email = email;
    }

    public void visualizar(){
        System.out.println ("Nome: " +this.getNome ());
        System.out.println ("Email: " +this.getEmail ());
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        Validacao.validarNome (nome);
        this.nome = nome;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        Validacao.validarEmail (email);
        this.email = email;
    }
}