/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.modelo.Cliente;
import java.util.Collection;

/**
 *
 * @author xpacheco
 */
public class ControladorCliente {
    
    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ControladorCliente(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    
    public void crear(String cedula, String nombre, String direccion, String telefono) {
        cliente = new Cliente(cedula, nombre, direccion, telefono);
        clienteDAO.create(cliente);
    }
    
    public void actualizar(Cliente cliente) {
        clienteDAO.create(cliente);
    }
    
    public Cliente buscar(String cedula) {
        return clienteDAO.read(cedula);
    }
    
    public Collection<Cliente> listar() {
        Collection<Cliente> clientes = clienteDAO.findAll();
        return clientes;
    }
}
