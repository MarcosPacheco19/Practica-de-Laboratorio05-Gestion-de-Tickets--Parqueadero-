/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Cliente;
import java.util.List;

/**
 *
 * @author xpacheco
 */
public interface IClienteDAO {
    
    public void create(Cliente cliente);
    public Cliente read(Cliente cliente);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
    public List<Cliente> findAll();
}
