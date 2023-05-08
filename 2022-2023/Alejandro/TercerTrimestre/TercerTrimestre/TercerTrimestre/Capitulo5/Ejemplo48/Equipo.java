package Capitulo5.Ejemplo48;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Equipo {
    private String nombre;
    private double totalTiempo = 0;
    private String pais;
    private ArrayList<Ciclista> listaCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaCiclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }

    public double getTotalTiempo() {
        return totalTiempo;
    }

    private void setTotalTiempo(double totalTiempo) {
        this.totalTiempo = totalTiempo;
    }

    public void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);

            System.out.println(c.toString());
        }
    }

    public void buscarCiclista() {
        boolean estar = false;
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.nextLine();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            if (c.getNombre().equals(nombreCiclista)) {
                estar = true;
                System.out.println(c.getNombre());
            }

        }
        if (!estar)
            System.out.println("Nadie con ese nombre en el equipo");
    }

    public void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", totalTiempo=" + totalTiempo + ", pais=" + pais + "]";
    }

}
