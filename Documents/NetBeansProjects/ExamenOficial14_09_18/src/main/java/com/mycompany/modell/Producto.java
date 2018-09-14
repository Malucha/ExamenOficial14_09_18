
package com.mycompany.modell;

public class Producto {
    String id_producto, id_categoria, descripcion, name_producto;

    public Producto(String id_producto, String id_categoria, String descripcion, String name_producto) {
        this.id_producto = id_producto;
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
        this.name_producto = name_producto;
    }

    public Producto() {
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }
    
    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getName_producto() {
        return name_producto;
    }

    public void setName_producto(String name_producto) {
        this.name_producto = name_producto;
    }
    
    
}
