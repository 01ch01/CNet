package model;

abstract public class ClienteJuridico extends Cliente {

    protected String cnpj;

    public ClienteJuridico() {
        super();
        this.cnpj = "";
    }

    @Override
    public void preencher() {
        super.preencher();
        System.out.println("CNPJ: ");
        this.cnpj = input.nextLine();
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("CNPJ: " + this.cnpj);
    }
    
    
    
    

}
