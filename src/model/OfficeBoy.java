/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 29, 2019 at 1:30:15 PM
 * @version 0.1
 */
package model;

public class OfficeBoy extends Funcionario {

    protected double taxaBoleto;

    public OfficeBoy() {
        super();
        this.taxaBoleto = 0.1;
    }

    public double getTaxaBoleto() {
        return taxaBoleto;
    }

    public void setTaxaBoleto(double taxaBoleto) {
        this.taxaBoleto = taxaBoleto;
    }

}
