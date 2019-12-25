# Componentes
App de prueba de componentes.

<b>Parte 1: RecyclerView y Filtro de elementos.</b>


 ![alt text](https://github.com/Danlxz/Componentes/blob/master/RecyclerView.png) 


<b>RecyclerView.</b> 
Nuestro RecyclerView se va a "pintar" en función al LayoutManager que reciba como parámetro. 
También hará uso de un Adapter, que funcionará de acuerdo a un Dataset.

<b>LayoutManager.</b> 
Este "gestor del diseño" va a definir la disposición de los elementos. 
Es decir, si van formando una lista vertical u horizontal, si van formando una cuadrícula, u otra variante.

<b>Adapter.</b> 
El adaptador se encargará de adaptar el dataset a lo que finalmente verá el usuario. Es el encargado de traducir datos en UI.

<b>Dataset.</b> 
Es el conjunto de datos que se espera mostrar en el RecyclerView. Se puede representar por un ArrayList de objetos.


# Conceptos

<b>RecyclerView</b>

La clase RecyclerView nos permite mostrar un listado (o bien una grilla) de elementos.
Lleva este nombre porque a medida que se renderizan los elementos de la lista, 
los elementos que dejan de observarse se reciclan para mostrar los elementos siguientes.
RecyclerView es una versión mejorada de la clase ListView.

<b>CardView</b>

Cada elemento del RecyclerView debe tener una UI definida.
Se suele usar la clase CardView para definir la apariencia de cada elemento de un listado.

<b>Relacion RecyclerView y CardView</b>

Hay ocasiones en que se desea mostrar algo bien puntual, sin tener que usar CardViews como contenedores.
Cuando no se requiere usar "tarjetas" con bordes y elevaciones, entonces se puede prescindir de la clase CardView.
En ese caso se podría usar cualquier otro layout para representar a los elementos.

<b>Contexto</b>

Es la interfaz global de información acerca del entorno o una vista de la aplicación. 
Es una clase abstracta que implementa Android.
Permite acceder a los recursos específicos de la aplicación y a sus clases.
