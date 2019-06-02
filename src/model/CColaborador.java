package model;

public class CColaborador extends ClienteFisico {
    private double a;
    public CColaborador() {
        super();
//        if ("05 MEGA".equals(super.plano.getNome())) {
//            super.plano.setPreco(0.0);
//        } else {
//            super.plano.setPreco(super.plano.getPreco() - 44.90);
//        }
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
