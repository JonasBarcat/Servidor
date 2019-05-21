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

    
       static int TIEMPO_TOTAL=100000; // milisegundos
       static int c=0;      //cuenta el paso del tiempo
        
       static int espera;
       static int enCurso;
       static int esperaMaximoPrioridad;
       static int esperaMaximoComun;
       static int tiempoInactivo=0;
       
       static Fila filaPrioridad= new Fila();
       static Fila filaComun= new Fila();
    
       static int atendidasPrioridad=0;
       static int atendidasComun=0;
       static int atendidasTotales=0;
       
       static int cantMaximaPrioridad=0;
       static int cantMaximaComun=0;
       
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        
        procesar();
        System.out.println("#########################BARCAT GLOBAL SOURCE#######################");
        System.out.println("####################################################################");
           System.out.println("Servidor Chino N° 247");
        System.out.println("");
        System.out.println("__La cantidad total de peticiones atendidas es: "+atendidasTotales);
        System.out.println("_____Peticiones prioritarias atendidas: "+atendidasPrioridad);
        System.out.println("_____Peticiones comunes atendidas: "+atendidasComun);
        System.out.println("####################################################################");
        System.out.println("####################################################################");
        System.out.println("Peticiones sin atender___ ");
        System.out.println(":::: Prioritarias: "+filaPrioridad.cantidad());
        System.out.println(":::: Comunes: "+filaComun.cantidad());
        System.out.println("####################################################################");
        System.out.println("####################################################################");
        System.out.println("Tiempo maximos de espera___");
        System.out.println("::: Tiempo maximo de una peticion con prioridad fue : "+esperaMaximoPrioridad+" ms");
        System.out.println("::: Tiempo maximo de una peticion comun fue : "+esperaMaximoComun+" ms");
        System.out.println("####################################################################");
        System.out.println("####################################################################");
        System.out.println("####################################################################");
        System.out.println("#########################__DATOS SERVIDOR__#########################");
        System.out.println("Tiempo total inactivo: "+tiempoInactivo+" ms");
        System.out.println("Cantidad maxima de solicitudes prioritarias: "+cantMaximaPrioridad);
         System.out.println("Cantidad maxima de solicitudes comunes: "+cantMaximaComun);
            System.out.println("");
            System.out.println("");
        
        
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
         
          while(c<TIEMPO_TOTAL){  // enfilo las peticiones con prioridad y comunes
              if(IngresaPeticion()){
                  if(EsUsuarioRegistrado()){
                    filaPrioridad.enFila(NuevaPeticion(c));
                    cantMaximaPrioridad++;
                  }else{
                    filaComun.enFila(NuevaPeticion(c));
                    cantMaximaComun++;
                  }
              }
              
              
              
             
              if(enCurso>0){
                  enCurso=enCurso-1;
              }else{
                  
                    if(!filaPrioridad.esFilaVacia()){
                        enCurso=filaPrioridad.Frente().getTIEMPO_TOTAL(); // anoto el tiempo que me toma procesar esta peticion
                        filaPrioridad.deFila();  // ahora elimino el primer elemento de la fila pues ya fue atendido
                            atendidasPrioridad++; // anoto cuantas peticiones se van atendiendo
                        espera=c-filaPrioridad.Frente().getT_in(); // es el tiempo que tuvo que esperar la peticion que seguia para ser atendida
                            if(espera>esperaMaximoPrioridad){
                                esperaMaximoPrioridad=espera;
                            }
                    }else if(!filaComun.esFilaVacia()){
                        enCurso=filaComun.Frente().getTIEMPO_TOTAL();
                        filaComun.deFila();
                            atendidasComun++;
                        espera=c-filaComun.Frente().getT_in();
                            if(espera>esperaMaximoComun){
                                esperaMaximoComun=espera;
                            }
                    }else{
                        tiempoInactivo++;
                    }
              }
                
          c++;
          }
          
      //extras    
          atendidasTotales=atendidasPrioridad+atendidasComun;
          
          
     
     }
     
    
}
