package model;

import controller.Autenticavel;
public class Analista extends Funcionario implements Autenticavel {
    private String senha;
    public Analista() {
        super();
        super.cargo = "Analista de Rede";
        super.txBonificacao = 0.08;
        this.senha = "";
    }
    
    @Override
    public void autenticar(String senha) {
        String nome;
        System.out.println("Informe o roteador: ");
        nome = input.nextLine();
        System.out.println("Senha: ");
        senha = input.nextLine();
        if(this.senha.equals(senha)){
            System.out.println("Acesso autorizado!");
        }
        else
            System.out.println("Acesso negado!");
    }

    @Override
    public double getGratificacao() {
        System.out.println("\n[Gratificação Analista]");
        return super.salario * super.txBonificacao;
    }
}
