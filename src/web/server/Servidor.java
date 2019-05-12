/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.server;

import java.util.Random;

/**
 *
 * @author jonas
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int TIEMPO_TOTAL=1000; // milisegundos
        int c=0;      //cuenta el paso del tiempo
        
        int enCurso;
        int esperaMaximoPrioridad;
        int esperaMaximoComun;
        
        Fila prioridad=new Fila();
        Fila comun=new Fila();
          
        
        while(c<TIEMPO_TOTAL){
            if(IngresaPeticion()){  // si hay exito de 1/100 entonces...
             Peticion nuevapeticion=NuevaPeticion(c);    // creamos la peticion con una cantiad random de t
                if(EsUsuarioRegistrado()){ // hay un 10% de que sea usuario registrado o no
                    prioridad.enFila(nuevapeticion);
                }else{
                    comun.enFila(nuevapeticion);
                }
            }
       
        c++;
        }
    
        
        
        
        
    }
    
    
    
    
    
    
    
    
     public static boolean IngresaPeticion(){
         Random numero=new Random();
           if(numero.nextInt(99)==1){
           return true;
           }else return false;
        }
     
       
     public static boolean EsUsuarioRegistrado(){
         Random numero=new Random();
           if(numero.nextInt(9)==1){
           return true;
           }else return false;
        }
     
     
     public static Peticion NuevaPeticion(int x){
         Random t_aleatorio=new Random();  // un valor aleatorio entre 50 y 300
         int aleatorio=50+t_aleatorio.nextInt(250);
         
         Peticion nueva=new Peticion(aleatorio,x); // genera la peticion y la devuelve
         return nueva;
     }
     
     
     public static void procesar(){
     
     }
        
    
}
