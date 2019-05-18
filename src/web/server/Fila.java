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


    
    public Fila() {
    }
    
    
    public boolean esFilaVacia(){
        if(Final==null){
            return true;
        }else{
            return false;
        }       
    }
    
    public void enFila(Peticion peticion){
        if(esFilaVacia()){
            Frente=peticion;
            Final=peticion;
        }else{
            
        }
    }
    
}
