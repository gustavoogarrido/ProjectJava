/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Vendedor extends Pessoa
{
    private double salarioBase, taxaComissao;
    private ArrayList<Pedido> pedido;

    public Vendedor(String cpf, String nome, double salarioBase)
    {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedido = new ArrayList<>();
    }

    public void addPedido(Pedido pedido)
    {
        this.pedido.add(pedido);
    }
    
    public void removePedido(Pedido pedido)
    {
        this.pedido.remove(pedido);
    }

    public void setSalarioBase(double salarioBase)
    {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao)
    {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase()
    {
        return salarioBase;
    }

    public double getTaxaComissao()
    {
        return taxaComissao;
    }

}
