/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionesvideo;

import java.util.*;

/**
 *
 * @author USURIO
 */
public class V6 {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Lola");
        nombres.add("Rodman");
        nombres.add("Chiquito");

//        for (String nombre : nombres) {
//            if(nombre.equals("Lola")){
//                nombres.remove(nombre);
//            }
//        }
//        for (int i = 0; i < nombres.size(); i++) {
//            String m = nombres.get(i);
//            if(m.equals("Lola")){
//                nombres.remove(m);
//            }
//        }
//
//        nombres.forEach((e) -> System.out.println(e));
//iterator
        Iterator<String> it = nombres.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals("Lola")) {
                it.remove();
            }

            System.out.println(aux);

        }
    }
    
    ArrayList<ArrayList<String>> matriz = new ArrayList();

}
