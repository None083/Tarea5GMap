/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import paquetec.Vaca;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author noelia
 */
public class Vaqueria {
    
    private Set<Vaca> rebanyo;

    public Vaqueria() {
        this.rebanyo = new HashSet<>();
    }

    public Set<Vaca> getRebanyo() {
        return rebanyo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaqueria{");
        sb.append("rebanyo=").append(rebanyo);
        sb.append('}');
        return sb.toString();
    }

    public int numeroVacas(){
        return this.rebanyo.size();
    }
    
    public void anyadirVaca(Vaca v){
        this.rebanyo.add(v);
    }
    
    public boolean vaqueriaVacia(){
        return this.rebanyo.isEmpty();
    }
    
    public boolean encontrarVaca(Vaca v){
        return this.rebanyo.contains(v);
    }
    
    public ArrayList<Vaca> sacarVacasAPastar(){
        
        ArrayList<Vaca> deVaquitasEnLaCalle = new ArrayList<>(this.rebanyo);
        
        this.rebanyo.clear();
        
        return deVaquitasEnLaCalle;
    }
    
    public ArrayList<Vaca> sacarVacasArrayList(){
        return new ArrayList<>(this.rebanyo);
    }
    
    public void mostrarVacasArrayList(){
        for (Vaca v : new ArrayList<>(this.rebanyo)) {
            System.out.println(v);
        }
    }

    public static void mostrarVacas(Set<Vaca> vaquitas){
        for (Vaca v : vaquitas) {
            System.out.println(v);
        }
    }
    
    public static void mostrarVacas(ArrayList<Vaca> vaquitas){
        for (Vaca v : vaquitas) {
            System.out.println(v);
        }
    }
    
    public void darBajaVaca(Vaca v){
        this.rebanyo.remove(v);
    }
    
}
