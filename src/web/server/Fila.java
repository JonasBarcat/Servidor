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
    
    private Peticion Frente;
    private Peticion Final;
    private int c=0;
    
    public Fila() {
    }
    
 
    
    public boolean esFilaVacia(){ //ok
        return this.Frente==null;
    }
    
    
    public void enFila(Peticion nueva){ 
        if(esFilaVacia()){
            this.Final=nueva;
            this.Frente=nueva;
        }else{
           this.Final.setSiguiente(nueva);
           this.Final=nueva;
        }
        c++;
    }
    
    public void verFila(){ // auxiliar para ir revisando el comportamiento del adt
        Peticion aux=this.Frente;
        while(aux!=null){
            System.out.print(aux.getTIEMPO_TOTAL()+"<--");
            aux=aux.getSiguiente();
        }
    }
    
    
    public void deFila(){
        if(!esFilaVacia()){
            if(this.Frente.getSiguiente()==null){
                this.Frente=null;
                c--;
            }else{
                this.Frente=this.Frente.getSiguiente();
                c--;
            }
        }
    }
    
    
    public Peticion Frente(){
       if(!esFilaVacia()){
           return this.Frente;
       }else{
           Peticion x=new Peticion(-1,-1);
           return x;
       }
    }
    
    
    public int cantidad(){
    return c;
    }
    
    
}
