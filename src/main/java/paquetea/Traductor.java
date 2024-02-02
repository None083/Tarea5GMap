/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquetea;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author noelia
 */
public class Traductor {

    private Map<String, String> traduccion;

    public Traductor() {
        this.traduccion = new TreeMap<>();
    }

    public Map<String, String> getTraduccion() {
        return traduccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("traduccion=").append(traduccion);
        sb.append('}');
        return sb.toString();
    }
    
    public void guardarEntrada(String palabraExtranjera, String palabraEspañol){
        this.traduccion.put(palabraExtranjera, palabraEspañol);
    }
    
}
