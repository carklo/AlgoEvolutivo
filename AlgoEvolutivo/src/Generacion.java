public class Generacion 
{	
	/**
	 * Lista de individuos (carros)
	 */
	private Individuo[] individuos;

	
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
		
}
