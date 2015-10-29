import java.util.ArrayList;

/**
 * 
 * @author Santiago
 *
 */
public class Central 
{
	/**
	 * Una vez se haya ejecutado una generacion se guarda en el 
	 * arreglo de generaciones
	 */
	private ArrayList<Generacion> generaciones;
	
	/**
	 * 
	 */
	private Generacion generacionActual;
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		
	}

	public int calcularCongestionNodoDestino(int nodoDestino)
	{
		int congestion = 0;
		for (Generacion generacion : generaciones) 
		{
			generacion.calcularIndividuosTransferidos(1);
			generacion.calcularIndividuosTransferidos(2);
			generacion.calcularIndividuosTransferidos(3);
			generacion.calcularIndividuosTransferidos(4);
			
			ArrayList<Individuo> individuos1 = generacion.getIndividuosTransferidosNodo1();
			for (Individuo individuo : individuos1) 
			{
				if(individuo.isFueraDelSistema() == false && individuo.getDestino() == nodoDestino)
				{
					congestion+=1;
				}
			}

			ArrayList<Individuo> individuos2 = generacion.getIndividuosTransferidosNodo2();
			for (Individuo individuo : individuos2) 
			{
				if(individuo.isFueraDelSistema() == false && individuo.getDestino() == nodoDestino)
				{
					congestion+=1;
				}
			}
		
			ArrayList<Individuo> individuos3 = generacion.getIndividuosTranferidosNodo3();
			for (Individuo individuo : individuos3) 
			{
				if(individuo.isFueraDelSistema() == false && individuo.getDestino() == nodoDestino)
				{
					congestion+=1;
				}
			}
				ArrayList<Individuo> individuos4 = generacion.getIndividuosTransferidosNodo4();
				for (Individuo individuo : individuos4) 
				{
					if(individuo.isFueraDelSistema() == false)
					{
						congestion+=1;
					}
				}
		}
		return congestion;
	}

	/**
	 * @return the generaciones
	 */
	public ArrayList<Generacion> getGeneraciones() {
		return generaciones;
	}



	/**
	 * @param generaciones the generaciones to set
	 */
	public void setGeneraciones(ArrayList<Generacion> generaciones) {
		this.generaciones = generaciones;
	}

	/**
	 * @return the generacionActual
	 */
	public Generacion getGeneracionActual() {
		return generacionActual;
	}

	/**
	 * @param generacionActual the generacionActual to set
	 */
	public void setGeneracionActual(Generacion generacionActual) {
		this.generacionActual = generacionActual;
	}
}
