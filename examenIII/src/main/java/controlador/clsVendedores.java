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
public class clsVendedores {
    int codigo_vendedor;
    String nombre_vendedor;
    String direccion_vendedor;
    String telefono_vendedor;
    String nit_vendedor;
    String estatus_vendedor;

    public clsVendedores() {
    }

    public clsVendedores(int codigo_vendedor, String nombre_vendedor, String direccion_vendedor, String telefono_vendedor, String nit_vendedor, String estatus_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
        this.nombre_vendedor = nombre_vendedor;
        this.direccion_vendedor = direccion_vendedor;
        this.telefono_vendedor = telefono_vendedor;
        this.nit_vendedor = nit_vendedor;
        this.estatus_vendedor = estatus_vendedor;
    }

    public int getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(int codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public String getDireccion_vendedor() {
        return direccion_vendedor;
    }

    public void setDireccion_vendedor(String direccion_vendedor) {
        this.direccion_vendedor = direccion_vendedor;
    }

    public String getTelefono_vendedor() {
        return telefono_vendedor;
    }

    public void setTelefono_vendedor(String telefono_vendedor) {
        this.telefono_vendedor = telefono_vendedor;
    }

    public String getNit_vendedor() {
        return nit_vendedor;
    }

    public void setNit_vendedor(String nit_vendedor) {
        this.nit_vendedor = nit_vendedor;
    }

    public String getEstatus_vendedor() {
        return estatus_vendedor;
    }

    public void setEstatus_vendedor(String estatus_vendedor) {
        this.estatus_vendedor = estatus_vendedor;
    }

    @Override
    public String toString() {
        return "clsVendedores{" + "codigo_vendedor=" + codigo_vendedor + ", nombre_vendedor=" + nombre_vendedor + ", direccion_vendedor=" + direccion_vendedor + ", telefono_vendedor=" + telefono_vendedor + ", nit_vendedor=" + nit_vendedor + ", estatus_vendedor=" + estatus_vendedor + '}';
    }
    

    
}
