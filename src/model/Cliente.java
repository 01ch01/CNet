package model;

public class Cliente extends Pessoa {
    protected Plano plano;
    protected String cod;
    protected String anoAdesao;

    public Cliente() {
        super();
        this.cod = "";
        this.anoAdesao = "";
//        this.definirPlano();
        this.plano = new Plano();
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getAnoAdesao() {
        return anoAdesao;
    }

    public void setAnoAdesao(String anoAdesao) {
        this.anoAdesao = anoAdesao;
    }

    public void definirPlano() {
        int opcao = 0;
        do {
            System.out.println("Escolha o plano que deseja:");
            System.out.println("[1] - 05 MEGA");
            System.out.println("[2] - 10 MEGA");
            System.out.println("[3] - 15 MEGA");
            System.out.println("[4] - 20 MEGA");
            System.out.println("[5] - 25 MEGA");
            System.out.print("Qual deseja? ");

            opcao = input.nextInt();
        } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4
                && opcao != 5);

        switch (opcao) {
            case 1:
                this.plano.setNome("05 MEGA");
                this.plano.definirPreco();
                break;
            case 2:
                this.plano.setNome("10 MEGA");
                this.plano.definirPreco();
                break;
            case 3:
                this.plano.setNome("15 MEGA");
                this.plano.definirPreco();
                break;
            case 4:
                this.plano.setNome("20 MEGA");
                this.plano.definirPreco();
                break;
            case 5:
                this.plano.setNome("25 MEGA");
                this.plano.definirPreco();
                break;
            default:
                break;
        }
    }
    @Override
    public void preencher(){
        System.out.println("\n-- CADASTRO DE CLIENTE --");
        super.preencher();
        this.definirPlano();
        input.nextLine();
        System.out.println("Código: ");
        this.cod = input.nextLine();
        System.out.println("Ano da Adesão: ");
        this.anoAdesao = input.nextLine();
        System.out.println("Plano Contratado: ");
    }
    
    @Override
    public void imprimir(){
        System.out.println("\n -- INFORMAÇÕES CADASTRAIS --");
        super.imprimir();
        System.out.println("Plano Contratado: " + plano.getNome() + " - " + plano.getPreco());
        System.out.println("Nome/Razão Social: " + super.nome);
        System.out.println("Código: " + this.cod);
        System.out.println("Ano de Adesão: " + this.anoAdesao);
    }
    
}
