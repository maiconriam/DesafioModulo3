package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    public static List<Vendedor> vendedores = new ArrayList<>();

    //Cadastrar vendedor e adicionar na lista de vendedores
    public static Vendedor cadastrarVendedor(String nome, String cpf, String email, String ctps) throws Exception{
        ServicoCliente.validarEmail(email);
        verificarEmailExistente(email);
        verificarCpfRepetido(cpf);
        Vendedor vendedor = new Vendedor(nome, cpf, email, ctps);
        vendedores.add(vendedor);
        return vendedor;
    }

    //Mostrar lista de vendedores para usuario
    public static void mostrarListaVendedores(){
        for(Vendedor referencia : vendedores){
            System.out.println(referencia);
        }
    }

    //Metodo para verificar se cpf ja tem cadastrado na lista de vendedores
    public static void verificarCpfRepetido(String cpf)throws Exception{
        for(Vendedor referencia : vendedores){
            if(referencia.getCpf().equals(cpf)){
                throw new Exception("CPF já cadastrado");
            }
        }
    }

    //Metodo para verificar se email ja tem cadastrado na lista de vendedores
    public static void verificarEmailExistente(String email) throws Exception{
        for (Vendedor referencia : vendedores){
            if (referencia.getEmail().equals(email)){
                throw new Exception("Email ja cadastrado");
            }
        }
    }

    //Metodo para verificar se tem um email digitado pelo usuario na lista de vendedores
    public static Vendedor pesquisarVendedor(String email) throws Exception{
        for (Vendedor referencia : vendedores){
            if (referencia.getEmail().equals(email)){
                return referencia;
            }
        }
        throw new Exception("Nenhum email cadastrado");
    }
}
