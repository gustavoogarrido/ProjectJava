/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class DaoCliente {
    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }    
    
    public Cliente consultar (String cpf) {
        Cliente cliente = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from pooCliente where cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente(rs.getString("cpf"), rs.getString("nome"), rs.getDouble("limiteCredito"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setCep(rs.getString("cep"));
                cliente.setUf(rs.getString("uf"));
                cliente.setDdd(rs.getString("ddd"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setLimiteDisponivel(rs.getDouble("limiteDisponivel"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(cliente);
    }    
     
    public String inserir(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("insert into pooCliente(cpf, nome, endereco, cidade, cep, uf, ddd, telefone, limitecredito, limitedisponivel) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setDouble(9, cliente.getLimiteCredito());
            ps.setDouble(10, cliente.getLimiteDisponivel());
            ps.execute();
            return "Cliente incluido com sucesso!";
        } catch (SQLException ex) {
             System.out.println(ex.toString());
             return "";
        }
    }  
    
    public String alterar(Cliente cliente) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("update pooCliente set cpf = ?, nome = ?, endereco = ?, cidade = ?, cep = ?, uf = ?, ddd = ?, telefone = ?, limiteCredito = ?, limiteDisponivel = ? where cpf = ?");
            ps.setString(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getCidade());
            ps.setString(5, cliente.getCep());
            ps.setString(6, cliente.getUf());
            ps.setString(7, cliente.getDdd());
            ps.setString(8, cliente.getTelefone());
            ps.setDouble(9, cliente.getLimiteCredito());
            ps.setDouble(10, cliente.getLimiteDisponivel());
            ps.setString(11, cliente.getCpf());
            ps.execute();
            return "Dados alterados com sucesso!";
        } catch (SQLException ex) {
             System.out.println(ex.toString()); 
             return "";
        }
    }
    
    public String excluir(String cpf) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("delete from pooCliente where cpf = ?");
            ps.setString(1, cpf);
            ps.execute();
            return "Dados excluídos com sucesso!";
        } catch (SQLException ex) {
             System.out.println(ex.toString());
             return "";
        }
    }
}
