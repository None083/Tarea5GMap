/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author FX506
 */
public class Loteria {

    private Map<String, Premio> loteria;

    public Loteria() {

        this.loteria = new HashMap<>();

        String num = "";
        String numKey = "";
        for (int i = 0; i < 100; i++) {
            if (i >= 0 && i <= 9) {
                num = "00";
            } else if (i >= 10 && i <= 99) {
                num = "0";
            }
            numKey = num + String.valueOf(i);
            this.loteria.put(numKey, Premio.NADA);
        }
    }

    public Map<String, Premio> getLoteria() {
        return loteria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Decimo{");
        sb.append("loteria=").append(loteria);
        sb.append('}');
        return sb.toString();
    }

    public void repartirPremios() {

        List<String> decimosGanadores = new ArrayList<>();

        String decimoGordo = decimoAleatorio();
        this.loteria.replace(decimoGordo, Premio.GORDO);
        decimosGanadores.add(decimoGordo);

        String decimoSegundo = decimoAleatorio();
        decimoSegundo = decimoRepetido(decimosGanadores, decimoSegundo);
        this.loteria.replace(decimoSegundo, Premio.SEGUNDO);

        String decimoTercero = decimoAleatorio();
        decimoTercero = decimoRepetido(decimosGanadores, decimoTercero);
        this.loteria.replace(decimoTercero, Premio.TERCERO);

        String decimoCuarto = decimoAleatorio();
        decimoCuarto = decimoRepetido(decimosGanadores, decimoCuarto);
        this.loteria.replace(decimoCuarto, Premio.CUARTO);

        String decimoQuinto = decimoAleatorio();
        decimoQuinto = decimoRepetido(decimosGanadores, decimoQuinto);
        this.loteria.replace(decimoQuinto, Premio.QUINTO);

        String decimoPedrea = "";
        for (int i = 0; i <= 10; i++) {
            decimoPedrea = decimoRepetido(decimosGanadores, decimoPedrea);
            this.loteria.replace(decimoPedrea, Premio.PEDREA);
        }
    }

    private String decimoRepetido(List<String> dGanadores, String dNuevo) {
        if (dGanadores.contains(dNuevo)) {
            do {
                dNuevo = decimoAleatorio();
            } while (dGanadores.contains(dNuevo));
        }
        dGanadores.add(dNuevo);
        return dNuevo;
    }

    public String decimoAleatorio() {
        Random random = new Random();

        int numeroPremiado = random.nextInt(100);
        String num = "";

        if (numeroPremiado >= 0 && numeroPremiado <= 9) {
            num = "00";
        } else if (numeroPremiado >= 10 && numeroPremiado <= 99) {
            num = "0";
        }
        return num + String.valueOf(numeroPremiado);
    }

    public Map.Entry<String, Premio> buscarPorPremio(Premio p) {
        for (Map.Entry<String, Premio> entry : this.loteria.entrySet()) {
            if (p.equals(entry.getValue())) {
                return entry;
            }
        }
        return null;
    }

    public Map<String, Premio> buscarPorPremioTodos(Premio p) {
        Map<String, Premio> premiados = new HashMap<>();
        for (Map.Entry<String, Premio> entry : this.loteria.entrySet()) {
            if (p.equals(entry.getValue())) {
                premiados.put(entry.getKey(), entry.getValue());
            }
        }
        return premiados;
    }

    public Premio buscarPremio(String decimo) {
        return this.loteria.get(decimo);
    }

}
