/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 29, 2019 at 1:30:52 PM
 * @version 0.1
 */
package model;

abstract public class Gerente extends Funcionario {

    protected String senha;
    protected int qtdSubordinados;

    public Gerente() {
        super();
        this.senha = "";
        this.qtdSubordinados = -1;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQtdSubordinados() {
        return qtdSubordinados;
    }

    public void setQtdSubordinados(int qtdSubordinados) {
        this.qtdSubordinados = qtdSubordinados;
    }

}
