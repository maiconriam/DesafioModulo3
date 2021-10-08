package br.com.zup;

import java.util.Scanner;

public class Sistema {
    public static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
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
}
