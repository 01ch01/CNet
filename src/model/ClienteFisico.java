/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 29, 2019 at 2:46:51 PM
 * @version 0.1
 */
package model;

abstract public class ClienteFisico extends Cliente {

    protected String cpf;

    public ClienteFisico() {
        super();
        this.cpf = "";
    }

}
