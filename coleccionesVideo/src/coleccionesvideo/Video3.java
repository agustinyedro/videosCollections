/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesvideo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USURIO
 */
public class Video3 {

    private Scanner leer;
    private ArrayList<Mascota> mascotas;

    public Video3() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public Mascota crearMascota() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();

        Mascota m = new Mascota(nombre, apodo, tipo);

        return m;

    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascota() {
        System.out.println("Las mascotas actuales de la Lista mascotas son");
        for (Mascota mascota : mascotas) {
            System.out.println(mascota.toString());
        }

        System.out.println("Cantidad = " + mascotas.size());

    }

    public void fabricaChiquitos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {

            Mascota aux = new Mascota("Fer", "Chiquito", "Breagle");
            mascotas.add(aux);
        }
    }

    public void fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
    }

    public void actualizarMascota(int index) {
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }

    public void actualizarMascota2(int index) {

        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("------------Actualizar---------------");
            Mascota m = crearMascota();
            mascotas.set(index, m);
        } else {
            System.out.println("el indice es erroneo");
        }
    }

    public void eliminarMascotas(int index) {

        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        } else {
            System.out.println("el indice es erroneo");
        }

    }

    public void eliminarPorNombre(String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(m);
            }
        }
    }
    
    public void actualizarPorNombre(String nombreViejo, String nombreNuevo) {
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombreViejo)) {
               m.setNombre(nombreNuevo);
            }
        }
    }

    public static void main(String[] args) {
        Video3 servMasc = new Video3();
        String[] nombres = {"Pepe", "Pepa"};
        List<String> nombresList = new ArrayList();

//        servMasc.fabricaMascota(2);
//        servMasc.mostrarMascota();
//        servMasc.actualizarMascota2(0);
//        servMasc.mostrarMascota();
//        servMasc.eliminarMascotas(0);
//        servMasc.mostrarMascota();
    }
}
