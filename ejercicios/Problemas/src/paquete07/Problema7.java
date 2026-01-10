/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
     
        String[] listaCiudades = ingresarCiudades();

        imprimirCiudadesCortas(listaCiudades);
    }

    public static String[] ingresarCiudades() {
            
        
        System.out.println("¿Cuántas ciudades desea ingresar?");
        int numeroElementos = entrada.nextInt();

        entrada.nextLine(); 
        
        String[] arreglo = new String[numeroElementos];
        
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println("Ingrese la ciudad #" + (i + 1) + ":");
            arreglo[i] = entrada.nextLine();
        }
        
        return arreglo;
    }

 
    public static void imprimirCiudadesCortas(String[] datos) {
        System.out.println("\nCiudades con 4 o 5 letras");
        
        for (int i = 0; i < datos.length; i++) {
            int longitud = datos[i].length();
            
            if (longitud == 4 || longitud == 5) {
                System.out.printf("%s\n", datos[i]);
            }
        }
    }
}
    

