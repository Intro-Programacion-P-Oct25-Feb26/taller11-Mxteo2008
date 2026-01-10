/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double mediaAritmetica = obtenerMedia(informacion);

        double desviacionEstandar = obtenerDesviacion(informacion, 
                mediaAritmetica);

       
        System.out.printf("La media aritmética es: %.2f\n", mediaAritmetica);
        System.out.printf("La desviación estándar es: %.2f\n", 
                desviacionEstandar);
    }

    public static double obtenerMedia(int[] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        return suma / datos.length;
    }

    public static double obtenerDesviacion(int[] datos, double media) {
        double sumaDiferencias = 0;
        for (int i = 0; i < datos.length; i++) {
            
            sumaDiferencias = sumaDiferencias + Math.pow(datos[i] - media, 2);
        }
 
        double varianza = sumaDiferencias / datos.length;
        return Math.sqrt(varianza);
    }
}
    

