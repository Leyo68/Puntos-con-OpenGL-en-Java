# Puntos con OpenGL en Java
Esta aplicación presenta una cuadrícula en pantalla completa utilizando sólo puntos, cada cuadro tiene un ancho y alto de 30 unidades.

El programa fue escrito en el lenguaje Java con ayuda del entorno de desarrollo Netbeans.
En las siguientes líneas se presenta una descripción de cada captura de pantalla que fue tomada al código fuente, esto con el fin de que el lector pueda comprender el manejo de las funciones. finalmente se presenta los resultados del programa, en este caso un screenshot donde se puede apreciar una cuadrícula en pantalla completa formada por puntos.


**### Código Fuente**


Para elaborar un programa es indispensable hacer uso de las librerías, es por ello que se presenta las librerías usadas en este programa.

![image](https://user-images.githubusercontent.com/71055467/132550231-ca5c0376-f946-40e5-b6e6-583694e12499.png)

Las clases son fundamentales y en este caso la principal se llama Puntos la cual hereda de JFrame, con esto nos permite dibujar la ventana. En esta clase se encuentra una declaración de variables, el constructor y unas clases más que más adelante se explica.

![image](https://user-images.githubusercontent.com/71055467/132550895-d4267b5f-6759-4edb-8c32-ff5cdb289702.png)

En el constructor se determinan características de la ventana como son; alto, ancho, localización, título, entre otros. Para obtener el ancho y alto se hace uso de la clase Toolkit que a su vez nos será de mucha utilidad más adelante.

![image](https://user-images.githubusercontent.com/71055467/132551503-edf3fd00-9645-4a46-b7a8-bf89d3779816.png)

Un programa por más básico que sea siempre va a contener la función principal ya que es desde esta función donde empieza a ejecutarse el programa, y en este caso no es la excepción. En esta función se instancia la clase Puntos y con los métodos correspondientes se hace visible la ventana también, al cerrar la ventana la aplicación también finalice.

![image](https://user-images.githubusercontent.com/71055467/132551933-c7206a5e-0e77-42e0-9b4a-90a58e6e3faa.png)

La clase GraphicListener implementa la interfaz GLEventListener que a su vez contiene una serie de funciones que son útilies para  pintar los puntos.
El primero de los métodos que podemos ver en el código es init. Este ayuda a definir las características que va a tener la ventana en donde se irán pintando en este caso los puntos. Una de las características con el color de fondo, dimensiones así como el modo proyección.

![image](https://user-images.githubusercontent.com/71055467/132552668-7ba02cec-c372-4289-aae5-1baac6c1044c.png)

Hasta ahora sólo hemos visto las funciones básicas de un programa, pero lo que realmente importa en esta ocasión es el método siguiente, porque es en este apartado donde definimos la lógica del programa para que vaya pintando cada punto seguido del otro y así sucesivamente hasta formar una cuadrícula en toda la pantalla.

Empezamos por definir el tamaño del punto en pixeles, después se indica que a continuación se van a pintar puntos pasando por parámetro GL.GL_POINTS, en la siguiente línea se define el color de dicho punto y en el siguiente for anidado se especifica como es que tiene que pintar los puntos haciendo uso también de Vertex2f para indicar en qué coordenada pueda pintar.
El for anidado se aplica dos veces porque uno nos sirve para pintar los puntos de forma horizontal y el otro de forma vertical.
La penúltima sentencia indica que ya no se pintarán más puntos y la última sentencia del método display ordena que todas las funciones anteriores se ejecuten.

![image](https://user-images.githubusercontent.com/71055467/132552838-20d63420-4192-42ad-8452-39fb769636a1.png)

Las últimas dos funciones son parte de la interfaz GLEventListener pero en esta ocasión no haremos uso de ella.

**### Ejecución del programa**

En la siguiente pantalla se presenta la captura donde podemos ver el resultado de todo el código que hemos explicado anteriormente.

![image](https://user-images.githubusercontent.com/71055467/132556251-7d2af70d-db82-4f64-99ad-14b30cdf95b6.png)
