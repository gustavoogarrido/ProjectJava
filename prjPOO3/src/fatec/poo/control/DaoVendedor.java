/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class DaoVendedor {
    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }    
    
    public Vendedor consultar (String cpf) {
        Vendedor vendedor = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from pooVendedor where CPF = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vendedor = new Vendedor(rs.getString("cpf"), rs.getString("nome"), rs.getDouble("salarioBase"));
                vendedor.setEndereco(rs.getString("endereco"));
                vendedor.setCidade(rs.getString("cidade"));
                vendedor.setCep(rs.getString("cep"));
                vendedor.setUf(rs.getString("uf"));
                vendedor.setDdd(rs.getString("ddd"));
                vendedor.setTelefone(rs.getString("telefone"));
                vendedor.setTaxaComissao(rs.getDouble("taxaComissao"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(vendedor);
    }    
     
    public String inserir(Vendedor vendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("insert into pooVendedor(cpf, nome, endereco, cidade, cep, uf, ddd, telefone, salariobase, taxacomissao) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getTaxaComissao());
            ps.execute();
            return "Vendedor incluido com sucesso!";
        } catch (SQLException ex) {
             System.out.println(ex.toString());
             return "";
        }
    }  
    
    public String alterar(Vendedor vendedor) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("update pooVendedor set cpf = ?, nome = ?, endereco = ?, cidade = ?, cep = ?, uf = ?, ddd = ?, telefone = ?, SalarioBase = ?, TaxaComissao = ? where cpf = ?");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getCidade());
            ps.setString(5, vendedor.getCep());
            ps.setString(6, vendedor.getUf());
            ps.setString(7, vendedor.getDdd());
            ps.setString(8, vendedor.getTelefone());
            ps.setDouble(9, vendedor.getSalarioBase());
            ps.setDouble(10, vendedor.getTaxaComissao());
            ps.setString(11, vendedor.getCpf());
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
            ps = conn.prepareStatement("delete from pooVendedor where cpf = ?");
            ps.setString(1, cpf);
            ps.execute();
            return "Dados excluídos com sucesso!";
        } catch (SQLException ex) {
             System.out.println(ex.toString());
             return "";
        }
    }
}
