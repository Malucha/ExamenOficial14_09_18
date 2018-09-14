/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.modell.Producto;
import com.mycompamy.configbd.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.dao.ProductoDAO;

public class ProductoCtrl implements ProductoDAO {

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Producto> listDatos;

    public ProductoCtrl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createProducto(Producto prod) {
        sql = "INSERT INTO public.producto(id_producto, id_categoria , descripcion, name_producto)"
                + "VALUES(" + prod.getId_producto() + ",'" + prod.getId_categoria() + "','" + prod.getDescripcion() + "','" + prod.getName_producto() + "')";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<Producto> readProducto() {
        listDatos = new ArrayList<>();
        sql = "SELECT * "
                + "    FROM public.producto";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Producto(rs.getString("id_producto"), rs.getString("id_categoria"), rs.getString("descripcion"), rs.getString("name_producto")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoCtrl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateProducto(Producto prod) {
        sql = "UPDATE public.producto SET"
                + " id_categoria = '" + prod.getId_categoria() + "' , name_producto = '" + prod.getName_producto() + "' , descripcion = '" + prod.getDescripcion() + "'"
                + " WHERE id_producto = " + prod.getId_producto() + " ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteProducto(String id_producto) {
        sql = "DELETE public.producto "
                + "WHERE id_producto = " + id_producto + " ";
        return cx.executeInsertUpdate(sql);
    }

}
