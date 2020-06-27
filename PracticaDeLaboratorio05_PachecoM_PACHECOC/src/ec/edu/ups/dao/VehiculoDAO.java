/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IVehiculoDAO;
import ec.edu.ups.modelo.Vehiculo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author xpacheco
 */
public class VehiculoDAO implements IVehiculoDAO{

  private Map<String, Vehiculo> vehiculos;

    public VehiculoDAO() {
        vehiculos = new HashMap<String, Vehiculo>();
    }

    @Override
    public void create(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getPlaca(), vehiculo);
    }

    @Override
    public Vehiculo read(String placa) {
       return vehiculos.get(placa);
    }

    @Override
    public void update(Vehiculo vehiculo) {
       
    }

    @Override
    public void delete(Vehiculo vehiculo) {
       
    }

    @Override
    public Collection<Vehiculo> findAll() {
        Collection<Vehiculo> vehiculos = this.vehiculos.values();
        return vehiculos;
    }
     
}
