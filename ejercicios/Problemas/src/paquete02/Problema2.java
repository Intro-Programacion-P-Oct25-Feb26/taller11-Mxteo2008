/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String viviendas[] = nombreViviendas();
        double gastoMensual[][] = gastoMensual(viviendas);
        double gastoAnual[] = gastoAnual(gastoMensual);
        reporteFinal(viviendas, gastoAnual);

    }

    public static String[] nombreViviendas() {
        String nombre;
        String z[] = new String[10];
        for (int i = 0; i < z.length; i++) {
            System.out.printf("Ingrese el número de la vivienda %s\n", i+1);
            nombre = entrada.nextLine();
            z[i] = nombre;
        }
        return z;
    }

    public static double[][] gastoMensual(String[] casa) {
        double gastoMensual;
        double z[][] = new double[10][12];
        for (int i = 0; i < z.length; i++) {
            System.out.printf("Ingrese los gastos de la vivienda %s:\n",
                    casa[i]);
            for (int j = 0; j < z[i].length; j++) {
                System.out.printf("mes %s\n", j + 1);
                gastoMensual = entrada.nextDouble();
                z[i][j] = gastoMensual;
            }
        }
        return z;
    }

    public static double[] gastoAnual(double[][] anual) {
        double z[] = new double[10];
        for (int i = 0; i < anual.length; i++) {
            double suma = 0;
            for (int j = 0; j < anual[i].length; j++) {
                suma = suma + anual[i][j];
            }
            z[i] = suma;
        }
        return z;
    }
    public static void reporteFinal(String [] casa, double[] anual){
        String cadena = "";
        for(int i = 0; i < casa.length; i++){
            cadena = String.format("%sVivienda %s\nGasto anual: %.2f", cadena, 
                    casa[i], anual[i]);
            
        
        }
        System.out.printf(cadena);
    
    }

}
