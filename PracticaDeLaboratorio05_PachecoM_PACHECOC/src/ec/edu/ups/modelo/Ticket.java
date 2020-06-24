/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author xpacheco
 */
public class Ticket {
    
    private int numero;
    private Date fEntrada;
    private Date fSalida;
    private double total;
    private Vehiculo vehiculo;

    public Ticket(int numero, Date fEntrada, Date fSalida, double total, Vehiculo vehiculo) {
        this.numero = numero;
        this.fEntrada = fEntrada;
        this.fSalida = fSalida;
        this.total = total;
        this.vehiculo = vehiculo;
    }
    
    public Ticket() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getfEntrada() {
        return fEntrada;
    }

    public void setfEntrada(Date fEntrada) {
        this.fEntrada = fEntrada;
    }

    public Date getfSalida() {
        return fSalida;
    }

    public void setfSalida(Date fSalida) {
        this.fSalida = fSalida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ticket other = (Ticket) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }
    
    
    
}
