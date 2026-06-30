
    static void main () {
        try {
            CarroEletrico tesla = new CarroEletrico("Tesla Model 3", 0, 20);
            tesla.acelerar(30);
            tesla.visualizar();

            Carro volvo = new Carro ("Volvo C40", 0);
            volvo.acelerar (50);
            volvo.visualizar ();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
