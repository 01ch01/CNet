/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @version 0.1
 * @since May 29, 2019 at 1:27:24 PM
 */
package model;

abstract public class Funcionario extends Pessoa {

    protected double salario;
    protected String cpf;
    protected String anoAdmissao;
    protected String formacao;
    protected double bonificacao;

    public Funcionario() {
        super();
        this.setSalario(0.0);
        this.setCpf("");
        this.setAnoAdmissao("");
        this.setFormacao("N/A");
        this.setBonificacao(0.0);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(String anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
