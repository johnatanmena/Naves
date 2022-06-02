
package naves;

import java.util.Scanner;

public  class Lanzadera extends Principal{
     Scanner in = new Scanner(System.in);
    boolean mensaje;
    public Lanzadera(){
    this.nombre = "Lanzadera";
    this.carga = 118;
    this.peso = 3500;
    this.longitud = 200;
    this.tripulacion = false;
    this.combustible = true;
    this.gravedad = false;
    }
  public void mensaje(){
   System.out.println("¿Esta nave tiene tripulación?");
   mensaje = in.nextBoolean();
   if(mensaje == true){
   this.tripulacion = true;
   }
   else{
   this.tripulacion = false;
   }
   }
     
    public void orbita(){
    this.peso = 0;
    this.carga = 0;
    this.gravedad = false;
    };
    @Override
    public void entierra(){
        this.combustible = false;
        this.gravedad = true;
    }
  
}
