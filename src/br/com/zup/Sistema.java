package br.com.zup;

import java.util.Scanner;

public class Sistema {
    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu(){
        System.out.println("Digite 1: Para cadastrar Venda");
        System.out.println("Digite 2: Para verificar lista de vendas");
        System.out.println("Digite 3: Para verificar lista de clientes");
        System.out.println("Digite 4: Para verificar lista de vendedores");
        System.out.println("Digite 5: Para sair do programa");
    }

    public static Cliente cadastrarCliente(){
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();
        String telefone = capturarDados("Digite o telefone do cliente").nextLine();

        Cliente cliente = ServicoCliente.cadastrarCliente(nome, cpf, email, telefone);
        return cliente;
    }

    public static Vendedor cadastrarVendedor(){
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendendor: ").nextLine();
        String email = capturarDados("Digite o email do vendendor: ").nextLine();
        String ctps = capturarDados("Digite o CTPS do vendedor").nextLine();

        Vendedor vendedor = ServicoVendedor.cadastrarVendedor(nome, cpf, email,ctps);
        return vendedor;
    }

    public static Venda cadastrarVenda(){
        String nomeDoProduto = capturarDados("Digite o nome do produto:").nextLine();
        double valor = capturarDados("Qual o valor do produto?").nextDouble();
        String dataDeRegistro = capturarDados("Qual a data de registo?").nextLine();

        Cliente cliente = cadastrarCliente();
        Vendedor vendedor = cadastrarVendedor();
        Venda venda = ServicoVenda.cadastrarVenda(nomeDoProduto, valor, dataDeRegistro, vendedor, cliente);
        return venda;
    }
}
