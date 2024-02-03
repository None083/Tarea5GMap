/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteb;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        Loteria d1 = new Loteria();
        
        for (String key : d1.getLoteria().keySet()) {
            System.out.println(key + ": " + d1.getLoteria().get(key));
        }
        System.out.println("---------------------");
        d1.repartirPremios();
        
        for (String key : d1.getLoteria().keySet()) {
            System.out.println(key + ": " + d1.getLoteria().get(key));
        }
        
        System.out.println("----------------------");
        System.out.println(d1.buscarPorPremio(Premio.GORDO) + ": " + Premio.GORDO.getCANTIDAD_PREMIO() + "€");
        System.out.println(d1.buscarPorPremio(Premio.SEGUNDO) + ": " + Premio.SEGUNDO.getCANTIDAD_PREMIO() + "€");
        System.out.println(d1.buscarPorPremio(Premio.TERCERO) + ": " + Premio.TERCERO.getCANTIDAD_PREMIO() + "€");
        System.out.println(d1.buscarPorPremio(Premio.CUARTO) + ": " + Premio.CUARTO.getCANTIDAD_PREMIO() + "€");
        System.out.println(d1.buscarPorPremio(Premio.QUINTO) + ": " + Premio.QUINTO.getCANTIDAD_PREMIO() + "€");
        
        for (String key : d1.buscarPorPremioTodos(Premio.PEDREA).keySet()) {
            System.out.println(key + "=" + d1.getLoteria().get(key) + ": " + Premio.PEDREA.getCANTIDAD_PREMIO() + "€");
        }
        
        System.out.println("----------------------");
        System.out.println("¿Cuánto le ha tocado al décimo 099? " 
                + d1.buscarPremio("099") + ": " 
                + d1.buscarPremio("099").getCANTIDAD_PREMIO() + "€");
        
    }
    
}
