/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.modell.Detalle_venta;
import java.util.ArrayList;

/**
 *
 * @author Malu Charito Cabrera
 */
public interface Detalle_ventaDAO {
     public boolean createDetalle_venta(Detalle_venta dv);
    public ArrayList<Detalle_venta> readDetalle_venta();
    public boolean updateDetalle_venta(Detalle_venta dv);
    public boolean deleteDetalle_venta(String id_detalle_venta);
}
