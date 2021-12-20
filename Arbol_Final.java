package Examen;

import java.util.Scanner;


public class Arbol_Final {


    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";


    public static void main(String[] args) {
        String orden,valor;
         
        Scanner op = new Scanner(System.in);
        Arbol_Binario Cadena = new Arbol_Binario();

        // CAPTURA DE DATOS
        while (true) {
            System.out.println(ANSI_YELLOW + "Cuando quiera dejar de agregar datos escriba 'Parar'\nIngrese el valor a agregar " + ANSI_YELLOW);
            valor = op.nextLine();
            if (valor.equalsIgnoreCase("parar")) {
                break;
            } else {
                Cadena.insertar(valor);
            }
        }

        System.out.println(ANSI_PURPLE + "cual orden quiere?"
                + "\t1.- Pre-orden"
                + "\t2.- In-orden"
                + "\t3.- Post-orden" + ANSI_PURPLE);
        orden = op.nextLine();

        switch (Integer.parseInt(orden)) {
            case 1: //pre-orden
                System.out.println("Recorriendo preorden:");
                Cadena.preorden();
                break;
            case 2: //in-orden
                System.out.println("Recorriendo inorden:");
                Cadena.inorden();

                break;
            case 3: //post-orden
                System.out.println("Recorriendo postorden:");
                Cadena.postorden();
                break;

        }
        //exportacion de lista ordenada por inorden
        System.out.println(ANSI_GREEN + "Lista exportada ingresados: " + ANSI_GREEN);

        Cadena.inorden();

        //busqueda
        
    }

}
