package model;

public class AtendimentoComercial extends Funcionario{
    private int contrato, cancelados;
    public AtendimentoComercial() {
        super();
        super.txBonificacao = 100.00;
        this.contrato = 100;
        this.cancelados = 15;
    }

    @Override
    public double getGratificacao() {
        System.out.println("\n[Atendimento Comercial] ");
        if(this.contrato > this.cancelados){
            return super.txBonificacao;
        }
        else
            return 0;
    }
}
