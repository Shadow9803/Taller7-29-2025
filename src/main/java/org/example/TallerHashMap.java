package org.example;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class TallerHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HashMap<Integer, String>> lista = new ArrayList<>();
        int opcion = 0;
        while (opcion != 5) {
            //Este es el cuerpesito del Menu
            System.out.println("\n--- MENÚ Diccionario ---");
            System.out.println("1 Agregar");
            System.out.println("2 Mostrar");
            System.out.println("3 Modificar");
            System.out.println("4 Eliminar");
            System.out.println("5 Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            //Lista de Opcioness
            if (opcion == 1) {
                System.out.print("Numero de ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingresame el Valor ps (texto): ");
                String valor = sc.nextLine();
                HashMap<Integer, String> entrada = new HashMap<>();
                entrada.put(id, valor);
                lista.add(entrada);
                System.out.print(" Entrada agregada.");

            } else if (opcion == 2) {
                System.out.print("-- Mostrar todas las entradas --");
                for (HashMap<Integer, String> e : lista) {
                    for (Integer clave : e.keySet()) {
                        System.out.print("ID: " + clave + " → " + e.get(clave));
                    }
                }

            } else if (opcion == 3) {
                System.out.print("ID que queres modificar: ");
                int idBusq = sc.nextInt();
                sc.nextLine();
                boolean encontrado = false;
                for (HashMap<Integer, String> e : lista) {
                    if (e.containsKey(idBusq)) {
                        System.out.print("Nuevo valor: ");
                        String nuevo = sc.nextLine();
                        e.put(idBusq, nuevo);  // Los put agregan o actualizan informacion mi pez
                        System.out.print("✅ Ya esta modificado.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.print(" Inexistente mi perro .");
                }

            } else if (opcion == 4) {
                System.out.print("ID a eliminar: ");
                int idDel = sc.nextInt();
                sc.nextLine();
                boolean borrado = false;
                for (int i = 0; i < lista.size(); i++) {
                    HashMap<Integer, String> e = lista.get(i); //los get son para recuperar
                    if (e.containsKey(idDel)) {
                        lista.remove(i); //los remove nos sirven para quitar
                        System.out.println(" Se elimino registro con ese ID " + idDel);
                        borrado = true;
                        break;
                    }
                }
                if (!borrado) {
                    System.out.println("El ID no fue encontrado.");
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
