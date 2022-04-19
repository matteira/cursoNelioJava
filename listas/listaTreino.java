package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listaTreino {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Marcio");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Ana");
        lista.add(2, "Marco");
        System.out.println(lista.size());
        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        lista.removeIf(x -> x.charAt(0) == 'M');
        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index do Bob: " + lista.indexOf("Bob"));
        System.out.println("Index do Marco: " + lista.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse
                      (String.valueOf(lista.stream().filter(x -> x.charAt(0) == 'A').findAny()));
        System.out.println(name);
    }
}
