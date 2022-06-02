
package naves;

public abstract class Principal {
    public String nombre;
    public int peso; 
    public int longitud;
    public int carga;
    public boolean tripulacion;
    public boolean combustible = false;
    public boolean gravedad = false;
    public Principal(){
    this.carga = 2000;
    this.peso = 4000;
    this.longitud = 100;
    this.tripulacion = true;
    }
    public abstract void orbita();
       public void entierra(){
       this.combustible = true;
       this.gravedad = true;
       }
   
    
}

