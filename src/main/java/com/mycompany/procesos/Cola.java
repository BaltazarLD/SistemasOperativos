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
public class Cola {
    
    private Nodo cabecera;
    private Nodo ultimo;
    
    public Cola(){
        cabecera=null;
    }
    
    public void encolar(Proceso proceso){
        Nodo aux=cabecera;
        Nodo nuevo = new Nodo(proceso);
        
        if(cabecera==null){
            cabecera=nuevo;
           ultimo=cabecera;
        } 
        else{
            while(aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            ultimo=aux.getSiguiente();
        }
    }
    
    public Proceso desencolar(){
        if(cabecera!=null){
            Proceso proceso=cabecera.getContenido();
            cabecera=cabecera.getSiguiente();
            return proceso;
        }
       // else 
         //   System.out.println("La cola esta vacia");
        return null;
    }
    
    public void ImprimirCola(){
        Nodo aux=cabecera;
        int contadorProceso=1;
        if(cabecera!=null){
            
            while(aux!=null){
                System.out.println("-----------Proceso " + contadorProceso + "------------");
                aux.getContenido().imprimirDatos();
                aux=aux.getSiguiente();
                contadorProceso++;
            }
        }
        else
            System.out.println("La cola está vacía");
    }
    
    public Nodo getUltimo()
    {
        return ultimo;
    }
    
    public Nodo getCabecera()
    {
        return cabecera;
    }
}
