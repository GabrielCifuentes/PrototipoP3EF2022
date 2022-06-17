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
public class clsMarcas {
    int codigo_marcas;
    String nombre_marca;
    String estatus_marca;

    public clsMarcas() {
    }

    public clsMarcas(int codigo_marcas, String nombre_marca, String estatus_marca) {
        this.codigo_marcas = codigo_marcas;
        this.nombre_marca = nombre_marca;
        this.estatus_marca = estatus_marca;
    }

    public int getCodigo_marcas() {
        return codigo_marcas;
    }

    public void setCodigo_marcas(int codigo_marcas) {
        this.codigo_marcas = codigo_marcas;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getEstatus_marca() {
        return estatus_marca;
    }

    public void setEstatus_marca(String estatus_marca) {
        this.estatus_marca = estatus_marca;
    }

    @Override
    public String toString() {
        return "clsMarcas{" + "codigo_marcas=" + codigo_marcas + ", nombre_marca=" + nombre_marca + ", estatus_marca=" + estatus_marca + '}';
    }
  
    

  
    
}
