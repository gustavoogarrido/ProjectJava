package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fatec.poo.model.Pedido;
import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;
import java.sql.Date;
import java.text.DateFormat;

public class DaoPedido
{

    private Connection conn;

    public DaoPedido(Connection conn)
    {
        this.conn = conn;
    }

    public Pedido consultar(int numero)
    {
        Pedido pedido = null;
        try
        {
            PreparedStatement ps = conn.prepareStatement("select * from pooPedido where numero = ?");
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                pedido = new Pedido(rs.getString("numero"));
                pedido.setDataEmissao(rs.getDate("dataEmissao").toString());
                pedido.setValor(rs.getDouble("valor"));

                Cliente cliente = new DaoCliente(conn).consultar(rs.getString("cliente"));
                Vendedor vendedor = new DaoVendedor(conn).consultar(rs.getString("vendedor"));

                pedido.setCliente(cliente);
                pedido.setVendedor(vendedor);
            }
            rs.close();
            
            ps.close();
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return pedido;
    }

    public String incluir(Pedido pedido)
    {
        PreparedStatement ps;
        try
        {
            ps = conn.prepareStatement("insert into pooPedido(numero, dataEmissao, valor, cliente, vendedor) values (?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(pedido.getNumero()));
            ps.setDate(2, Date.valueOf(pedido.getDataEmissao()));
            ps.setDouble(3, pedido.getValor());
            ps.setString(4, pedido.getCliente().getCpf());
            ps.setString(5, pedido.getVendedor().getCpf());
            ps.execute();
            ps.close();
        } catch (SQLException ex)
        {
            System.out.println("DEU RUIM!");
        }

        return "";
    }

    public void alterar(Pedido pedido)
    {
        PreparedStatement ps;
        try
        {
            ps = conn.prepareStatement("update pooPedido set dataEmissao=?, valor=? where numero=?");
            ps.setDate(1, Date.valueOf(pedido.getDataEmissao()));
            ps.setDouble(2, pedido.getValor());
            ps.setInt(3, Integer.parseInt(pedido.getNumero()));
            ps.execute();
            ps.close();
        } catch (SQLException ex)
        {
            System.out.println("");
        }
    }

    public void excluir(int numero)
    {
        PreparedStatement ps;
        try
        {
            ps = conn.prepareStatement("delete pooPedido where numero=?");
            ps.setInt(1, numero);
            ps.execute();
            ps.close();
        } catch (SQLException ex)
        {
            System.out.println("Não existe");
        }
    }
}
