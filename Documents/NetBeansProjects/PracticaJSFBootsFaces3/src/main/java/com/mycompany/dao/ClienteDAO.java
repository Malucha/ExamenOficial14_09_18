/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.modell.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malu Charito Cabrera
 */
public interface ClienteDAO {
    public boolean createCliente(Cliente cli);
    public List<Cliente> readCliente();
    public boolean updateCliente(Cliente cli);
    public boolean deleteCliente(String id);
}
