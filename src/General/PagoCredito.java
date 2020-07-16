/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.awt.Choice;
import javax.swing.JButton;

/**
 *
 * @author estevan
 */
public class PagoCredito {
    String id; 
    String nombre_completo;
    int cuotas;
    double valor;

    public PagoCredito() {
    }

    public PagoCredito(String id, String nombre_completo, int cuotas, double valor) {
        this.id = id;
        this.nombre_completo = nombre_completo;
        this.cuotas = cuotas;
        this.valor = valor;

    
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getId() {
        return id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public int getCuotas() {
        return cuotas;
    }

    public double getValor() {
        return valor;
    }



}


