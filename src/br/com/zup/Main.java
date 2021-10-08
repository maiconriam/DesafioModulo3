package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	    Cliente cliente = new Cliente("Maicon", "4848484848", "maicon@maicon", "8484848");

        System.out.println(cliente);
        System.out.println("---------------");
        Vendedor vendedor = new Vendedor("Bruno", "48484884", "bruno@bruno", "4454455");
        System.out.println(vendedor);

        System.out.println("-----------");
        Venda venda = new Venda("Caixa", 8.5, "12/03/1993", vendedor, cliente);

        System.out.println(venda);
    }
}
