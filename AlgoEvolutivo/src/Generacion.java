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
	 * Individuos que en esta generacion lograron cruzar en el nodo
	 */
	private ArrayList<Individuo> individuosTransferidosNodo1;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosTransferidosNodo2;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosTransferidosNodo3;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosTransferidosNodo4;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosRemanentesNodo1;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosRemanentesNodo2;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosRemanentesNodo3;
	
	/**
	 * 
	 */
	private ArrayList<Individuo> individuosRemanentesNodo4;
	
	

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
		individuosTransferidosNodo1 = new ArrayList<>();
		individuosTransferidosNodo2 = new ArrayList<>();
		individuosTransferidosNodo3 = new ArrayList<>();
		individuosRemanentesNodo1 = new ArrayList<>();
		individuosRemanentesNodo2 = new ArrayList<>();
		individuosRemanentesNodo3 = new ArrayList<>();
		individuosRemanentesNodo4 = new ArrayList<>();
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
	
	public void calcularIndividuosTransferidos(int nodoOrigen)
	{
		if(nodoOrigen == 1)
		{
			for (Individuo individuo : individuosNodo1) 
			{
				if(individuo.isTransferido())
				{
					individuosTransferidosNodo1.add(individuo);
				}
				else
				{
					individuosRemanentesNodo1.add(individuo);
				}
			}
		}
		else if(nodoOrigen == 2)
		{
			for (Individuo individuo : individuosNodo2) 
			{
				if(individuo.isTransferido())
				{
					individuosTransferidosNodo2.add(individuo);
				}
				else
				{
					individuosRemanentesNodo2.add(individuo);
				}
			}
		}
		else if(nodoOrigen == 3)
		{
			for (Individuo individuo : individuosNodo3)
			{
				if(individuo.isTransferido())
				{
					individuosTransferidosNodo3.add(individuo);
				}
				else
				{
					individuosRemanentesNodo3.add(individuo);
				}
			}
		}
		else
		{
			for (Individuo individuo : individuosNodo4)
			{
				if(individuo.isTransferido())
				{
					individuosTransferidosNodo4.add(individuo);
				}
				else
				{
					individuosRemanentesNodo4.add(individuo);
				}
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

	/**
	 * @return the individuosTransferidosNodo1
	 */
	public ArrayList<Individuo> getIndividuosTransferidosNodo1() {
		return individuosTransferidosNodo1;
	}

	/**
	 * @param individuosTransferidosNodo1 the individuosTransferidosNodo1 to set
	 */
	public void setIndividuosTransferidosNodo1(ArrayList<Individuo> individuosTransferidosNodo1) {
		this.individuosTransferidosNodo1 = individuosTransferidosNodo1;
	}

	/**
	 * @return the individuosTransferidosNodo2
	 */
	public ArrayList<Individuo> getIndividuosTransferidosNodo2() {
		return individuosTransferidosNodo2;
	}

	/**
	 * @param individuosTransferidosNodo2 the individuosTransferidosNodo2 to set
	 */
	public void setIndividuosTransferidosNodo2(ArrayList<Individuo> individuosTransferidosNodo2) {
		this.individuosTransferidosNodo2 = individuosTransferidosNodo2;
	}

	/**
	 * @return the individuosTranferidosNodo3
	 */
	public ArrayList<Individuo> getIndividuosTranferidosNodo3() {
		return individuosTransferidosNodo3;
	}

	/**
	 * @param individuosTranferidosNodo3 the individuosTranferidosNodo3 to set
	 */
	public void setIndividuosTranferidosNodo3(ArrayList<Individuo> individuosTranferidosNodo3) {
		this.individuosTransferidosNodo3 = individuosTranferidosNodo3;
	}

	/**
	 * @return the individuosTransferidosNodo4
	 */
	public ArrayList<Individuo> getIndividuosTransferidosNodo4() {
		return individuosTransferidosNodo4;
	}

	/**
	 * @param individuosTransferidosNodo4 the individuosTransferidosNodo4 to set
	 */
	public void setIndividuosTransferidosNodo4(ArrayList<Individuo> individuosTransferidosNodo4) {
		this.individuosTransferidosNodo4 = individuosTransferidosNodo4;
	}

	/**
	 * @return the individuosRemanentesNodo1
	 */
	public ArrayList<Individuo> getIndividuosRemanentesNodo1() {
		return individuosRemanentesNodo1;
	}

	/**
	 * @param individuosRemanentesNodo1 the individuosRemanentesNodo1 to set
	 */
	public void setIndividuosRemanentesNodo1(ArrayList<Individuo> individuosRemanentesNodo1) {
		this.individuosRemanentesNodo1 = individuosRemanentesNodo1;
	}

	/**
	 * @return the individuosRemanentesNodo2
	 */
	public ArrayList<Individuo> getIndividuosRemanentesNodo2() {
		return individuosRemanentesNodo2;
	}

	/**
	 * @param individuosRemanentesNodo2 the individuosRemanentesNodo2 to set
	 */
	public void setIndividuosRemanentesNodo2(ArrayList<Individuo> individuosRemanentesNodo2) {
		this.individuosRemanentesNodo2 = individuosRemanentesNodo2;
	}

	/**
	 * @return the individuosRemanentesNodo3
	 */
	public ArrayList<Individuo> getIndividuosRemanentesNodo3() {
		return individuosRemanentesNodo3;
	}

	/**
	 * @param individuosRemanentesNodo3 the individuosRemanentesNodo3 to set
	 */
	public void setIndividuosRemanentesNodo3(ArrayList<Individuo> individuosRemanentesNodo3) {
		this.individuosRemanentesNodo3 = individuosRemanentesNodo3;
	}

	/**
	 * @return the individuosRemanentesNodo4
	 */
	public ArrayList<Individuo> getIndividuosRemanentesNodo4() {
		return individuosRemanentesNodo4;
	}

	/**
	 * @param individuosRemanentesNodo4 the individuosRemanentesNodo4 to set
	 */
	public void setIndividuosRemanentesNodo4(ArrayList<Individuo> individuosRemanentesNodo4) {
		this.individuosRemanentesNodo4 = individuosRemanentesNodo4;
	}

}
