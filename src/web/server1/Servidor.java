/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.server1;

/**
 *
 * @author jonas
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
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
    
}
