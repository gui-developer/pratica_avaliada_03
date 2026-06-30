public class CarroEletrico extends Carro {
    private static final int CONSUMO_POR_ACELERACAO = 2;
    private int nivelBateria;

    public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
        super(modelo, velocidade);
        Validacao.validarBateria(nivelBateria);
        this.nivelBateria = nivelBateria;
    }

    public int getNivelBateria() { return nivelBateria; }
    public void setNivelBateria(int nivelBateria) {
        Validacao.validarBateria (nivelBateria);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void acelerar(int valor) {
        Validacao.validarAceleracao(valor);
        int consumo = valor / CONSUMO_POR_ACELERACAO;

        if (consumo > this.nivelBateria) {
            throw new IllegalArgumentException("Bateria insuficiente para esta aceleração!");
        }
        this.nivelBateria -= consumo;
        super.acelerar(valor);
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Nível da bateria: " + nivelBateria + "%");
    }
}