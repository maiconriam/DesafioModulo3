package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Sistema.cadastrarVenda();
        ServicoCliente.mostrarListaClientes();
        ServicoVendedor.mostrarListaVendedores();
        ServicoVenda.mostrarVendas();
    }
}
