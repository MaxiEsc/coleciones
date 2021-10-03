package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

//        Ejemplo de funcion flecha apartir de java version 8
//        for(Object object : miLista) {
//            System.out.print(" | Elemento: " + object + " |->");
//        }
        imprimir(miLista);

        System.out.println("______________________");

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");

        imprimir(miSet);

        // Map<String, String> miMapa = new HashMap<String, String>();
        Map miMapa = new HashMap();
        miMapa.put("valor_1", "3");
        miMapa.put("valor_2", "4");
        miMapa.put("valor_3", "52");
        miMapa.put("valor_4", "6");
        miMapa.put("valor_5", "7");
        miMapa.put("valor_6", "8");
        
        String elemento = (String) miMapa.get("valor_1");
        //System.out.println("elemento = " + elemento);
        
        System.out.println(miMapa.keySet());
        System.out.println(miMapa.values());

    }

    public static void imprimir(Collection c) {
        c.forEach(i -> {
            System.out.println("Elemento: " + i);
        });
    }
}
