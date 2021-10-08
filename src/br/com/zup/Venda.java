package br.com.zup;

public class Venda {
    private String nomeDoProduto;
    private double valorDoProduto;
    private String dataDeRegistro;
    private Vendedor vendedor;
    private Cliente cliente;

    public Venda(String nomeDoProduto, double valorDoProduto, String dataDeRegistro, Vendedor vendedor, Cliente cliente) {
        this.nomeDoProduto = nomeDoProduto;
        this.valorDoProduto = valorDoProduto;
        this.dataDeRegistro = dataDeRegistro;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Produto: " + nomeDoProduto);
        retorno.append("Valor do Produto: " + valorDoProduto);
        retorno.append("Data do Registro: " + dataDeRegistro);
        retorno.append("Vendedor: " + vendedor);
        retorno.append("Cliente: " + cliente);
        return retorno.toString();
    }
}
