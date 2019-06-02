package model;

abstract public class Gerente extends Funcionario{

    protected String senha;
    public String grupoSubordinado;

    public Gerente() {
        super();
        this.senha = "";
        this.grupoSubordinado = "";
    }
    
    public String grupoGerenciado(){
        System.out.println("Informe o grupo gerenciado: ");
        return this.grupoSubordinado = input.nextLine();
    }
    public String getGrupoSubordinado() {
        return grupoSubordinado;
    }

    public void setGrupoSubordinado(String grupoSubordinado) {
        this.grupoSubordinado = grupoSubordinado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
