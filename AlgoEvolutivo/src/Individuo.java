/**
 * 
 * @author Santiago
 *
 */
public class Individuo 
{
	/**
	 * Arreglo que representa un cromosoma de un individuo
	 */
	private int[] cromosoma;
	
	/**
	 * Valor de penalizacion del individuo debido a congestion o destino inalcanzable
	 */
	private int penalizacion;
	
	/**
	 * Valor de prioridad que tiene de transporte el individuo
	 */
	private int prioridad;
	
	/**
	 * Nodo de origen del individuo
	 */
	private int origen;
	
	/**
	 * Nodo destino del individuo
	 */
	private int destino;
	
	/**
	 * Orden de llegada
	 */
	private int ordenLlegada;
	
	/**
	 * Indica si el individuo fue tranferido a su nodo destino
	 */
	private boolean transferido;
	
	/**
	 * 
	 */
	private boolean destinoInalcanzable;

	
	public Individuo()
	{
		cromosoma = new int[Constantes.MAX_LONG];
		destinoInalcanzable = false;
	}
	

	/**
	 * @return the cromosoma
	 */
	public int[] getCromosoma() {
		return cromosoma;
	}

	/**
	 * @param cromosoma the cromosoma to set
	 */
	public void setCromosoma(int[] cromosoma) {
		this.cromosoma = cromosoma;
	}
	
	public void generarCromosoma()
	{
		origen = (int) Math.floor(Math.random()*(4-1+1)+4);
		cromosoma[origen-1] = 1;
		destino = (int) Math.floor(Math.random()*(8-5+5)+5);
		cromosoma[destino-1] = 1;
		for(int  i = 0; i< cromosoma.length;i++)
		{
			if(cromosoma[i] != 1)
			{
				cromosoma[i] = 0;
			}
		}
	}

	/**
	 * @return the origen
	 */
	public int getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(int origen) {
		this.origen = origen;
	}

	/**
	 * @return the destino
	 */
	public int getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(int destino) {
		this.destino = destino;
	}

	/**
	 * @return the prioridad
	 */
	public int getPrioridad() {
		return prioridad;
	}

	/**
	 * @param prioridad the prioridad to set
	 */
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	/**
	 * @return the penalizacion
	 */
	public int getPenalizacion() {
		return penalizacion;
	}

	/**
	 * @param penalizacion the penalizacion to set
	 */
	public void setPenalizacion(int penalizacion) {
		this.penalizacion = penalizacion;
	}

	/**
	 * @return the ordenLlegada
	 */
	public int getOrdenLlegada() {
		return ordenLlegada;
	}

	/**
	 * @param ordenLlegada the ordenLlegada to set
	 */
	public void setOrdenLlegada(int ordenLlegada) {
		this.ordenLlegada = ordenLlegada;
	}
	
	/**
	 * @return the destinoInalcanzable
	 */
	public boolean isDestinoInalcanzable() {
		return destinoInalcanzable;
	}

	/**
	 * @param destinoInalcanzable the destinoInalcanzable to set
	 */
	public void setDestinoInalcanzable(boolean destinoInalcanzable) {
		this.destinoInalcanzable = destinoInalcanzable;
	}


	/**
	 * @return the transferido
	 */
	public boolean isTransferido() {
		return transferido;
	}


	/**
	 * @param transferido the transferido to set
	 */
	public void setTransferido(boolean transferido) {
		this.transferido = transferido;
	}
}
