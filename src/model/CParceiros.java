package model;

public class CParceiros extends ClienteJuridico {

    protected double taxaAluguel;

    public CParceiros() {
        super();
        this.taxaAluguel = 0.0;

//        if ("05 MEGA".equals(super.plano.getNome())) {
//            super.plano.setPreco(0.0);
//        } else {
//            super.plano.setPreco(super.plano.getPreco() - 44.90);
//        }
    }

    public double getTaxaAluguel() {
        return taxaAluguel;
    }

    public void setTaxaAluguel(double taxaAluguel) {
        this.taxaAluguel = taxaAluguel;
    }

    @Override
    public void imprimir() {
        if ("05 MEGA".equals(super.plano.getNome())) {
            super.plano.setPreco(0.0);
        } else {
            super.plano.setPreco(super.plano.getPreco() - 44.90);
        }
        super.imprimir();
    }
    
    
}
