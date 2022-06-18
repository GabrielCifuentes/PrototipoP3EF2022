/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author visitante
 */
public class clsLineas {
    int codigo_linea ;
    String nombre_linea;
    String estatus_linea;

    public clsLineas() {
    }

    public clsLineas(int codigo_linea, String nombre_linea, String estatus_linea) {
        this.codigo_linea = codigo_linea;
        this.nombre_linea = nombre_linea;
        this.estatus_linea = estatus_linea;
    }

    public int getCodigo_linea() {
        return codigo_linea;
    }

    public void setCodigo_linea(int codigo_linea) {
        this.codigo_linea = codigo_linea;
    }

    public String getNombre_linea() {
        return nombre_linea;
    }

    public void setNombre_linea(String nombre_linea) {
        this.nombre_linea = nombre_linea;
    }

    public String getEstatus_linea() {
        return estatus_linea;
    }

    public void setEstatus_linea(String estatus_linea) {
        this.estatus_linea = estatus_linea;
    }

    @Override
    public String toString() {
        return "tbl_lineas{" + "codigo_linea=" + codigo_linea + ", nombre_linea=" + nombre_linea + ", estatus_linea=" + estatus_linea + '}';
    }
   
    

    
}
