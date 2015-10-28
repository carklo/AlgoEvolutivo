/**
 * 
 * @author Santiago
 *
 */
public class Generacion 
{	
	/**
	 * Lista de individuos (carros)
	 */
	private Individuo[] individuos;

	/**
	 * Transicion que se elijio para el transporte prioritario en este generacion
	 */
	private Transicion fase;
	
	/**
	 * 
	 * @param NumIndividuos
	 */
	public Generacion(int NumIndividuos)
	{
		individuos = new Individuo[NumIndividuos];
	}
	
	public void generarCaracteristicas()
	{
		for(int i = 0; i< individuos.length;i++)
		{
			Individuo in = null;
			in = new Individuo();
			in.generarCromosoma();
			individuos[i] = in;
		}
	}
	

	/**
	 * @return the individuos
	 */
	public Individuo[] getIndividuos() {
		return individuos;
	}

	/**
	 * @param individuos the individuos to set
	 */
	public void setIndividuos(Individuo[] individuos) 
	{
		this.individuos = individuos;
	}

	/**
	 * @return the fase
	 */
	public Transicion getFase() {
		return fase;
	}

	/**
	 * @param fase the fase to set
	 */
	public void setFase(Transicion fase) {
		this.fase = fase;
	}
		
}
