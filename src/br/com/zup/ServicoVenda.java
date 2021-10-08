package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String nomeDoProduto, double valor, String dataDeRegistro, Vendedor vendedor, Cliente cliente){

        Venda venda = new Venda(nomeDoProduto, valor, dataDeRegistro, vendedor, cliente);
        vendas.add(venda);
        return venda;
    }

    public static void mostrarVendas(){
        for(Venda refencia : vendas){
            System.out.println(refencia);
        }
    }
}