package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fatec.poo.model.Pedido;
import fatec.poo.model.Cliente;
import fatec.poo.model.Vendedor;

public class DaoPedido
{

    private Connection conn;

    public DaoPedido(Connection conn)
    {
        this.conn = conn;
    }

    public Pedido consultar(String numero)
    {
        Pedido pedido = null;
        try
        {
            PreparedStatement ps = conn.prepareStatement("select * from pooPedido where numero = ?");
            ps.setString(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                pedido = new Pedido(rs.getString("numero"));
                pedido.setDataEmissao(rs.getString("dataEmissao"));
                
                Cliente cliente = new DaoCliente(conn).consultar(rs.getString("cliente"));
                Vendedor vendedor = new DaoVendedor(conn).consultar(rs.getString("vendedor"));
                
                pedido.setCliente(cliente);
                pedido.setVendedor(vendedor);
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.toString());
        }
        return pedido;
    }
}
