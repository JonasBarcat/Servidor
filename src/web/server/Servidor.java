/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.server;

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
        
        Item web1=new Item("www.google.com");
        Item web2=new Item("www.bing.com");
        Item web3=new Item("www.task.com");
        Item web4=new Item("www.omegle.com");
        Item web5=new Item("www.ecosia.com");
        
        nueva.enFila(web5);
        nueva.enFila(web2);
//        nueva.enFila(web3);
//        nueva.enFila(web4);
//        nueva.enFila(web1);
        
        nueva.verFila();
        
        System.out.println("Primera direccion en la fila-->"+nueva.frente());
    
    
        nueva.deFila();
          nueva.verFila();
    
    
    }
    
}
