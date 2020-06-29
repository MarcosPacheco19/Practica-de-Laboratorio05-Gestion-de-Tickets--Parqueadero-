/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author xpacheco
 */
public class Ticket {
    
    private int numero;
    private LocalDateTime fEntrada;
    private LocalDateTime fSalida;
    private double total;
    private Vehiculo vehiculo;
    private int fracciones;

    //Constructores
    public Ticket(LocalDateTime fechaEntrada, Vehiculo vehiculo) {
        this.fEntrada = fechaEntrada;
        this.vehiculo = vehiculo;
    }
    
    public Ticket(int numero, LocalDateTime fechaEntrada, LocalDateTime fechaSalida, double total) {
        this.numero = numero;
        this.fEntrada = fechaEntrada;
        this.fSalida = fechaSalida;
        this.total = total;
    }
    
    public Ticket() {
        
    }
    
    
    
    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getfEntrada() {
        return fEntrada;
    }

    public void setfEntrada(LocalDateTime fEntrada) {
        this.fEntrada = fEntrada;
    }
    
     public String getFechaSalida() {
        if (fSalida == null) {
            return "";
        } else {
            return fSalida.toString();
        }
    }

    public LocalDateTime getfSalida() {
        return fSalida;
    }

    public void setfSalida(LocalDateTime fSalida) {
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

    public int getFracciones() {
        return fracciones;
    }

    public void setFracciones(int fracciones) {
        this.fracciones = fracciones;
    }
    
    
    //hashcode y equals

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
    
    
    //metodos para mostrar la fecha
    
    public String calcularTiempo() {
        int dias = (fSalida.getMonth().length(esAñoBisiesto(fSalida.getYear()))) - (fEntrada.getMonth().length(esAñoBisiesto(fEntrada.getYear())));
        int horas = fSalida.getHour() - fEntrada.getHour();
        int minutos = fSalida.getMinute() - fEntrada.getMinute();
        int segundos = fSalida.getSecond() - fEntrada.getSecond();
        
        if (segundos < 0) {
            --minutos;
            segundos += 60;
            
        }
        if (minutos < 0) {
            --horas;
            minutos += 60;
            
        }
        if (horas < 0) {
            --dias;
            horas += 24;
        }
        
        minutos += (dias * 1440) + (horas * 60);
        fracciones = 1 + (minutos/10);
        total = Double.valueOf(fracciones + "") * 0.25;
        
        if (dias > 0) {
            return dias + "dias, " + horas + "horas, " + minutos + "minutos, " + segundos + "segundos.";
            
        } else if (horas > 0) {
            return horas + "horas, " + minutos + "minutos, " + segundos + "segundos.";
            
        } else {
            return minutos + "minutos, " + segundos + "segundos."; 
        }
    }

    public boolean esAñoBisiesto(int año) {
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            return true;
            
        } else {
            return false;
            
        }
    }
}
