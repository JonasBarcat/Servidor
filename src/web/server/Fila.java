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
public class Fila {
    
    private Item primero;

    
    public Fila() {
    }
    
    
    
    public void enFila(Item web){
        Item aux=web;
        aux.setSiguiente(this.primero);
        this.primero=aux;
    }
    
    
    public void verFila(){
        Item aux=this.primero;
            while(aux!=null){
                System.out.print("--> |"+aux.getDireccion()+"|");
                aux=aux.getSiguiente();
            }
        System.out.println();
    }
    
    public boolean esFilaVacia(){
        if(this.primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    
    public Item frente(){
            if(this.primero==null){
                return null;
            }else{
                Item aux=this.primero;
                return privateFront(aux);
            }
    }
    private Item privateFront(Item aux){
        if(aux.getSiguiente()==null){
            return aux;
        }else{
            aux=aux.getSiguiente();
            return privateFront(aux);
        }
    }
    
    
    public void deFila(){
         if(esFilaVacia()){
         }else{
             if(this.primero.getSiguiente()==null){
                 this.primero=null;
             }else{
                Item aux=this.primero;
                while(aux.getSiguiente().getSiguiente()!=null){
                    aux=aux.getSiguiente();
                }
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
             }
             
         }
    }
    
    
    
    
    
    
    
}
