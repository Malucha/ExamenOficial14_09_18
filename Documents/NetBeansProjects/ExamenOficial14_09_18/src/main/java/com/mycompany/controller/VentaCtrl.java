
package com.mycompany.controller;

import com.mycompany.controllerimpl.VentaCtrlImpl;
import com.mycompany.dao.VentaDAO;
import com.mycompany.modell.Venta;
import java.util.ArrayList;

/**
 *
 * @author windows 10
 */
public class VentaCtrl {
    
    private Venta selected;
 
    VentaDAO vendao;
    private ArrayList<Venta> list = new ArrayList();
    
    public VentaCtrl() {
        this.selected = new Venta();
        this.vendao = new VentaCtrlImpl();
    }
    
    public void createVenta(){
        if(vendao.createVenta((VentaDAO) selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
    
    public ArrayList<Venta> getList(){
    
    list = vendao.readVenta();
    return list;
            
    }

    public Venta getSelected() {
        return selected;
    }

    public void setSelected(Venta selected) {
        this.selected = selected;
    }
    
    
}