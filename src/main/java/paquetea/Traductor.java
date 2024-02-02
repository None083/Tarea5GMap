/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquetea;

import java.util.ArrayList;
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
    
    public void guardarEntrada(String palabraExtranjera, String palabraEspanyol){
        this.traduccion.put(palabraExtranjera, palabraEspanyol);
    }
    
    public void borrarEntrada(String palabraExtranjera){
        this.traduccion.remove(palabraExtranjera);
    }
    
    public void borrarEntrada(String palabraExtranjera, String palabraEspaniol){
        this.traduccion.remove( palabraExtranjera, palabraEspaniol);
    }
    
    public void modificarEntrada(String palabraExtranjera, String palabraEspaniol){
        this.traduccion.replace(palabraExtranjera, palabraEspaniol);
    }
    
    public String traduccionPalabra(String palabraExtranjera){
        return this.traduccion.get(palabraExtranjera);
    }
    
    public ArrayList<String> listaPalabrasExtranjerasArrayList(){
        return new ArrayList<>(this.traduccion.keySet());
    }
    
    public ArrayList<String> listaPalabrasEspanyolArrayList(){
        return new ArrayList<>(this.traduccion.values());
    }
    
}
