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
public class clsClientes {
    int codigo_cliente;
    String nombre_cliente;
    String direccion_cliente;
    String nit_cliente;
    String telefono_cliente;
    String codigo_vendedor;
    String estatus_cliente;

    public clsClientes() {
    }

    public clsClientes(int codigo_cliente, String nombre_cliente, String direccion_cliente, String nit_cliente, String telefono_cliente, String codigo_vendedor, String estatus_cliente) {
        this.codigo_cliente = codigo_cliente;
        this.nombre_cliente = nombre_cliente;
        this.direccion_cliente = direccion_cliente;
        this.nit_cliente = nit_cliente;
        this.telefono_cliente = telefono_cliente;
        this.codigo_vendedor = codigo_vendedor;
        this.estatus_cliente = estatus_cliente;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getNit_cliente() {
        return nit_cliente;
    }

    public void setNit_cliente(String nit_cliente) {
        this.nit_cliente = nit_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(String codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public String getEstatus_cliente() {
        return estatus_cliente;
    }

    public void setEstatus_cliente(String estatus_cliente) {
        this.estatus_cliente = estatus_cliente;
    }

    @Override
    public String toString() {
        return "clsClientes{" + "codigo_cliente=" + codigo_cliente + ", nombre_cliente=" + nombre_cliente + ", direccion_cliente=" + direccion_cliente + ", nit_cliente=" + nit_cliente + ", telefono_cliente=" + telefono_cliente + ", codigo_vendedor=" + codigo_vendedor + ", estatus_cliente=" + estatus_cliente + '}';
    }
    
    

    
}
