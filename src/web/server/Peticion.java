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
public class Peticion {
    
    private int tiempo;
    private int t_in;

    public Peticion(int tiempo, int t_in) {
        this.tiempo = tiempo;
        this.t_in = t_in;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getT_in() {
        return t_in;
    }

    public void setT_in(int t_in) {
        this.t_in = t_in;
    }
    
    
    
}
