/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetec;

import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class Main {

    /**
     * En una estructura map, asocia a cada objeto de tipo Vaquería un 
     * identificador único. Se deben poder guardar Vaquerías con sus 
     * identificadores asociados, obtener un Vaquería según su identificador 
     * y obtener todas las Vaquerías contenidas en la estructura map.
     */
    public static void main(String[] args) {
        
        Vaqueria rebanyo1 = new Vaqueria();
        Vaqueria rebanyo2 = new Vaqueria();
        
        Granja g1 = new Granja();
        
        Vaca v1 = new Vaca( "34", LocalDate.of(2024, 1, 1), "Margarita");
        Vaca v2 = new Vaca("1", LocalDate.of(2022, 12, 1), "Lussy");
        Vaca v3 = new Vaca("40",LocalDate.of(2023, 10, 1), "Hamburguesa");
        Vaca v4 = new Vaca( "4", LocalDate.of(2024, 11, 1), "Manchas");
        Vaca v5 = new Vaca("5", LocalDate.of(2022, 6, 1), "Blanquita");
        Vaca v6 = new Vaca("6",LocalDate.of(2023, 3, 1), "Chucrut");
        
        rebanyo1.anyadirVaca(v1);
        rebanyo1.anyadirVaca(v2);
        rebanyo1.anyadirVaca(v3);
        rebanyo2.anyadirVaca(v4);
        rebanyo2.anyadirVaca(v5);
        rebanyo2.anyadirVaca(v6);
        
        g1.agregarVaqueria(rebanyo1);
        g1.agregarVaqueria(rebanyo2);
        
        g1.mostrarGranja();
        
        System.out.println(g1.obtenerVaqueria("1"));
        
    }
    
}
