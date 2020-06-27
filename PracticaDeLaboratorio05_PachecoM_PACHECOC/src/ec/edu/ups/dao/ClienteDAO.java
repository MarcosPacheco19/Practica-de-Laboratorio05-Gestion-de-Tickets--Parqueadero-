/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.idao.IClienteDAO;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xpacheco
 */
public class ClienteDAO implements IClienteDAO {
    
     private Map<String, Cliente> clientes;

    public ClienteDAO() {
        clientes = new HashMap<String, Cliente>();
    }

    @Override
    public void create(Cliente cliente) {
        clientes.put(cliente.getCedula(), cliente);
        
    }

    
    @Override
    public Cliente read(Cliente cedula) {
        return clientes.get(cedula);
        
    }

    
    @Override
    public void update(Cliente cliente) {
        clientes.put(cliente.getCedula(), cliente);
    }

    
    @Override
    public void delete(Cliente cliente) {
        
    }

    
     @Override
    public Collection<Cliente> findAll() {
        Collection<Cliente> clientes = this.clientes.values();
        return clientes;
    }
    
}
