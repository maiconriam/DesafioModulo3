package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    public static List<Vendedor> vendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, String ctps){
        Vendedor vendedor = new Vendedor(nome, cpf, email, ctps);
        vendedores.add(vendedor);
        return vendedor;
    }
}
