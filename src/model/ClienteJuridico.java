package model;

abstract public class ClienteJuridico extends Cliente {

    protected String cnpj;

    public ClienteJuridico() {
        super();
        this.cnpj = "";
    }

    @Override
    public void preencher() {
        System.out.println("CADASTRO DE CLIENTE EMPRESARIAL");
        System.out.println("Razão Social: ");
        super.nome = input.nextLine();
        System.out.println("CNPJ: ");
        this.cnpj = input.nextLine();
        super.preencher();
    }

    @Override
    public void imprimir() {
        System.out.println("DADOS CADASTRAIS");
        System.out.println("Razão Social: " + super.nome);
        System.out.println("CNPJ: " + this.cnpj);
        super.imprimir(); 
    }
    
    
    
    

}
