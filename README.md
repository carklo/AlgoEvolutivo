# AlgoEvolutivo
Traffic Optimization Modeling

Cada generacion es una poblacion de individuos, cada generacion tiene un subconjunto de generaciones 
se escoge de entre todas las subgeneracion la mas apta y esa es la que se ejecuta (los carros que van a pasar), 
esa generacion t mas apta sera almacenada en los nodos destinos para ser desechada en el tiempo t+1 
(el desecho de esta generacion va a seguir una funcion de probabilidad, lo mismo que la entrada de carros 
al sistema va a seguir una funcion de probabilidad).

En  la generacion 0 iterar hasta que las capacidades de los nodos destinos alcancen cierto porcentajes (congestion)o hasta 
que se haya desocupado todos los nodos origen lo primero que ocurra.

Se inicializan la poblacion de individuos, se les aplica la funcion de adaptacion 

Funcion adaptacion
Penalizacion (Se cuentan el numero de individuos de una subgeneracion q tienen el mismo nodo destino,
para calcular la posible congestion que se generaria si esa cantidad de individuos se escogieran para pasar al
nodo destino)
num_dest = numero variable (escala) dependiendo de la congestion en el nodo destino (estrictamente menor a num_prohi)
num_prohi = penalizacion por destinos inalcanzables o prohibidos

Prioridad
num_prio = numero variable (escala) de la priorizacion que se le debe dar a un carro dependiendo de la congestion
en el sistema (congestion en un nodo origen)

i es un gen del arreglo que contiene todos los individuos de una generacion
adaptacion[i] = individuo(penalizacion, prioridad); se escogerian los que tuvieran preferiblemente penalizacion 0 o la mas baja
posible y la mas alta prioridad

Funcion cruce
Cruzar los individuos que tienen una buena funcion adaptacion y se hace la seleccion de los 
individuos por metodo de ruleta, se efectua el crossover (intercambiar la parte de la cadena de bits de los destinos), 
se reemplazan los individuos generados por el cruzamiento por los peores individuos mejor adaptados de la generacion generada.

Funcion mutacion

Evaluacion de los individuos
Se efectua de nuevo la funcion de adaptacion de los individuos mejores adaptados despues de la funcion de cruce y mutacion.
Se escogen los mejores individuos, se guardan y se comparan con otras subgeneraciones, la mejor subgeneracion se ejecuta.

Tiempo de llegada -> tiempo de llegada de un carro al sistema
Tiempo de salida -> va a estar dado por la cantidad de tiempo que espera un carro detras de un semaforo	hasta que se habilite
su salida, despues de hacer la evaluacion de individuos se hace la evaluacion de cuanto tiempo se tomaria ejecutar el plan de
ejecucion (basado en un estudio que arroje en promedio cuanto se demora un carro en pasar un semaforo hacia su destino) 
y con las subgeneraciones se escoge la que tenga el mejor valor de fitness y que tome menor tiempo.
