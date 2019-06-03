package model;

public class Funcionario extends Pessoa {

    protected double salario;
    protected String cpf;
    protected String anoAdmissao;
    protected String cargo;
    protected double txBonificacao;

    public Funcionario() {
        super();
        this.setSalario(0.0);
        this.setCpf("");
        this.setAnoAdmissao("");
        this.setCargo("N/A");
        this.settxBonificacao(0.0);
    }

    @Override
    public void preencher() {
        System.out.println("\n --CADASTRO DE COLABORADOR --");
        super.preencher();
        System.out.println("CPF: ");
        this.cpf = input.nextLine();
        System.out.println("Salário: R$ ");
        this.salario = input.nextDouble();
        input.nextLine();
        System.out.println("Cargo: ");
        this.cargo = input.nextLine();
        System.out.println("Ano de Admissão: ");
        this.anoAdmissao = input.nextLine();
    }

    @Override
    public void imprimir() {
        System.out.println("\n -- INFORMAÇÕES CADASTRAIS --");
        super.imprimir();
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Ano de Admissão: " + this.anoAdmissao);
        System.out.println("--");
    }

    public double getGratificacao() {
        return this.salario * this.txBonificacao;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String formacao) {
        this.cargo = formacao;
    }

    public double gettxBonificacao() {
        return txBonificacao;
    }

    public void settxBonificacao(double txBonificacao) {
        this.txBonificacao = txBonificacao;
    }
    
    public double mostrarGratificacao(Funcionario aux){
        double result = 0.0;
        result = aux.getGratificacao();
       
        return result;
    }
}
