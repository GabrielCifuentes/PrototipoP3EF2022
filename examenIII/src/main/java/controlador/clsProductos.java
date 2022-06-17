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
public class clsProductos {
    int codigo_producto;
    String nombre_producto;
    String codigo_linea;
    String codigo_marca;
    int existencia_producto;
    String estatus_producto;

    public clsProductos() {
    }

    public clsProductos(int codigo_producto, String nombre_producto, String codigo_linea, String codigo_marca, int existencia_producto, String estatus_producto) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.codigo_linea = codigo_linea;
        this.codigo_marca = codigo_marca;
        this.existencia_producto = existencia_producto;
        this.estatus_producto = estatus_producto;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCodigo_linea() {
        return codigo_linea;
    }

    public void setCodigo_linea(String codigo_linea) {
        this.codigo_linea = codigo_linea;
    }

    public String getCodigo_marca() {
        return codigo_marca;
    }

    public void setCodigo_marca(String codigo_marca) {
        this.codigo_marca = codigo_marca;
    }

    public int getexistencia_producto() {
        return existencia_producto;
    }

    public void setexistencia_producto(int existencia_producto) {
        this.existencia_producto = existencia_producto;
    }

    public String getEstatus_producto() {
        return estatus_producto;
    }

    public void setEstatus_producto(String estatus_producto) {
        this.estatus_producto = estatus_producto;
    }

    @Override
    public String toString() {
        return "clsProductos{" + "codigo_producto=" + codigo_producto + ", nombre_producto=" + nombre_producto + ", codigo_linea=" + codigo_linea + ", codigo_marca=" + codigo_marca + ", existencia_producto=" + existencia_producto + ", estatus_producto=" + estatus_producto + '}';
    }

      
    
}
