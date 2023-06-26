/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesvideo;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author USURIO
 */
public class ServicioMascota {

    private Scanner leer ; 
    private ArrayList<String> mascotas;

    public ServicioMascota() {
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    public void crearMascota() {
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        String mascota= nombre + " " + apodo + " " + tipo;
        
        mascotas.add(mascota);

    }
    
    public void mostrarMascota(){
        System.out.println("Las mascotas actuales de la Lista mascotas son");
        for (String mascota : mascotas) {
            System.out.println(mascota);
        }
        
        System.out.println("Cantidad = "+mascotas.size());
    
    }
    
    public void eliminarMascotas(int index){
        if(index<=(mascotas.size()-1)){
            mascotas.remove(index);
        }else{
            System.out.println("Dallo al eliminar, el indice es erroneo");
        }
    }
    
    
    public static void main(String[] args) {
        ServicioMascota servMasc= new ServicioMascota();
        servMasc.crearMascota();
        servMasc.crearMascota();
        
        servMasc.mostrarMascota();
    }
}
