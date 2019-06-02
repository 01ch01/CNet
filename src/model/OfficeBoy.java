package model;

public class OfficeBoy extends Funcionario {

    protected double taxaBoleto;
    protected double qtdBoleto;

    public OfficeBoy() {
        super();
        this.taxaBoleto = 0.1;
        this.qtdBoleto = 2000.00;
    }

    public double getTaxaBoleto() {
        return taxaBoleto;
    }

    public void setTaxaBoleto(double taxaBoleto) {
        this.taxaBoleto = taxaBoleto;
    }

    @Override
    public double getGratificacao() {
        System.out.println("\n[Gratificação Office Boy] ");
        return this.qtdBoleto*this.taxaBoleto;
    }
    
    
}
