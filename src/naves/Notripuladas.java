
package naves;
import java.util.Scanner;

public class Notripuladas extends Principal{

    boolean mensaje;
    public Notripuladas(){
    this.nombre = "No tripuladas";
    this.carga = 0;
    this.peso = 80;
    this.longitud = 50;
    this.tripulacion = false;
    this.combustible = true;
    this.gravedad = false;
  
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
