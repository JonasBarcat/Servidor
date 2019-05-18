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

    
       static int TIEMPO_TOTAL=10000; // milisegundos
       static int c=0;      //cuenta el paso del tiempo
        
       static int enCurso;
       static int esperaMaximoPrioridad;
       static int esperaMaximoComun;
       static int tiempoInactivo=0;
       
       static Fila prioridad=new Fila();
       static Fila comun=new Fila();
       
    
    
    public static void main(String[] args) {
        
        
    
        System.out.println("Solicitudes con prioridad (muestra sus tiempo de proceso) :");
        prioridad.verFila();
        System.out.println("Solicitudes comunes (muestra sus tiempo de proceso) :");
        comun.verFila();
        
       
        
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
     
         while(c<TIEMPO_TOTAL){
            if(IngresaPeticion()){  // si hay exito de 1/100 entonces...
             Peticion nuevapeticion=NuevaPeticion(c);    // creamos la peticion con una cantiad random de t
                if(EsUsuarioRegistrado()){ // hay un 10% de que sea usuario registrado o no
                    prioridad.enFila(nuevapeticion);
                }else{
                    comun.enFila(nuevapeticion);
                }
            }
            
            
//            if(){
//                
//            }else{
//                if(!prioridad.esFilaVacia()){
//                    enCurso=prioridad.frente().getTIEMPO_TOTAL();
//                    prioridad.deFila();
//                    
//                }else if(!comun.esFilaVacia()){
//                    enCurso=comun.frente().getTIEMPO_TOTAL();
//                    comun.deFila();
//                }else{
//                tiempoInactivo++;
//                }        
//            }        
       
        c++;
        }
         
     }
        
    
}
