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
       
       static Fila prioridad= new Fila();
       static Fila comun= new Fila();
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fila nueva=new Fila();
        
        if(nueva.esFilaVacia()){
            System.out.println("Es vacia");
        }
        
        
        Peticion uno=new Peticion(12,12);
            Peticion dos=new Peticion(13,13);
                Peticion tres=new Peticion(14,14);
//        
//        nueva.enFila(uno);
         nueva.enFila(dos);
          nueva.enFila(tres);
          
        nueva.verFila();
        
        
         if(nueva.esFilaVacia()){
            System.out.println("Es vacia");
        }else{   System.out.println("NO es vacia");}
        
          System.out.println("Cantidad de peticiones: "+nueva.cantidad());
        //nueva.deFila();
        nueva.deFila();
        nueva.deFila();
        nueva.verFila();
        if(nueva.esFilaVacia()){
            System.out.println("Es vacia");
        }else{   System.out.println("NO es vacia");}
        
        System.out.print("el frente es: "+nueva.Frente().getTIEMPO_TOTAL());
        
        System.out.println("Cantidad de peticiones: "+nueva.cantidad());
        
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
          // aqui viene el cuerpo
          c++;
          }
     
     }
     
    
}
