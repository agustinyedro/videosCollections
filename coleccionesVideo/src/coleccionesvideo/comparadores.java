/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesvideo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author USURIO
 */
public class comparadores {
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {
            return o2.getNombre().compareTo(o1.getNombre());
        }
    };
    
      public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {
            return o2.getEdad().compareTo(o1.getEdad());
        }
    };
      
      public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new  ArrayList();
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));

        
        Collections.sort(mascotas, ordenarPorNombreDesc);
//        Collections.shuffle(mascotas);
//          for (Mascota mascota : mascotas) {
//              System.out.println(mascota);
//          }
    }
    
}
