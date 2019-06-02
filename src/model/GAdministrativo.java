package model;

public class GAdministrativo extends Gerente {
    public GAdministrativo() {
        super();
        super.salario = 3000;
        super.txBonificacao = 0.15;
        super.grupoSubordinado = "Atendimento Comercial + Office Boy";
    }

    @Override
    public double getGratificacao() {
        System.out.println("\n[Gratificação Gerente Administrativo] ");
        return super.salario * super.txBonificacao;
    }

    @Override
    public String grupoGerenciado() {
        return super.grupoSubordinado;
    }

  

}
