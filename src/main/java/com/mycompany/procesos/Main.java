package com.mycompany.procesos;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Main {
    
    public static void main (String [ ] args) {
        
      boolean validacionProcesos = false;
      boolean validacionPrioridad = false;
      int iteraciones = 0;
      int orden = 0;
      
      do{
        String numProcesos = JOptionPane.showInputDialog("Cuantos proceso se desea emular");
        iteraciones = Integer.parseInt(numProcesos);
        if (iteraciones > 0)
            validacionProcesos = true;
      }while(!validacionProcesos);
      
      
      
      do{
        String entradaOrden = JOptionPane.showInputDialog("Se desea procesa por: \n"
              + "1)POR ENTRADA\n"
              + "2)POR PRIORIDAD");
        orden = Integer.parseInt(entradaOrden);
        if(orden == 1 || orden == 2)
            validacionPrioridad = true;
        else 
              System.out.println("Respuesta no valida");
      }while(!validacionPrioridad);
      
      if (orden == 1){
          Cola hilo = asignarTareas(iteraciones);
          Procesador(hilo);
      }    
      else
          System.out.println("Comming soon");
    }
    
    // Método para encolar 
    public static Cola asignarTareas(int iteraciones){
        
        Cola colaProcesos = new Cola();
        
        // Encolar los proceso
        for (int i=0; i<iteraciones; i++){
            
            int prioridad = (int)Math.floor(Math.random()*10+1);
            int id = i+1;
            int tiempoProceso = (int)Math.floor(Math.random()*100+1);
            
            Proceso procesos = new Proceso(id, tiempoProceso, prioridad);
            colaProcesos.encolar(procesos);
            
            
        }
        // control de entradas
        colaProcesos.ImprimirCola();
        // fin de encolar procesos
        return colaProcesos;
    }
    
    public static void Procesador(Cola colaProcesos){
        boolean salida = false;
        double tiempoProcesador = 60.0;
                
        System.out.println("----------DOWHILE-----------");
        do{
            Proceso tmp = colaProcesos.desencolar();
            if (colaProcesos.getCabecera() == null){
                salida = true;
            }
            else{
                if(tmp.getTiempoProceso() > tiempoProcesador){
                tmp.setTiempoProceos(tmp.getTiempoProceso() - tiempoProcesador);
                colaProcesos.encolar(tmp);
                    System.out.println("+++ColaProcesos.Imprmircola+++");
                    colaProcesos.ImprimirCola();
                    System.out.println("+++ColaProcesos:FinDeIprimirCulo+++");

                }
                else
                    tmp.imprimirDatos();
            }
        }while(!salida);
    }
    
    /*
    public static void Procesador2(int iteraciones, int orden){
        Cola colaProcesos = new Cola();
        
        for (int i=0; i<iteraciones; i++){
            
            int tiempoProcesador = (int)Math.floor(Math.random()*100+1);
            int prioridad = (int)Math.floor(Math.random()*10+1);
            int id = i+1;
            int tiempoProceso = (int)Math.floor(Math.random()*100+1);
            
            Proceso procesos = new Proceso(id, tiempoProceso, prioridad);
            colaProcesos.encolar(procesos);
            colaProcesos.getCabecera().getContenido().imprimirDatos();
        }
    }
    */
    
}