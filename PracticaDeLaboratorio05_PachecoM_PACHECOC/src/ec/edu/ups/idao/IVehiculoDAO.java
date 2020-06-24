/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Vehiculo;
import java.util.List;

/**
 *
 * @author xpacheco
 */
public interface IVehiculoDAO {
    
    //metodos a implementarse en el VehiculoDAO
    public void create(Vehiculo vehiculo );
    public Vehiculo read(String placa);
    public void update(Vehiculo vehiculo);
    public void delete(Vehiculo vehiculo);
    public List<Vehiculo> findAll();  
    
}
