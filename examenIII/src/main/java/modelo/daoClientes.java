/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visitante
 */
public class daoClientes {

    private static final String SQL_SELECT = "SELECT codigo_cliente, nombre_cliente, direccion_cliente, nit_cliente, telefono_cliente, codigo_vendedor, estatus_cliente FROM tbl_clientes";
    private static final String SQL_INSERT = "INSERT INTO tbl_clientes(codigo_cliente, nombre_cliente, direccion_cliente, nit_cliente, telefono_cliente, codigo_vendedor, estatus_cliente) VALUES(?, ?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tbl_clientes SET nombre_cliente=?, direccion_cliente=?, nit_cliente=?, telefono_cliente=?, codigo_vendedor=?, estatus_cliente=?  WHERE codigo_cliente = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_clientes WHERE codigo_cliente=?";
    private static final String SQL_QUERY = "SELECT codigo_cliente, nombre_cliente, direccion_cliente, nit_cliente, telefono_cliente, codigo_vendedor, estatus_cliente  FROM tbl_clientes WHERE codigo_cliente = ?";

    public List<clsClientes> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsClientes cliente = null;
        List<clsClientes> clientes = new ArrayList<clsClientes>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigo_cliente = rs.getInt("codigo_cliente");
                String nombre_cliente = rs.getString("nombre_cliente");
                String direccion_cliente = rs.getString("direccion_cliente");
                String nit_cliente = rs.getString("nit_cliente");
                String telefono_cliente = rs.getString("telefono_cliente");
                String codigo_vendedor = rs.getString("codigo_vendedor");
                String estatus_cliente = rs.getString("estatus_cliente");
                
                cliente = new clsClientes();
                cliente.setCodigo_cliente(codigo_cliente);
                cliente.setNombre_cliente(nombre_cliente);
                cliente.setDireccion_cliente(direccion_cliente);
                cliente.setNit_cliente(nit_cliente);
                cliente.setTelefono_cliente(telefono_cliente);
                cliente.setCodigo_vendedor(codigo_vendedor);
                cliente.setEstatus_cliente(estatus_cliente);
                
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return clientes;
    }

    public int insert(clsClientes cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cliente.getNombre_cliente());
            stmt.setString(2, cliente.getDireccion_cliente());
             stmt.setString(3, cliente.getNit_cliente());
            stmt.setString(4, cliente.getTelefono_cliente());
             stmt.setString(5, cliente.getCodigo_vendedor());
            stmt.setString(6, cliente.getEstatus_cliente());
            


            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int update(clsClientes cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cliente.getNombre_cliente());
            stmt.setString(2, cliente.getDireccion_cliente());
            stmt.setString(3, cliente.getNit_cliente());
            stmt.setString(4, cliente.getTelefono_cliente());
            stmt.setString(5, cliente.getCodigo_vendedor());
            stmt.setString(6, cliente.getEstatus_cliente());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

    public int delete(clsClientes cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cliente.getCodigo_cliente());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return rows;
    }

//    public List<Persona> query(Persona vendedor) { // Si se utiliza un ArrayList
    public clsClientes query(clsClientes cliente) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsClientes> clientes = new ArrayList<clsClientes>();
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, cliente.getCodigo_cliente());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigo_cliente = rs.getInt("codigo_cliente");
                String nombre_cliente = rs.getString("nombre_cliente");
                String direccion_cliente = rs.getString("direccion_cliente");
                String nit_cliente = rs.getString("nit_cliente");
                String telefono_cliente = rs.getString("telefono_cliente");
                String codigo_vendedor = rs.getString("codigo_vendedor");
                String estatus_cliente = rs.getString("estatus_cliente");
                
                cliente = new clsClientes();
                cliente.setCodigo_cliente(codigo_cliente);
                cliente.setNombre_cliente(nombre_cliente);
                cliente.setDireccion_cliente(direccion_cliente);
                cliente.setNit_cliente(nit_cliente);
                cliente.setTelefono_cliente(telefono_cliente);
                cliente.setCodigo_vendedor(codigo_vendedor);
                cliente.setEstatus_cliente(estatus_cliente);
                
                //vendedores.add(vendedor); // Si se utiliza un ArrayList
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        //return vendedores;  // Si se utiliza un ArrayList
        return cliente;
    }
        
}
