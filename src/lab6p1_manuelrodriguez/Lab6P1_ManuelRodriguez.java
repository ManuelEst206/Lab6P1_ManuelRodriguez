/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_manuelrodriguez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author manu_
 */
public class Lab6P1_ManuelRodriguez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        do{
            System.out.println("======MENU======");
            System.out.println("1. Drunk Dazed");
            System.out.println("2. SubArrays Manual");
            System.out.println("3. Busqueda Lineal");
            System.out.println("4. Salir");
            System.out.println("================");
            System.out.print("Seleccione una opcion: ");
            option = scanner.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("=DRUNK DAZED=");
                    break;
                case 2:
                    System.out.println("=SUBARRAYS MANUAL=");
                    subArraysManual(scanner);
                    break;
                case 3:
                    System.out.println("=BUSQUEDA LINEAL=");
                    busquedaLineal(scanner);
                    break;
                case 4:
                    System.out.println("Eso es todo, terminando...");
                    break;
                default:
                    System.out.println("Invalido, intente de nuevo...");
                
            }
        }while(option!=4);
        
    }//fin del main
    
    public static void drunkDazed(Scanner scanner){
        char[] arreglo = new char[11];
        
        for (int i = 0; i < arreglo.length; i++) {
            
        }
    }
    public static void subArraysManual(Scanner scanner){
        int[] original = new int[10];
        Random ran = new Random();
        System.out.println("Arreglo original: ");
        for (int i = 0; i < original.length; i++) {
            int rd = ran.nextInt(1,50);
            System.out.print("["+rd+"]");
        }
        
    }
    
    public static void busquedaLineal(Scanner scanner){
        int[] arreglo = new int[10];
        Random random = new Random();
       boolean encontrado = false;
        System.out.println("Arreglo generado: ");
        for (int i = 0; i < arreglo.length; i++) {
            int n = random.nextInt(1,50);
            System.out.print("["+n+"]" );
            break;
        }
        scanner.nextLine();
        System.out.print("Ingrese un numero a encontrar: ");
            int numero = scanner.nextInt();
            if(numero == random.nextInt(1,50)){
                System.out.println("El numero fue encontrado.");
            }
    }//fin del metodo

    
}// fin del lab
