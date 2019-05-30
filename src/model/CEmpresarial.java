/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @version 0.1
 * @since May 29, 2019 at 1:29:32 PM
 */
package model;

import controller.PlanosEspeciais;

public class CEmpresarial extends ClienteJuridico implements PlanosEspeciais {

    public CEmpresarial() {
        super();
    }

    @Override
    public double definirPreco(double velocidade) {
        if ((velocidade >= 50) && (velocidade <= 60)) {
            return 149.90;
        } else if ((velocidade > 60) && (velocidade <= 70)) {
            return 179.99;
        } else if ((velocidade > 70) && (velocidade <= 80)) {
            return 209.99;
        } else if ((velocidade > 80) && (velocidade <= 90)) {
            return 230.00;
        } else if ((velocidade > 90) && (velocidade <= 100)) {
            return 260.00;
        }
        return -1;
    }

}
