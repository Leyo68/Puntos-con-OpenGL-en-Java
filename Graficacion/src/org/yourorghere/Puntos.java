
package org.yourorghere;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;

/**
 * @author LEODEGARIO
 */
public class Puntos extends JFrame{
    static GL gl;
    static GLU glu;
    
    public Puntos (){
        //Almacena dentro del objeto pantalla el sistema nativo de ventanas
        Toolkit miPantalla=Toolkit.getDefaultToolkit();
        //Proporciona la resolucion de la pantalla,
        Dimension tamanoPantalla=miPantalla.getScreenSize();
        //Se obtiene el alto de la resolucion que se almacenaba en tamanoPantalla
        int alturaPantalla = tamanoPantalla.height;
        //Se obtiene el ancho de la resolucion que se almacenaba en tamanoPantalla
        int anchoPantalla = tamanoPantalla.width;
        //Marco con la mitad de dimensión de la pantalla
        setSize(anchoPantalla, anchoPantalla);
        //Se coloca el marco en el centro
        setLocation(0,0);
        //Se ingresa un título
        setTitle("Puntos con OpenGl en Java");
        //Instanciamos la clase Graphic
        GraphicListener listener = new GraphicListener();
        //Creamos el canvas
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        System.out.println("Ancho: " + anchoPantalla + " Alto: "+ alturaPantalla);
    }

    public static void main (String args[]){
        Puntos frame = new Puntos();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public class GraphicListener implements GLEventListener{
        //Entorno de trabajo
        public void init(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            //Color de inicio
            //              R   G   B   A
            gl.glClearColor(1, 1, 0, 1);
            //Permite usar la pantalla
            gl.glMatrixMode(gl.GL_PROJECTION);
            //Dimensiones de la ventana con ayuda del plano cartesiano
            //             -x    x   -y   y
            glu.gluOrtho2D(0, 1366, 0, 768);
        }
        
        public void display(GLAutoDrawable arg0) {
            //Tamaño en pixeles de cada punto
            gl.glPointSize(2);
            //Se indica que se va a iniciar a pintar puntos
            gl.glBegin(GL.GL_POINTS);
            gl.glColor3f(0,0,0);
                  //El for anidado sirve para pintar puntos en horizontal
                  for(int y=0; y<=768; y+=30){
                      
                      for(int x=0; x<=1366; x+=1){
                          
                          gl.glVertex2f(0+x,0+y);
                      }
                  }
                  //El for anidado sirve para pintar puntos en vertical
                  for(int x=0; x<=768; x+=1){
                      
                      for(int y=0; y<=1366; y+=30){
                          
                          gl.glVertex2f(0+y,0+x);
                      }
                  }
            //Deshabilitamos la creacion de puntos (de la maquina de estados )
           gl.glEnd();
           //Permite ejecutar las sentencias anteriores
           gl.glFlush();
        }
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

        }
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {

        }
    }
}