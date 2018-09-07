package com.mycompany.controller;


import com.mycompany.controllerimpl.ClienteCtrlImpl;
import com.mycompany.dao.ClienteDAO;
import com.mycompany.modell.Cliente;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "clienteCtrl")
@SessionScoped
public class ClienteCtrl implements Serializable {

    private Cliente selected;
    private boolean est;
    ClienteDAO clidao;
    private List<Cliente> list = new ArrayList();

    public ClienteCtrl() {
        this.selected = new Cliente();
        this.clidao = new ClienteCtrlImpl();
    }

    public void createCliente() {
        if (clidao.createCliente(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }
    
    public List<Cliente> getList() {
        list = clidao.readCliente();
        return list;
    }

    public Cliente getSelected() {
        return selected;
    }

    public void setSelected(Cliente selected) {
        this.selected = selected;
    }
    
}
