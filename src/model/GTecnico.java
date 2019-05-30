/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 29, 2019 at 1:31:14 PM
 * @version 0.1
 */
package model;

import controller.Autenticavel;

public class GTecnico extends Gerente implements Autenticavel {

    public GTecnico() {
        super();
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

}
