/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.procesos;

/**
 *
 * @author diego
 */
public class Nodo {
    private Nodo siguiente = null;
    private Proceso contenido = null;
    
    public Nodo(Proceso contenido){
        this.siguiente = siguiente;
        this.contenido = contenido;
    }
    public Nodo (){
        
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public Proceso getContenido(){
        return contenido;
    }
    public void setContenido(Proceso contenido){
        this.contenido = contenido;
    }
}
