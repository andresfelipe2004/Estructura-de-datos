package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario{
		
	

	public enum marca
        
        {
         GEF, POLO, NAUTICA
                 
                 
        }
  
        protected marca MARCA;
        
	private marca marca;
	
	public Camisa(marca pMarca, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
		marca = pMarca;
	}
	
	public String toString()
	{
		return "Camisa "+marca + " Talla "+talla + "($ "+precio + ")";
	}

}
