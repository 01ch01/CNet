package model;

public class TecnicoExterno extends SetorTecnico {

    public TecnicoExterno() {
        super();
        super.salario = 1500;
        super.txBonificacao = super.salario/2;
    }

    @Override
    public double getGratificacao() {
        System.out.println("\n[Técnico Externo] ");
        return super.txBonificacao;
    }
}
