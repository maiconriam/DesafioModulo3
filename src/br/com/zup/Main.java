package br.com.zup;

public class Main {

    public static void main(String[] args) {
        //Loop para continuar rodando o executar até o usuario pedir para sair, mesmo com erro de exception
        boolean continuarMenu = true;
        while (continuarMenu){
            try {
                continuarMenu = Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }

    }
}
