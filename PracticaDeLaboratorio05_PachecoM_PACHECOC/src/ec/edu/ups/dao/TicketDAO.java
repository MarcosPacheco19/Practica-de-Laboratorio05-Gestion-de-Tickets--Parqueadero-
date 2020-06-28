/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.idao.ITicketDAO;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author linar
 */
public class TicketDAO implements  ITicketDAO {
    
    private Map<Integer, Ticket> tickets;
    private LocalDateTime fechaActual;
    private int numero;

    public TicketDAO() {
        tickets = new HashMap<Integer, Ticket>();
        numero = 0;
    }

    @Override
    public void create(Ticket ticket) {
        ticket.setNumero(++numero);
        tickets.put(ticket.getNumero(), ticket);
    }

    @Override
    public Ticket read(int numero) {
        return tickets.get(numero);
    }

    @Override
    public void update(Ticket ticket) {
    }

    @Override
    public void delete(Ticket ticket) {
    }

    @Override
    public Collection<Ticket> findAll() {
        Collection<Ticket> tickets = this.tickets.values();
        return tickets;
    }

    @Override
    public int obtenerUltimoNumero() {
        return numero;
    }

    @Override
    public LocalDateTime obtenerFechaACtual() {
        fechaActual = LocalDateTime.now();
        return fechaActual;
    }
}
