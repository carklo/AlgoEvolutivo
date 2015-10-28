/**
 * Clase encarga de generar todas las posibles transiciones que 
 * se pueden dar en un estado de la interseccion
 * @author Santiago
 *
 */
public class GeneradorTransiciones 
{
	/**
	 * 
	 */
	private Transicion[] fases;
	
	

	/**
	 * @return the fases
	 */
	public Transicion[] getFases() {
		return fases;
	}

	/**
	 * @param fases the fases to set
	 */
	public void setFases(Transicion[] fases) {
		this.fases = fases;
	}
}
