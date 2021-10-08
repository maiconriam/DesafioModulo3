package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    //Metodo para pegar dados digitados pelo usuario
    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Menu do programa
    public static void menu(){
        System.out.println("Digite 1: Para cadastrar um cliente");
        System.out.println("Digite 2: Para cadastrar um vendedor");
        System.out.println("Digite 3: Para cadastrar Venda");
        System.out.println("Digite 4: Para verificar lista de vendas");
        System.out.println("Digite 5: Para verificar lista de clientes");
        System.out.println("Digite 6: Para verificar lista de vendedores");
        System.out.println("Digite 7: Para pesquisar as vendas de um cliente:");
        System.out.println("Digite 8: Para pesquisar as vendas de um vendedor:");
        System.out.println("Digite 9: Para sair do programa");
    }

    //Metodo para receber informações do usuario para cadastrar um cliente
    public static Cliente cadastrarCliente() throws Exception{
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String cpf = capturarDados("Digite o cpf do cliente: ").nextLine();
        String email = capturarDados("Digite o email do cliente: ").nextLine();
        String telefone = capturarDados("Digite o telefone do cliente").nextLine();

        Cliente cliente = ServicoCliente.cadastrarCliente(nome, cpf, email, telefone);
        return cliente;
    }

    //Metodo para receber informações do usuario para cadastrar um vendedor
    public static Vendedor cadastrarVendedor()throws Exception{
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Digite o cpf do vendendor: ").nextLine();
        String email = capturarDados("Digite o email do vendendor: ").nextLine();
        String ctps = capturarDados("Digite o CTPS do vendedor").nextLine();

        Vendedor vendedor = ServicoVendedor.cadastrarVendedor(nome, cpf, email,ctps);
        return vendedor;
    }

    //Metodo para receber informações do usuario para cadastrar uma venda
    public static Venda cadastrarVenda()throws Exception{
        String nomeDoProduto = capturarDados("Digite o nome do produto:").nextLine();
        double valor = capturarDados("Qual o valor do produto?").nextDouble();
        String dataDeRegistro = capturarDados("Qual a data de registo?").nextLine();
        String cpfCliente = capturarDados("Qual o cpf do cliente para essa venda?").nextLine();
        String emailDoVendedor = capturarDados("Qual o e-mail do vendedor para essa venda?").nextLine();

        Venda venda = ServicoVenda.cadastrarVenda(nomeDoProduto, valor, dataDeRegistro, emailDoVendedor, cpfCliente);
        return venda;
    }

    //Metodo para pegar o cpf digitado pelo usuario e percorrer a lista para verificar se existe esse cpf na lista
    public static List<Venda> pesquisarVendaCliente() throws Exception{
        String cpf = capturarDados("Digite o cpf que deseja pesquisar:").nextLine();

        List<Venda> vendas = ServicoVenda.pesquisarVendaCliente(cpf);
        return vendas;
    }

    //Metodo para pegar o email digitado pelo usuario e percorrer a lista para verificar se existe esse email na lista
    public static List<Venda> pesquisarVendaVendedor() throws Exception{
        String email = capturarDados("Digite o email que deseja pesquisar:").nextLine();

        List<Venda> vendas = ServicoVenda.pesquisarVendaVendedor(email);
        return vendas;
    }

    //Metodo para executar todos os metodos do sistema para executar na main
    public static boolean executar()throws Exception{
        boolean menu = true;

        while (menu){
            menu();
            int escolhaMenu = capturarDados("Digite sua escolha:").nextInt();

            if(escolhaMenu == 1){
                cadastrarCliente();
            }
            if(escolhaMenu == 2){
                cadastrarVendedor();
            }
            if(escolhaMenu == 3){
                cadastrarVenda();
            }
            if(escolhaMenu == 4){
                ServicoVenda.mostrarVendas();
            }
            if(escolhaMenu == 5){
                ServicoCliente.mostrarListaClientes();
            }
            if(escolhaMenu == 6){
                ServicoVendedor.mostrarListaVendedores();
            }
            if(escolhaMenu == 7){
                System.out.println(pesquisarVendaCliente());
            }
            if(escolhaMenu == 8){
                System.out.println(pesquisarVendaVendedor());
            }
            if(escolhaMenu == 9){
                System.out.println("Programa finalizado");
                menu = false;
            }
        }
        return menu;
    }
}
