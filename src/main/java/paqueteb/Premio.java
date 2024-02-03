/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package paqueteb;

/**
 *
 * @author FX506
 */
public enum Premio {
    
    GORDO(400000),
    SEGUNDO(125000),
    TERCERO(50000),
    CUARTO(20000),
    QUINTO(6000),
    PEDREA(1000),
    NADA(0);

    private final int CANTIDAD_PREMIO;

    private Premio(int CANTIDAD_PREMIO) {
        this.CANTIDAD_PREMIO = CANTIDAD_PREMIO;
    }

    public int getCANTIDAD_PREMIO() {
        return CANTIDAD_PREMIO;
    }
    
    
    
}
