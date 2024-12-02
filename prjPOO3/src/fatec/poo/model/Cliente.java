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
public class Cliente extends Pessoa
{

    private double limiteCredito, limiteDisponivel;
    private ArrayList<Pedido> pedido;

    public Cliente(String cpf, String nome, double limiteCredito)
    {
        super(cpf, nome);
        this.limiteCredito = limiteCredito;
        this.limiteDisponivel = limiteCredito;
        pedido = new ArrayList<>();
    }

    public boolean addPedido(Pedido pedido)
    {
        if (limiteDisponivel >= pedido.getValor())
        {
            this.pedido.add(pedido);
            limiteDisponivel -= pedido.getValor();
            return true;
        } else
        {
            return false;
            //throw new Exception("Não é possível adicionar pedido (Saldo insuficiente");
        }
    }

    public void removePedido(Pedido pedido)
    {
        this.pedido.remove(pedido);

        limiteDisponivel += pedido.getValor();
    }

    public void setLimiteDisponivel(double limiteDisponivel)
    {
        this.limiteDisponivel = limiteDisponivel;
    }

    public void setLimiteCredito(double limiteCredito)
    {
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito()
    {
        return limiteCredito;
    }

    public double getLimiteDisponivel()
    {
        return limiteDisponivel;
    }
}
