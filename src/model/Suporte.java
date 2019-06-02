package model;


public class Suporte extends Funcionario{
    private double ligacoesRevertidas;
    

    public Suporte() {
        super();
        this.ligacoesRevertidas = 88;
        super.salario = 1200;
    }

    @Override
    public double getGratificacao() {
        System.out.println("\n[Gratificação Suporte Técnico] ");
        if(100 <= this.ligacoesRevertidas || this.ligacoesRevertidas >= 89){
            super.settxBonificacao(150);
        }
        else if(89 < this.ligacoesRevertidas || this.ligacoesRevertidas >= 86){
            super.settxBonificacao(100);
        }
        else if(86 < this.ligacoesRevertidas || this.ligacoesRevertidas >=84){
            super.settxBonificacao(80);
        }
        else if(84 < this.ligacoesRevertidas || this.ligacoesRevertidas >= 82){
            super.settxBonificacao(60);
        }
        else if(82 < this.ligacoesRevertidas || this.ligacoesRevertidas>= 81){
            super.settxBonificacao(50);
        }
        else{
            System.out.println("Você não receberá bonificação esse mês");
        }
        System.out.println(super.txBonificacao);
        return -1;
    }
    
    
    
    
    
    
    
}
