/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema3 {
    static Scanner entrada = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipo;
        System.out.println("Ingrese el 1 para calcular el área del cuadrado, "
                + "2 para el área de triangulo y 3 para el del rectángulo");
        tipo = entrada.nextInt();
        
        switch (tipo){
            case 1:
                obtenerAreaCuadrado();
                break;
            case 2:
                obtenerAreaTriangulo();
                break;
            case 3:
                obtenerAreaRectangulo();
                break;
            default:
                System.out.println("Opción no válida");
             
            }
    
    }
    public static void obtenerAreaCuadrado(){
        double lado;
        double area;
        System.out.println("Ingrese uno de los lados del cuadrado");
        lado = entrada.nextDouble();
        
        area = lado * 2;
        System.out.printf("El área es: %s\n", area);

    }
    public static void obtenerAreaTriangulo(){
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del triángulo");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo");
        altura = entrada.nextDouble();
        
        area = (base * altura)/2;
        System.out.printf("El área es: %s\n", area);

    }
    
    public static void obtenerAreaRectangulo(){
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base del rectángulo");
        base = entrada.nextDouble();
        
        System.out.println("Ingrese la altura del rectángulo");
        altura = entrada.nextDouble();
        
        area = base * altura;
        System.out.printf("El área es: %s\n", area);

    }
}
