package model;

public class TecnicoExterno extends Funcionario {

    public TecnicoExterno() {
        super();
        super.cargo = "Técnico Externo";
        super.salario = 1500;
        super.txBonificacao = super.salario/2;
    }

    @Override
    public double getGratificacao() {
        System.out.println("\n[Gratificação Técnico Externo]");
        return super.txBonificacao;
    }
}
