/**
 * Cnet - Esquema hierárquico de um provedor de internet.
 * Insira aqui uma pequena descrição sobre o mesmo.
 * @author Cláudio Henrique <https://github.com/01ch01> e Cristiane Freitas <https://github.com/tiianyf>.
 * @since May 29, 2019 at 1:25:54 PM
 * @version 0.1
// */

package br.com.cnet;

import model.*;

public class  CNet {

    public static void main(String[] args) {
//        Funcionario f = new Funcionario();
//        Funcionario o = new OfficeBoy();
//        Funcionario e = new TecnicoExterno();
//        System.out.println(f.mostrarGratificacao(o));
//        System.out.println(f.mostrarGratificacao(e));

        Gerente g = new Gerente();
        Gerente a = new GAdministrativo();
        Gerente b = new GTecnico();
        System.out.println(g.mostrarGrupo(a, b));
        
    }
}
