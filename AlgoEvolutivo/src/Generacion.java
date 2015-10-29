import java.util.ArrayList;

/**
 * 
 * @author Santiago
 *
 */
public class Generacion 
{	
	/**
	 * Lista de individuos totales(carros)
	 */
	private Individuo[] individuosTotales;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosNodo1;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosNodo2;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosNodo3;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosNodo4;
	
	/**
	 * Transicion que se elijio para el transporte prioritario en este generacion
	 */
	private Transicion fase;
	
	/**
	 * Individuos nuevos producto del cruce
	 */
	private ArrayList<Individuo> individuosCruce;
	
	/**
	 * Individuos nuevos producto de la mutacion
	 */
	private ArrayList<Individuo> individuosMutados;
	
	/**
	 * 
	 * @param NumIndividuos
	 */
	public Generacion(int NumIndividuos)
	{
		individuosTotales = new Individuo[NumIndividuos];
		individuosCruce = new ArrayList<>();
		individuosMutados = new ArrayList<>();
		individuosNodo1 = new ArrayList<>();
		individuosNodo2 = new ArrayList<>();
		individuosNodo3 = new ArrayList<>();
		individuosNodo4 = new ArrayList<>();
		clasificarIndividuosOrigenDestino();
		aplicarOrdenLlegada(individuosNodo1);
		aplicarOrdenLlegada(individuosNodo2);
		aplicarOrdenLlegada(individuosNodo3);
		aplicarOrdenLlegada(individuosNodo4);
	}
	
	public void generarCaracteristicas()
	{
		for(int i = 0; i< individuosTotales.length;i++)
		{
			Individuo in = null;
			in = new Individuo();
			in.generarCromosoma();
			individuosTotales[i] = in;
		}
	}
	
	public void clasificarIndividuosOrigenDestino()
	{
		for(int i = 0;i< individuosTotales.length;i++)
		{
			Individuo in = individuosTotales[i];
			int origen = in.getOrigen();
			if(origen == 1)
			{
				individuosNodo1.add(in);
			}
			else if(origen == 2)
			{
				individuosNodo2.add(in);
			}
			else if(origen == 3)
			{
				individuosNodo3.add(in);
			}
			else if(origen == 4)
			{
				individuosNodo4.add(in);
			}
		}
	}
	
	public void aplicarOrdenLlegada(ArrayList<Individuo> individuos)
	{
		for(int i = 0; i<individuos.size();i++)
		{
			if(i<=4)
			{
				individuos.get(i).setOrdenLlegada(1);
			}
			else if(i>4 && i<=8)
			{
				individuos.get(i).setOrdenLlegada(2);
			}
			else if(i>8 && i<=12)
			{
				individuos.get(i).setOrdenLlegada(3);
			}
			else if(i>12 && i<=16)
			{
				individuos.get(i).setOrdenLlegada(4);
			}
			else if(i>16 && i<=20)
			{
				individuos.get(i).setOrdenLlegada(5);
			}
		}
	}
	/**
	 * @return the individuos
	 */
	public Individuo[] getIndividuos() {
		return individuosTotales;
	}

	/**
	 * @param individuos the individuos to set
	 */
	public void setIndividuos(Individuo[] individuos) 
	{
		this.individuosTotales = individuos;
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

	/**
	 * @return the nuevosIndividuosCruce
	 */
	public ArrayList<Individuo> getNuevosIndividuosCruce() {
		return individuosCruce;
	}

	/**
	 * @param nuevosIndividuosCruce the nuevosIndividuosCruce to set
	 */
	public void setNuevosIndividuosCruce(ArrayList<Individuo> nuevosIndividuosCruce) {
		this.individuosCruce = nuevosIndividuosCruce;
	}

	/**
	 * @return the individuosMutados
	 */
	public ArrayList<Individuo> getIndividuosMutados() {
		return individuosMutados;
	}

	/**
	 * @param individuosMutados the individuosMutados to set
	 */
	public void setIndividuosMutados(ArrayList<Individuo> individuosMutados) {
		this.individuosMutados = individuosMutados;
	}
	
	
	/**
	 * @return the individuosCruce
	 */
	public ArrayList<Individuo> getIndividuosCruce() {
		return individuosCruce;
	}

	/**
	 * @param individuosCruce the individuosCruce to set
	 */
	public void setIndividuosCruce(ArrayList<Individuo> individuosCruce) {
		this.individuosCruce = individuosCruce;
	}
	
	/**
	 * @return the individuosTotales
	 */
	public Individuo[] getIndividuosTotales() {
		return individuosTotales;
	}

	/**
	 * @param individuosTotales the individuosTotales to set
	 */
	public void setIndividuosTotales(Individuo[] individuosTotales) {
		this.individuosTotales = individuosTotales;
	}

	/**
	 * @return the individuosNodo1
	 */
	public ArrayList<Individuo> getIndividuosNodo1() {
		return individuosNodo1;
	}

	/**
	 * @param individuosNodo1 the individuosNodo1 to set
	 */
	public void setIndividuosNodo1(ArrayList<Individuo> individuosNodo1) {
		this.individuosNodo1 = individuosNodo1;
	}

	/**
	 * @return the individuosNodo2
	 */
	public ArrayList<Individuo> getIndividuosNodo2() {
		return individuosNodo2;
	}

	/**
	 * @param individuosNodo2 the individuosNodo2 to set
	 */
	public void setIndividuosNodo2(ArrayList<Individuo> individuosNodo2) {
		this.individuosNodo2 = individuosNodo2;
	}

	/**
	 * @return the individuosNodo4
	 */
	public ArrayList<Individuo> getIndividuosNodo4() {
		return individuosNodo4;
	}

	/**
	 * @param individuosNodo4 the individuosNodo4 to set
	 */
	public void setIndividuosNodo4(ArrayList<Individuo> individuosNodo4) {
		this.individuosNodo4 = individuosNodo4;
	}

	/**
	 * @return the individuosNodo3
	 */
	public ArrayList<Individuo> getIndividuosNodo3() {
		return individuosNodo3;
	}

	/**
	 * @param individuosNodo3 the individuosNodo3 to set
	 */
	public void setIndividuosNodo3(ArrayList<Individuo> individuosNodo3) {
		this.individuosNodo3 = individuosNodo3;
	}


}
