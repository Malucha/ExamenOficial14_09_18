
package com.mycompany.controller;

import com.mycompany.controllerimpl.ProductoCtrlImpl;
import com.mycompany.dao.ProductoDAO;
import com.mycompany.modell.Producto;
import java.util.ArrayList;


public class ProductoCtrl {
    
    private Producto selected;
 
    ProductoDAO proddao;
    private ArrayList<Producto> list = new ArrayList();
    
    public ProductoCtrl() {
        this.selected = new Producto();
        this.proddao = new ProductoCtrlImpl();
    }
    
    public void createProducto(){
        if(proddao.createProducto((Producto) (ProductoDAO) selected)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
    
        public ArrayList<Producto> getList(){
    
    list = proddao.readProducto();
    return list;
            
    }

    public Producto getSelected() {
        return selected;
    }

    public void setSelected(Producto selected) {
        this.selected = selected;
    }
    
    
}