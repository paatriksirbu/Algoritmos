https://github.com/paatriksirbu/Algoritmos/tree/master



# Algoritmos en la Vida Diaria - Análisis Profundo y Aplicaciones Prácticas con The Algorithms.
Reflexiona sobre las actividades cotidianas que realizas e identifica algoritmos implícitos en ellas. Investiga cómo estos algoritmos pueden mejorar tareas específicas, como la organización de tus actividades diarias o la gestión de tu presupuesto personal.

### Descripcion
A lo largo del dia a dia, nos encontramos con diferentes tareas que debemos llevar a cabo y sobre todo, planificar. Muchas veces nos pasa que van saliendo tareas nuevas y no sabemos como organizarlas u ordenarlas para realizarlas. Por ello, la mayoria de personas, 
organizan su dia escribiendo en algun cuaderno o aplicacion las tareas que tienen que hacer ese dia, que, normalmente, las vamos escribiendo segun se nos vienen a la cabeza y no segun su prioridad. Pues, con este algoritmo lo que vamos a conseguir es ordenar estas tareas que tenemos que hacer mediante el algoritmo QuickSort.

La idea del algoritmo es simple, se basa en la division en particiones de la lista a ordenar. Es posiblemente el metodo mas pequeño de código, más elegante, más rápido, más interesante y más eficiente de los algoritmos conocidos de ordenación. Se basa en
dividir los n elementos de la lista a ordenar en dos partes o particiones separadas por un elemento: una particion izquierda, un elemento central denominado pivote y una particion derecha. Las dos sublistas se ordenan independientemente.

Por lo tanto, lo que se ha hecho para este ejercicio es obtener el algoritmo de la pagina que se nos ofrece (the-algorithms.com), junto al SortAlgorithm y SortUtils. Todos estos archivos se encuentran en **src/sorts**.
Una vez ya tengamos el algoritmo completo, vamos a crear una clase Tarea donde definamos las variables, contructores y los metodos compareTo (para determinar el orden de prioridad ) y toString (para representar/imprimir las tareas).

En el metodo main, creamos un array de tareas donde se van a crear tareas como lo hariamos normalmente con las tareas que tenemos que llevar a cabo a lo largo del dia o de la semana, aqui debemos asignar un nombre a la tarea y una prioridad, para asi, poder ordenarlas.
Despues de crearlas, lo unico que queda es que el algoritmo QuickSort ordene las tareas en funcion de su prioridad de manera ascendente 1-5 y que se recorra el array con un foreach y nos muestre la lista de tareas ordenada.

### Referencias

Las referencias que he usado han sido la pagina de the-algorithms, los apuntes del campus, apuntes de Estructura de Datos del primer año y el libro Estructura de datos en Java de Luis Joyanes Aguilar.

`Algoritmos` fue creado por <a>Patrik Paul Sirbu</a>.
