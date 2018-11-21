
package idioma;

import java.io.IOException;
import java.util.Properties;

public class Idioma extends Properties{
    
    private static final long serialVersionUID = 1L;
    private static int contador = 0;
    private static String idiomaSeleccionado;
	        
    public Idioma(String idioma){
    	
        //Modificar si quieres añadir mas idiomas
        //Cambia el nombre de los ficheros o añade los necesarios
    	switch(idioma){
	    	case "Español":
                    getProperties("espanol.properties");
                    break;
	    	case "Ingles":
                    getProperties("ingles.properties");
                    break;
	    	default:
                    getProperties("espanol.properties");
	   	}
      
    }
    
 
    public void getProperties(String idioma) {
        try {
            this.load( getClass().getResourceAsStream(idioma) );
        } catch (IOException ex) {
        
        }
   }
}
