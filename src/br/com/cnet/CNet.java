/**
 * Cnet - Esquema hierárquico de um provedor de internet.
 * Projeto criado para demonstrar/aplicar todos os conceitos de Orientação a
 * Objetos
 *
 * @author Cláudio Henrique <https://github.com/01ch01> e Cristiane Freitas
 * <https://github.com/tiianyf>.
 * @since May 29, 2019 at 1:25:54 PM
 * @version 0.1 //
 */
package br.com.cnet;

import model.*;

public class CNet {

    public static void main(String[] args) {
        Cliente comum = new CComum();
        Cliente parceiro = new CParceiros();

        comum.getPlano();
        parceiro.getPlano();

    }
}
