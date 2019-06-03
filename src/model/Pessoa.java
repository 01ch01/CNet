package model;

import java.util.Scanner;

abstract public class Pessoa extends javax.swing.JFrame{
    final protected Scanner input = new Scanner(System.in);
    
    protected String nome;
    protected String endereco;
    protected String email;
    protected String telefone;

    public Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.email = "";
        this.telefone = "";
    }
    
    public void preencher(){
        System.out.println("Endereço Residencial: ");
        this.endereco = input.nextLine();
        System.out.println("E-mail: ");
        this.email = input.nextLine();
        System.out.println("Telefone: ");
        this.telefone = input.nextLine();
    }
    
    public void imprimir(){
        System.out.println("Endereço Residencial: " + this.endereco);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
