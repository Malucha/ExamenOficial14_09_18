/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modell;

/**
 *
 * @author Malu Charito Cabrera
 */
public class Detalle_venta {
     String id_detalle_venta, id_venta,item,igv,sub_total,descuento,id_producto_stock,cantidad,precio_unit;

    public Detalle_venta(String id_detalle_venta, String id_venta, String item, String igv, String sub_total, String descuento, String id_producto_stock, String cantidad, String precio_unit) {
        this.id_detalle_venta = id_detalle_venta;
        this.id_venta = id_venta;
        this.item = item;
        this.igv = igv;
        this.sub_total = sub_total;
        this.descuento = descuento;
        this.id_producto_stock = id_producto_stock;
        this.cantidad = cantidad;
        this.precio_unit = precio_unit;
    }

    public Detalle_venta(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Detalle_venta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(String id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getIgv() {
        return igv;
    }

    public void setIgv(String igv) {
        this.igv = igv;
    }

    public String getSub_total() {
        return sub_total;
    }

    public void setSub_total(String sub_total) {
        this.sub_total = sub_total;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getId_producto_stock() {
        return id_producto_stock;
    }

    public void setId_producto_stock(String id_producto_stock) {
        this.id_producto_stock = id_producto_stock;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(String precio_unit) {
        this.precio_unit = precio_unit;
    }
    
}
