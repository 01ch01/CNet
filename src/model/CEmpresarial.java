package model;

import controller.PlanosEspeciais;

public class CEmpresarial extends ClienteJuridico  {
    public Plano planos;

    public CEmpresarial() {
        super();
        this.planos = new Plano();
    }

    public void definirPlano() {
        int opcao = 0;
        do {
            System.out.println("Escolha o plano que deseja:");
            System.out.println("[1] - 50 MEGA");
            System.out.println("[2] - 100 MEGA");
            System.out.println("[3] - 150 MEGA");
            System.out.println("[4] - 200 MEGA");
            System.out.print("Qual deseja? ");

            opcao = input.nextInt();
        } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);

        switch (opcao) {
            case 1:
                this.plano.setNome("50 MEGA");
                this.plano.setPreco(109.90);
                break;
            case 2:
                this.plano.setNome("100 MEGA");
                this.plano.setPreco(149.90);
                break;
            case 3:
                this.plano.setNome("150 MEGA");
                this.plano.setPreco(159.90);
                break;
            case 4:
                this.plano.setNome("200 MEGA");
                this.plano.setPreco(189.90);
                break;
            default:
                break;
        }
    }
}
