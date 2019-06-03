package t_03_repaso_ej07;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 1, 2019 3:07:52 PM<p>                                                                *
 * <p>nombre del proyecto: T_03_Repaso_Ej07.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>7. Crea un método que reciba dos cadenas de caracteres y que devuelva la primera cadena, pero transformando en    *
 *    mayúsculas la parte que coincide con la segunda cadena introducida. Por ejemplo:                                  *
 *      Introduzca primera cadena: “Este es mi amigo Juan”                                                              *
 *      Introduzca segunda cadena: “amigo”                                                                              *
 *      Resultado: “Este es mi AMIGO Juan”</p>                                                                          *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: Bastante poco. Feliz cumpleaños!</p>                                            *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej07 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pide dos frases y llama al método buscaCadenas(), pasándole ambas cadenas para que se nos devuelva la primera  *
    *    cadena pero transformando en mayúsculas la parte que coincida con la segunda cadena introducida.</p>           *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String cadena1;
        String cadena2;
        
        //FRONTEND//
            //PETICION DE DATOS//
            cadena1 = pideFrase();
            cadena2 = pideFrase();
        
        //BACKEND//
        cadena1 = buscaCadenas(cadena1, cadena2);
        System.out.println(cadena1);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Recibe la cadena principal donde sustituir, y devuelve la cadena modificada con la parte (sin contar          |
     |    mayúsculas) que coincida, transformada a mayúsculas.</p>                                                      |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cadenaPrincipal es la cadena donde sustituir la @param cadenaBuscar                                       |
     | @return la primera cadena recibida, con la parte que coincida con la segunda cadena transformada a mayúsculas.   |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String buscaCadenas(String cadenaPrincipal, String cadenaBuscar)
    {
        //VARIABLES LOCALES//
        cadenaPrincipal = cadenaPrincipal.replaceAll(cadenaBuscar, cadenaBuscar.toUpperCase());
        //CUERPO DEL METODO//
        return cadenaPrincipal;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una frase: </p>                                                                                         |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La cadena de caracteres                                                                                  |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    public static String pideFrase ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println("Introduzca la frase:");
        return(in.nextLine());
    }
}