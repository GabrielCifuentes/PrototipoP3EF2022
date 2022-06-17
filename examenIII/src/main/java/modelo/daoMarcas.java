/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsMarcas;
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
public class daoMarcas {

    private static final String SQL_SELECT = "SELECT codigo_marcas, nombre_marca, estatus_marca FROM tbl_marcas";
    private static final String SQL_INSERT = "INSERT INTO tbl_marcas(codigo_marcas, nombre_marca, estatus_marca) VALUES(?, ?,?)";
    private static final String SQL_UPDATE = "UPDATE tbl_marcas SET nombre_marca=?, estatus_marca=?,  WHERE codigo_marcas = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_marcas WHERE codigo_marcas=?";
    private static final String SQL_QUERY = "SELECT codigo_marcas, nombre_marca, estatus_marca   FROM tbl_marcas WHERE codigo_marcas = ?";

    public List<clsMarcas> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsMarcas marca = null;
        List<clsMarcas> marcas = new ArrayList<clsMarcas>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigo_marcas = rs.getInt("codigo_marcas");
                String nombre_marca = rs.getString("nombre_marca");
                String estatus_marca = rs.getString("estatus_marca");
                
                
                marca = new clsMarcas();
                marca.setCodigo_marcas(codigo_marcas);
                marca.setNombre_marca(nombre_marca);
                marca.setEstatus_marca(estatus_marca);
             
                
                marcas.add(marca);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return marcas;
    }

    public int insert(clsMarcas marca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, marca.getNombre_marca());
            stmt.setString(2, marca.getEstatus_marca());
            
            
            


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

    public int update(clsMarcas marca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            
             stmt.setString(1, marca.getNombre_marca());
            stmt.setString(2, marca.getEstatus_marca());
            

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

    public int delete(clsMarcas marca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, marca.getCodigo_marcas());
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
    public clsMarcas query(clsMarcas marca) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsMarcas> marcas = new ArrayList<clsMarcas>();
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, marca.getCodigo_marcas());
            rs = stmt.executeQuery();
            while (rs.next()) {
                     int codigo_marcas = rs.getInt("codigo_marcas");
                String nombre_marca = rs.getString("nombre_marca");
                String estatus_marca = rs.getString("estatus_marca");
                
                
                marca = new clsMarcas();
                marca.setCodigo_marcas(codigo_marcas);
                marca.setNombre_marca(nombre_marca);
                marca.setEstatus_marca(estatus_marca);
                
                
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
        return marca;
    }
        
}
