/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsLineas;
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
public class daoLineas {

    private static final String SQL_SELECT = "SELECT codigo_linea, nombre_linea, estatus_linea FROM tbl_lineas";
    private static final String SQL_INSERT = "INSERT INTO tbl_lineas(nombre_linea, estatus_linea) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE tbl_lineas SET nombre_linea=?, estatus_linea=?,  WHERE codigo_linea = ?";
    private static final String SQL_DELETE = "DELETE FROM tbl_lineas WHERE codigo_linea=?";
    private static final String SQL_QUERY = "SELECT codigo_linea, nombre_linea, estatus_linea   FROM tbl_lineas WHERE codigo_linea = ?";

    public List<clsLineas> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clsLineas linea = null;
        List<clsLineas> lineas = new ArrayList<clsLineas>();

        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int codigo_linea = rs.getInt("codigo_linea");
                String nombre_linea = rs.getString("nombre_linea");
                String estatus_linea = rs.getString("estatus_linea");
                
                
                linea = new clsLineas();
                linea.setCodigo_linea(codigo_linea);
                linea.setNombre_linea(nombre_linea);
                linea.setEstatus_linea(estatus_linea);
             
                
                lineas.add(linea);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            clsConexion.close(rs);
            clsConexion.close(stmt);
            clsConexion.close(conn);
        }

        return lineas;
    }

    public int insert(clsLineas linea) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = clsConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, linea.getNombre_linea());
            stmt.setString(2, linea.getEstatus_linea());
            
            
            


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

    public int update(clsLineas linea) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, linea.getNombre_linea());
            stmt.setString(2, linea.getEstatus_linea());
            

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

    public int delete(clsLineas linea) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, linea.getCodigo_linea());
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
    public clsLineas query(clsLineas linea) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsLineas> lineas = new ArrayList<clsLineas>();
        int rows = 0;

        try {
            conn = clsConexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, linea.getCodigo_linea());
            rs = stmt.executeQuery();
            while (rs.next()) {
               int codigo_linea = rs.getInt("codigo_linea");
                String nombre_linea = rs.getString("nombre_linea");
                String estatus_linea = rs.getString("estatus_linea");
                
                
                linea = new clsLineas();
                linea.setCodigo_linea(codigo_linea);
                linea.setNombre_linea(nombre_linea);
                linea.setEstatus_linea(estatus_linea);
                
                
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
        return linea;
    }
        
}
