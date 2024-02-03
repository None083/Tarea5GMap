/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetea;

import java.util.ArrayList;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        Traductor traduccion = new Traductor();

        traduccion.guardarEntrada("Music", "Música");
        traduccion.guardarEntrada("Song", "Canción");
        traduccion.guardarEntrada("Singer", "Cantante");
        traduccion.guardarEntrada("Guitar", "Guitarra");
        traduccion.guardarEntrada("Bass", "Bajo");
        traduccion.guardarEntrada("Drums", "Batería");
        traduccion.guardarEntrada("Keyboard", "Teclado");
        traduccion.guardarEntrada("Microphone", "Micrófono");
        traduccion.guardarEntrada("Musician", "Músico");
        traduccion.guardarEntrada("Lyrics", "Letra");
        
        for (String key : traduccion.listaPalabrasExtranjerasArrayList()) {
            System.out.println(key + ": " + traduccion.traduccionPalabra(key));
        }
        System.out.println("---------------------------------------------------------");
        
        traduccion.borrarEntrada("Song");
        for (String key : traduccion.listaPalabrasExtranjerasArrayList()) {
            System.out.println(key + ": " + traduccion.traduccionPalabra(key));
        }
        System.out.println("---------------------------------------------------------");
        
        traduccion.modificarEntrada("Drums", "Tambores");
        for (String key : traduccion.listaPalabrasExtranjerasArrayList()) {
            System.out.println(key + ": " + traduccion.traduccionPalabra(key));
        }
        System.out.println("---------------------------------------------------------");
        
        ArrayList<String> palabrasEspanyolas = traduccion.listaPalabrasEspanyolArrayList();
        for (String palabra : palabrasEspanyolas) {
            System.out.println(palabra);
        }
        System.out.println("---------------------------------------------------------");
        
        System.out.println(traduccion.traduccionPalabra("Guitar"));

//        for (String key : traduccion.getTraduccion().keySet()) {
//            System.out.println(key + ": " + traduccion.getTraduccion().get(key));
//        }
        
    }
    
}
