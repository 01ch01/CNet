package model;

abstract public class ClienteFisico extends Cliente {

    protected String cpf;

    public ClienteFisico() {
        super();
        this.cpf = "";
    }

    @Override
    public void preencher() {
        System.out.println("CADASTRO DE CLIENTE");
        System.out.println("Nome: ");
        super.nome = input.nextLine();
        System.out.println("CPF: ");
        this.cpf = input.nextLine();
        super.preencher(); 
    }

    @Override
    public void imprimir() {
        System.out.println("INFORMAÇÕES CADASTRAIS");
        System.out.println("Nome Completo: " + super.nome);
        System.out.println("CPF: " + this.cpf);
        super.imprimir(); 
    }
}
