package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    public static List<Vendedor> vendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, String ctps) throws Exception{
        ServicoCliente.validarEmail(email);
        Vendedor vendedor = new Vendedor(nome, cpf, email, ctps);
        vendedores.add(vendedor);
        return vendedor;
    }

    public static void mostrarListaVendedores(){
        for(Vendedor referencia : vendedores){
            System.out.println(referencia);
        }
    }
}
