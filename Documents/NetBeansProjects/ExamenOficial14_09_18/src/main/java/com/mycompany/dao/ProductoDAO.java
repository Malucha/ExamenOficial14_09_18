/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.modell.Producto;
import java.util.ArrayList;

/**
 *
 * @author P&D
 */
public interface ProductoDAO {
    public boolean createProducto(Producto prod);
    public ArrayList<Producto> readProducto();
    public boolean updateProducto(Producto prod);
    public boolean deleteProducto(String id_producto);
}
