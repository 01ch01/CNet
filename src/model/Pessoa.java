/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 29, 2019 at 1:27:00 PM
 * @version 0.1
 */

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
