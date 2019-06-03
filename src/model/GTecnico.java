package model;

import controller.Autenticavel;

public class GTecnico extends Gerente implements Autenticavel{

    public GTecnico() {
        super();
        super.cargo = "Gerente Técnico";
        super.salario = 5000;
        super.txBonificacao = 0.20;
        super.grupoSubordinado = "Setor Técnico";
    }

    @Override
    public String grupoGerenciado() {
        return super.grupoSubordinado;
    }

    @Override
    public void autenticar(String senha) {
        String nome = "";
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
        System.out.println("\n[Gratificação Gerente Técnico]");
        return super.salario * this.txBonificacao;
    }
    
    
}
