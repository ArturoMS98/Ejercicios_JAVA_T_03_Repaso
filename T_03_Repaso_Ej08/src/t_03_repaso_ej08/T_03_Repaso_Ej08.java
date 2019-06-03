package t_03_repaso_ej08;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 3, 2019 12:44:55 PM<p>                                                               *
 * <p>nombre del proyecto: T_03_Repaso_Ej08.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>8. Desarrolla un método que reciba como parámetro una cadena de texto con una frase y devuelva dicha cadena pero  *
 *       invirtiendo la primera y la última palabra. Por ejemplo:                                                       *
 *          El cielo tiene nubes negras                                                                                 *
 *          Resultado: negras cielo tiene nubes El</p>                                                                  *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 12 minutos 54 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej08 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pedir una frase y llamar al método que invierte la primera y última palabra de dicha frase.</p>                *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String cadena;
        
        //FRONTEND//
            //PETICION DE DATOS//
            cadena = pideFrase();
        
        //BACKEND//
        cadena = inversorPrimeraUltima(cadena, cogePrimeraPalabra(cadena), cogeUltimaPalabra(cadena));
        System.out.println(cadena);
        
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Invertir la primera y la última palabra de un texto</p>                                                       |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param texto Es el texto en el que invertir las palabras                                                         |
     | @param palabra1 Es la primera palabra de dicho texto                                                             |
     | @param palabraN Es la última palabra de dicho texto                                                              |
     | <p>Nota que se podría haber accedido a dichas palabras desde los métodos, pero en vez de en el método decidimos  |
     |    llamarlos en el método principal al pasar los parámetros. No se tardaría nada en sustituirlos.</p>            |
     | @return La cadena invertida                                                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String inversorPrimeraUltima(String texto, String palabra1, String palabraN)
    {
        //VARIABLES LOCALES//
        
        //CUERPO DEL METODO//
        texto = texto.replaceAll(palabra1, palabraN);
        texto = texto.substring(0, palabraN.length()) + texto.substring(palabraN.length()).replaceAll(palabraN, palabra1);
        return texto;
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
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Coger la primera palabra de un texto y devolverla, sin devolver el espacio</p>                                |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param texto es el texto del que recoger la primera palabra                                                      |
     | @return la primera palabra en cuestión                                                                           |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    public static String cogePrimeraPalabra(String texto)
    {
        //VARIABLES LOCALES//
        String palabra = "";
        //CUERPO DEL METODO//
        texto = texto.trim();
        texto = texto + " ";
        for(int i = 0; i < texto.length(); i++)
        {
            palabra = palabra + texto.charAt(i);
            if(texto.charAt(i) == ' ')
                return palabra.trim();
        }
        return "ERROR DEL PROGRAMA";
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Coger la ultima palabra de un texto y devolverla, sin devolver el espacio</p>                                 |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param texto es el texto del que recoger la ultima palabra                                                       |
     | @return la ultima palabra en cuestión                                                                            |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    public static String cogeUltimaPalabra(String texto)
    {
        //VARIABLES LOCALES//
        String palabra = "";
        //CUERPO DEL METODO//
        texto = texto.trim();
        texto = " " + texto;
        for(int i = texto.length()-1; i >= 0; i--)
        {
            palabra = palabra + texto.charAt(i);
            if(texto.charAt(i) == ' ')
                return invierteCadena(palabra.trim());
        }
        return "ERROR DEL PROGRAMA";
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Invierte la cadena que se le pasa por parámetro y devuelve dicha cadena invertida</p>                         |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cadena es la cadena a invertir                                                                            |
     | @return La cadena invertida                                                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    public static String invierteCadena (String cadena)
    {
        //VARIABLES LOCALES//
        String inversion = "";
        //CUERPO DEL METODO//
        for(int i = 0; i < cadena.length(); i++)
        {
            inversion = cadena.charAt(i) + inversion;
        }
        return inversion;
    }
}