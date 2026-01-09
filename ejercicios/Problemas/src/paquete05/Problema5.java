/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        int[][] resultadoSuma = sumaValores(informacion, informacion2);

        System.out.println("La matriz suma es:");
        for (int i = 0; i < resultadoSuma.length; i++) {
            for (int j = 0; j < resultadoSuma[i].length; j++) {
            
                System.out.printf("%d  ", resultadoSuma[i][j]);
            }
           
        }
    }

    public static int[][] sumaValores(int[][] a, int[][] b) {
     
        int[][] z = new int[3][3];

        for (int i = 0; i < a.length; i++) {
       
            for (int j = 0; j < a[i].length; j++) {
                
                z[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return z;
    }
}
