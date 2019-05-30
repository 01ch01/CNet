/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 29, 2019 at 1:27:58 PM
 * @version 0.1
 */
package model;

public class CParceiros extends ClienteJuridico {

    protected double taxaAluguel;

    public CParceiros() {
        super();
        this.taxaAluguel = 0.0;

        if ("05 MEGA".equals(super.plano.getNome())) {
            super.plano.setPreco(0.0);
        } else {
            super.plano.setPreco(super.plano.getPreco() - 44.90);
        }
    }

    public double getTaxaAluguel() {
        return taxaAluguel;
    }

    public void setTaxaAluguel(double taxaAluguel) {
        this.taxaAluguel = taxaAluguel;
    }
}
