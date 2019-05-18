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
public class Peticion {
    
    private int TIEMPO_TOTAL;
    private int t_in;
    private Peticion Siguiente;

    
    
    public Peticion(int TIEMPO_TOTAL, int t_in) {
        this.TIEMPO_TOTAL = TIEMPO_TOTAL;
        this.t_in = t_in;
        this.Siguiente=null;
    }
  
    
    
    
    public Peticion getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Peticion Siguiente) {
        this.Siguiente = Siguiente;
    }
   

    public int getTIEMPO_TOTAL() {
        return TIEMPO_TOTAL;
    }

    public void setTIEMPO_TOTAL(int TIEMPO_TOTAL) {
        this.TIEMPO_TOTAL = TIEMPO_TOTAL;
    }

    public int getT_in() {
        return t_in;
    }

    public void setT_in(int t_in) {
        this.t_in = t_in;
    }
    
    
}
