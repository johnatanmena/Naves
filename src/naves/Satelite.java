
package naves;

public class Satelite extends Principal {
      public Satelite(){
    this.nombre = "Satelite";
    this.carga = 0;
    this.peso = 20;
    this.longitud = 20;
    this.tripulacion = false;
    this.combustible = false;
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
