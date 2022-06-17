/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsProductos;
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
public class daoProductos {

    private static final String SQL_SELECT = "SELECT codigo_producto, nombre_producto, codigo _linea, codigo_marca, existencia_producto, estatus_producto FROM tbl_productos";
    private static final String SQL_INSERT = "INSERT INTO tbl_productos(codigo_producto, nombre_producto, codigo _linea, codigo_marca, existencia_producto, estatus_producto) VALUES(?, ?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tbl_productos SET nombre_producto=?, codigo=?, nit_cliente=?, codigo_marca=?, existencia_producto=?, estatus_producto=?  WHERE codigo_producto = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_productos WHERE codigo_producto=?";
    private static final String SQL_QUERY = "SELECT codigo_producto, nombre_producto, codigo _linea, codigo_marca, existencia_producto, estatus_producto FROM tbl_productos WHERE codigo_producto = ?";

    public List<clsProductos> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsProductos producto = null;
        List<clsProductos> productos = new ArrayList<clsProductos>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigo_producto = rs.getInt("codigo_producto");
                String nombre_producto = rs.getString("nombre_producto");
                String codigo_linea = rs.getString("codigo_linea");
                String codigo_marca = rs.getString("codigo_marca");
                int existencia_producto = rs.getInt("existencia_producto");
                String estatus_producto = rs.getString("estatus_producto");
                
                producto = new clsProductos();
                producto.setCodigo_producto(codigo_producto);
                producto.setNombre_producto(nombre_producto);
                producto.setCodigo_linea(codigo_linea);
                producto.setCodigo_marca(codigo_marca);
                producto.setexistencia_producto(existencia_producto);
                producto.setEstatus_producto(estatus_producto);
                
                productos.add(producto);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return productos;
    }

    public int insert(clsProductos producto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, producto.getNombre_producto());
            stmt.setString(2, producto.getCodigo_linea());
             stmt.setString(3, producto.getCodigo_marca());
            stmt.setString(4, producto.getexistencia_producto());
             stmt.setString(5, producto.getCodigo_vendedor());
            stmt.setString(6, producto.getEstatus_cliente());
            


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

    public int update(clsProductos producto) {
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

    public int delete(clsProductos producto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, producto.getCodigo_cliente());
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
    public clsProductos query(clsProductos producto) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsProductos> productos = new ArrayList<clsProductos>();
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, producto.getCodigo_cliente());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigo_producto = rs.getInt("codigo_producto");
                String nombre_producto = rs.getString("nombre_producto");
                String codigo_linea = rs.getString("codigo_linea");
                String codigo_marca = rs.getString("codigo_marca");
                int existencia_producto = rs.getInt("existencia_producto");
                String estatus_producto = rs.getString("estatus_producto");
                
                producto = new clsProductos();
                producto.setCodigo_producto(codigo_producto);
                producto.setNombre_producto(nombre_producto);
                producto.setCodigo_linea(codigo_linea);
                producto.setCodigo_marca(codigo_marca);
                producto.setexistencia_producto(existencia_producto);
                producto.setEstatus_producto(estatus_producto);
                
                
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
