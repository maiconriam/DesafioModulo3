package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String nomeDoProduto, double valor, String dataDeRegistro, Vendedor vendedor, String cpf) throws Exception{
        Cliente cliente = ServicoCliente.pesquisarCpfDoClienteCadastrado(cpf);
        Venda venda = new Venda(nomeDoProduto, valor, dataDeRegistro, vendedor, cliente);
        vendas.add(venda);
        return venda;
    }

    public static void mostrarVendas(){
        for(Venda refencia : vendas){
            System.out.println(refencia);
        }
    }

    public static List<Venda> pesquisarVendaCliente(String cpf){
        List<Venda> vendasCliente = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getCliente().getCpf().equals(cpf)){
                vendasCliente.add(referencia);
            }
        }
        return vendasCliente;
    }

    public static List<Venda> pesquisarVendaVendedor(String email){
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getCliente().getEmail().equals(email)){
                vendasVendedor.add(referencia);
            }
        }
        return vendasVendedor;
    }
}
