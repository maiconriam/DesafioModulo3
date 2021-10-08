package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email, String telefone) throws Exception{
        validarEmail(email);
        verificarEmailExistente(email);
        verificarCpfRepetido(cpf);
        Cliente cliente = new Cliente(nome, cpf, email, telefone);
        clientes.add(cliente);
        return cliente;
    }

    public static void mostrarListaClientes(){
        for (Cliente referencia : clientes){
            System.out.println(referencia);
        }
    }

    public static String validarEmail(String email) throws Exception{
        if(email.contains("@")){
            return email;
        }
        throw new Exception("E-mail invalido");
    }

    public static void verificarCpfRepetido(String cpf)throws Exception{
        for(Cliente referencia : clientes){
            if(referencia.getCpf().equals(cpf)){
                throw new Exception("CPF já cadastrado");
            }
        }
    }

    public static void verificarEmailExistente(String email) throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getEmail().equals(email)){
                throw new Exception("Email ja cadastrado");
            }
        }
    }

    public static Cliente pesquisarCliente(String cpf) throws Exception{
        for (Cliente referencia : clientes){
            if (referencia.getCpf().equals(cpf)){
                return referencia;
            }
        }
        throw new Exception("Nenhum cpf cadastrado");
    }

    public static Cliente pesquisarCpfDoClienteCadastrado(String cpf)throws Exception{
        for (Cliente referencia : clientes){
            if(referencia.getCpf().equals(cpf)){
                System.out.println(referencia);
            }
        }
        throw new Exception("CPF não cadastrado");
    }
}

