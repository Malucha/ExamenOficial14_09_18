/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllerimpl;

import com.mycompamy.configbd.Conexionbd;
import com.mycompany.dao.Detalle_ventaDAO;
import com.mycompany.modell.Detalle_venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Detalle_ventaCtrlImpl implements Detalle_ventaDAO {

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Detalle_venta> listDatos;

    public Detalle_ventaCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createDetalle_venta(Detalle_venta dv) {
        sql = "INSERT INTO public.Detalle_venta(id_detalle_venta, id_venta,item,igv,sub_total,descuento,id_producto_stock,cantidad,precio_unit)"
                + "VALUES(" + dv.getId_detalle_venta()+ ",'" + dv.getId_venta() + "','" + dv.getItem()+ "','" + dv.getIgv()+ "','" + dv.getSub_total()+ "','" + dv.getId_producto_stock()+ "','" + dv.getCantidad()+ "','" + dv.getPrecio_unit()+ "'";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<Detalle_venta> readDetalle_venta() {
        listDatos = new ArrayList<>();
        sql = "SELECT * "
                + "    FROM public.detalle_venta";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Detalle_venta(rs.getString("id_detalle_venta"), rs.getString("id_venta"), rs.getString("item"), rs.getString("igv"), rs.getString("sub_total"), rs.getString("id_producto_stock"), rs.getString("cantidad"), rs.getString("precio_unit")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateDetalle_venta(Detalle_venta dv) {
        sql = "UPDATE public.detalle_venta SET"
                + " id_venta = '" + dv.getId_venta()+ "' , item = '" + dv.getItem()+ "' , igv = '" + dv.getIgv()+ "', sub_total = '" + dv.getSub_total()+ "', descuento = '" + dv.getDescuento()+ "', id_producto_stock = '" + dv.getId_producto_stock()+ "', cantidad = '" + dv.getCantidad()+ "', precio_unit = '" + dv.getPrecio_unit()+ "'"
                + " WHERE id_detalle_venta = " + dv.getId_detalle_venta()+ " ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteDetalle_venta(String id_detalle_venta) {
        sql = "DELETE public.producto "
                + "WHERE id_producto = " + id_producto + " ";
        return cx.executeInsertUpdate(sql);
    }

}
