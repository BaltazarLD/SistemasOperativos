/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.procesos;

/**
 *
 * @author diego
 */
public class Proceso {
    
    private int id;
    private double tiempoProceso;
    private int prioridad;
    
    //Constructores
    public Proceso(int id, float tiempoProceso, int prioridad){
        this.id = id;
        this.tiempoProceso = tiempoProceso;
        this.prioridad = prioridad;
    }
    public Proceso(){
    }
    
    //getters y setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public double getTiempoProceso(){
        return tiempoProceso;
    }
    public void setTiempoProceos(double tiempoProceso){
        this.tiempoProceso = tiempoProceso;
    }
    
    public int getPrioridad(){
        return prioridad;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    
    public void imprimirDatos(){
        System.out.println("El id del proceso = "+ id);
        System.out.println("El tiempo del proceso = "+ tiempoProceso);
        System.out.println("La prioridad del proceso es = "+ prioridad);
    }
}
