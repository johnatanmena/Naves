
package naves;

import java.util.Scanner;

public class Naves {
     public static void main(String args[]){
         Scanner in = new Scanner(System.in);
         int menu;
         menu = 1;
         do{
         Principal nave;
         boolean isLanzadera = true;
         boolean isTripuladas = true;
         boolean isNotripuladas = true;
         boolean isSatelite = true;
         if(isLanzadera){
         nave = new Lanzadera();
         System.out.print("Nombre de la nave: ");
         System.out.println(nave.nombre);
         System.out.print("carga de la nave: ");
         System.out.println(nave.carga);
         System.out.print("Tripulación de la nave: ");
         System.out.println(nave.tripulacion);
         System.out.print("Combustible de la nave: ");
         System.out.println(nave.combustible);
         System.out.print("Combustible de la nave: ");
         System.out.println(nave.longitud);
         }
         if(isTripuladas){
         nave = new Tripuladas();
         System.out.print("Nombre de la nave: ");
         System.out.println(nave.nombre);
         System.out.print("carga de la nave: ");
         System.out.println(nave.carga);
         System.out.print("Tripulación de la nave: ");
         System.out.println(nave.tripulacion);
         System.out.print("Combustible de la nave: ");
         System.out.println(nave.combustible);
         System.out.println(nave.longitud);
         }
         if(isNotripuladas){
         nave = new Notripuladas();
         System.out.print("Nombre de la nave: ");
         System.out.println(nave.nombre);
         System.out.print("carga de la nave: ");
         System.out.println(nave.carga);
         System.out.print("Tripulación de la nave: ");
         System.out.println(nave.tripulacion);
         System.out.print("Combustible de la nave: ");
         System.out.println(nave.combustible);
         System.out.println(nave.longitud);
         
         }
          if(isSatelite){
         nave = new Satelite();
         System.out.print("Nombre de la nave: ");
         System.out.println(nave.nombre);
         System.out.print("carga de la nave: ");
         System.out.println(nave.carga);
         System.out.print("Tripulación de la nave: ");
         System.out.println(nave.tripulacion);
         System.out.print("Combustible de la nave: ");
         System.out.println(nave.combustible);
         System.out.println(nave.longitud);
         
         }
         System.out.println("Presione 2 para cerrar el programa");
         menu = in.nextInt();
         }while(menu != 2);
         
     }
     
}

