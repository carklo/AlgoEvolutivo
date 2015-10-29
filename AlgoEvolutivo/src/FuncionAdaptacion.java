import java.util.ArrayList;
import java.util.Collections;

public class FuncionAdaptacion 
{
	
	/**
	 * 
	 */
	private Generacion generacionActual;
	
	/**
	 * 
	 * @param individuos
	 * @param gen
	 */
	public FuncionAdaptacion(Generacion gen)
	{
		generacionActual = gen;
	}
	
	/**
	 * 
	 */
	public void calcularPrioridad()
	{
		ArrayList<Individuo> indiNodo1 = generacionActual.getIndividuosNodo1();
		ArrayList<Individuo> indiNodo2 = generacionActual.getIndividuosNodo2();
		ArrayList<Individuo> indiNodo3 = generacionActual.getIndividuosNodo3();
		ArrayList<Individuo> indiNodo4 = generacionActual.getIndividuosNodo4();

		Individuo lastin1 = indiNodo1.get(indiNodo1.size()-1);
		Individuo lastin2 = indiNodo2.get(indiNodo2.size()-1);
		Individuo lastin3 = indiNodo3.get(indiNodo3.size()-1);
		Individuo lastin4 = indiNodo4.get(indiNodo4.size()-1);

		ArrayList<Integer> congestion = new ArrayList<>();
		congestion.add(lastin1.getOrdenLlegada());
		congestion.add(lastin2.getOrdenLlegada());
		congestion.add(lastin3.getOrdenLlegada());
		congestion.add(lastin4.getOrdenLlegada());

		Collections.sort(congestion);
		for(int i = 0;i<congestion.size();i++)
		{
			int con = congestion.get(i);
			if(i == 0)
			{
				if(lastin1.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo1) 
					{
						ind.setPrioridad(4);
					}
				}
				else if(lastin2.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo2) 
					{
						ind.setPrioridad(4);
					}
				}
				else if(lastin3.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo3) 
					{
						ind.setPrioridad(4);
					}
				}
				else if(lastin4.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo4) 
					{
						ind.setPrioridad(4);
					}
				}
			}
			else if(i == 1)
			{
				if(lastin1.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo1) 
					{
						ind.setPrioridad(3);
					}
				}
				else if(lastin2.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo2) 
					{
						ind.setPrioridad(3);
					}
				}
				else if(lastin3.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo3) 
					{
						ind.setPrioridad(3);
					}
				}
				else if(lastin4.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo4) 
					{
						ind.setPrioridad(3);
					}
				}
			}
			else if(i == 2)
			{
				if(lastin1.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo1) 
					{
						ind.setPrioridad(2);
					}
				}
				else if(lastin2.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo2) 
					{
						ind.setPrioridad(2);
					}
				}
				else if(lastin3.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo3) 
					{
						ind.setPrioridad(2);
					}
				}
				else if(lastin4.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo4) 
					{
						ind.setPrioridad(2);
					}
				}
			}
			else if(i == 3)
			{
				if(lastin1.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo1) 
					{
						ind.setPrioridad(1);
					}
				}
				else if(lastin2.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo2) 
					{
						ind.setPrioridad(1);
					}
				}
				else if(lastin3.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo3) 
					{
						ind.setPrioridad(1);
					}
				}
				else if(lastin4.getOrdenLlegada() == con)
				{
					for (Individuo ind : indiNodo4) 
					{
						ind.setPrioridad(1);
					}
				}
			}
		}

	}
	
	/**
	 * 
	 */
	public void calcularCongestionDestino()
	{
		marcarDestInalcanzables();
		
	}
	
	public void calcularPenalizacion()
	{
		
	}
	
	public void marcarDestInalcanzables()
	{
		ArrayList<Individuo> indiNodo1 = generacionActual.getIndividuosNodo1();
		ArrayList<Individuo> indiNodo2 = generacionActual.getIndividuosNodo2();
		ArrayList<Individuo> indiNodo3 = generacionActual.getIndividuosNodo3();
		ArrayList<Individuo> indiNodo4 = generacionActual.getIndividuosNodo4();
		
		for (Individuo individuo : indiNodo1) 
		{
			if(individuo.getDestino() == 8)
			{
				individuo.setDestinoInalcanzable(true);
			}
		}
		
		for (Individuo individuo : indiNodo2) 
		{
			if(individuo.getDestino() == 5)
			{
				individuo.setDestinoInalcanzable(true);
			}
		}
		
		for (Individuo individuo : indiNodo3) 
		{
			if(individuo.getDestino() == 6)
			{
				individuo.setDestinoInalcanzable(true);
			}
		}
		
		for (Individuo individuo : indiNodo4) 
		{
			if(individuo.getDestino() == 7)
			{
				individuo.setDestinoInalcanzable(true);
			}
		}
	}
	
	
}
