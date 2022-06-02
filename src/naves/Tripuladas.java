
package naves;

public class Tripuladas extends Principal {
    public Tripuladas(){
        this.nombre = "Tripuladas";
    this.carga = 300;
    this.peso = 100;
    this.longitud = 150;
    this.tripulacion = true;
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
