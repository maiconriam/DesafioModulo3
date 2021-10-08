package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    //Cadastrar vendas e adicionar na lista vedas
    public static Venda cadastrarVenda(String nomeDoProduto, double valor, String dataDeRegistro, String email, String cpf) throws Exception{
        Cliente cliente = ServicoCliente.pesquisarCliente(cpf);
        ServicoCliente.validarEmail(email);
        Vendedor vendedor = ServicoVendedor.pesquisarVendedor(email);

        Venda venda = new Venda(nomeDoProduto, valor, dataDeRegistro, vendedor, cliente);
        vendas.add(venda);
        return venda;
    }

    //Mostrar toda a lista de vendas para o usuario
    public static void mostrarVendas(){
        for(Venda refencia : vendas){
            System.out.println(refencia);
        }
    }

    //Metodo para pesquisar se o cpf do cliente esta na lista de vendas
    public static List<Venda> pesquisarVendaCliente(String cpf){
        List<Venda> vendasCliente = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getCliente().getCpf().equals(cpf)){
                vendasCliente.add(referencia);
            }
        }
        return vendasCliente;
    }

    //Metodo para pesquisar se o email do vendedor está na lista de vendas
    public static List<Venda> pesquisarVendaVendedor(String email){
        List<Venda> vendasVendedor = new ArrayList<>();
        for (Venda referencia : vendas){
            if (referencia.getVendedor().getEmail().equals(email)){
                vendasVendedor.add(referencia);
            }
        }
        return vendasVendedor;
    }
}
