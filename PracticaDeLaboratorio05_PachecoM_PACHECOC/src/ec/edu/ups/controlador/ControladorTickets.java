/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author xpacheco
 */
public class ControladorTickets {
    
    private ITicketDAO ticketDAO;
    private Ticket ticket;

    public ControladorTickets(ITicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }
    
    public void crear(LocalDateTime fechaEntrada, Vehiculo vehiculo) {
        ticket = new Ticket(fechaEntrada, vehiculo);
        ticketDAO.create(ticket);
    }
    
    public Ticket buscar(int numero) {
        return ticketDAO.read(numero);
    }
    
    public int obtenerSiguienteNumero() {
        int numero = ticketDAO.obtenerUltimoNumero();
        return ++numero;
    }
    
    public LocalDateTime obtenerFechaActual() {
        return ticketDAO.obtenerFechaACtual();
    }
    
    public Collection<Ticket> listar() {
        return ticketDAO.findAll();
    }
    
}
