/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author FX506
 */
public class Granja {
    
    private Map<String, Vaqueria> granja;
    private static int contador = 0;

    public Granja() {
        this.granja = new TreeMap<>();
    }

    public Map<String, Vaqueria> getGranja() {
        return granja;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Granja{");
        sb.append("granja=").append(granja);
        sb.append('}');
        return sb.toString();
    }

    public void agregarVaqueria(Vaqueria vaqueria) {
        granja.put(String.valueOf(contador), vaqueria);
        contador++;
    }

    public Vaqueria obtenerVaqueria(String id) {
        return this.granja.get(id);
    }

    public Map<String, Vaqueria> obtenerGranja() {
        return this.granja;
    }
    
    public void mostrarGranja(){
        for (String key : this.granja.keySet()) {
            System.out.println(key + ": " + this.granja.get(key));
        }
    }
    
}
