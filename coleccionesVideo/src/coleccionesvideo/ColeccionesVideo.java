package coleccionesvideo;

import java.util.ArrayList;

public class ColeccionesVideo {

    public static void main(String[] args) {

        //Video 1 - Arrays
        String[] nombreArray = new String[5];
        for (int i = 0; i < nombreArray.length; i++) {
            nombreArray[i] = "Chiquito " + (i + 1);
        }
        for (String string : nombreArray) {
            System.out.println(string);
        }

        // Collections
        ArrayList<String> nombresArrayList = new ArrayList<>();

        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        System.out.println(nombresArrayList.size());
        nombresArrayList.remove("Chiquito");
        System.out.println(nombresArrayList.size());
        //Valor limite para un ArrayList 
        System.out.println(Integer.MAX_VALUE);
    }

}
