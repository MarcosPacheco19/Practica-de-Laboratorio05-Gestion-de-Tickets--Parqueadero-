/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.idao.ITicketDAO;
import java.util.List;

/**
 *
 * @author linar
 */
public class TicketDAO implements  ITicketDAO {
    
    @Override
    
    public void create(Ticket ticket){
        
    }
    
    @Override 
    
    public Ticket read(int numero ){
        
        return null;
    }
    
    @Override 
    
    public void update(Ticket ticket){
        
    }
    
    @Override 
    
    public void delete(Ticket ticket){
        
    }
    
    @Override
    public List<Ticket>findAll(){
        
        return null;
    } 
    
}
