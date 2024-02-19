
package co.edu.unipiloto.estdatos.tallergen.mundo;


public class Computador extends Electronico {
    
    public enum sistema{
    
    WINDOS, LINUX, MAC
    }
    private sistema SISTEMA;
    
    
   

    public Computador(sistema SISTEMA, Gama pGama, double pPrecio) {
        super(pGama, pPrecio);
        this.SISTEMA = SISTEMA;
    }
    
   @Override
public String toString() {
 
        return " Computador con sistema operativo " + SISTEMA + ", gamma " + gama + ",  precio: " + precio;
    }
        
    
}


