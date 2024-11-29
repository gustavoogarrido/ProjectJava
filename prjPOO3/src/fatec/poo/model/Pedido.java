/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author gusta
 */
public class Pedido {
    private String numero, dataEmissao;
    private double valor;
    private Cliente cliente;
    private Vendedor vendedor;
    
    public Pedido(String numero){
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public double getValor() {
        return valor;
    }
}
