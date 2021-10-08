package br.com.zup;

public class Main {

    public static void main(String[] args) {
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
