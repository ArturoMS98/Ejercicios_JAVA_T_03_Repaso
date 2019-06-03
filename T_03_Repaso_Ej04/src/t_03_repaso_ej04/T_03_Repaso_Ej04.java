package t_03_repaso_ej04;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 31, 2019 4:08:03 PM<p>                                                               *
 * <p>nombre del proyecto: T_03_Repaso_Ej04.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>4. Pedir un texto al usuario y a continuación mostrar por pantalla el porcentaje de palabras que tiene menos de 5 *
 *       caracteres y el porcentaje de palabras con 5 o más caracteres.</p>                                             *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 21 minutos 01 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej04 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pedir un String con pideFrase(), recoger todas las palabras de la cadena con cogePrimeraPalabra(), y borrar    *
    *    dicha palabra de la cadena tras almacenar su estadística, para la cual no contarán los espacios.</p>           *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String texto;
        int palabrasMenores = 0;
        int palabrasMayores = 0;
        int caracteresPrimeraPalabra;
        //FRONTEND//
            //PETICION DE DATOS//
            texto = pideFrase();
            texto = texto.trim();
        //BACKEND//
        while(!texto.equals(""))
        {
            caracteresPrimeraPalabra = cogePrimeraPalabra(texto).length();
            if(caracteresPrimeraPalabra < 5)
            {
                palabrasMenores++;
            }
            else
                palabrasMayores++;
            texto = borrarPrimeraPalabra(texto, caracteresPrimeraPalabra);
        }
        System.out.println("Palabras con más de 5 letras: " + palabrasMayores);
        System.out.println("Palabras con menos de 5 letras: " + palabrasMenores);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una frase: </p>                                                                                         |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La cadena de caracteres                                                                                  |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String pideFrase ()
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
     | <p>Borrar la primera palabra de la frase</p>                                                                     |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param texto es la frase a la que borrar su primera palabra.                                                     |
     | @param caracteresPrimeraPalabra son los caracteres que borraremos de la cadena.                                  |
     | @return La frase con la primera palabra eliminada.                                                               |
     | ~~~~<p>Método dirigido a: BackEnd  </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    public static String borrarPrimeraPalabra(String texto, int caracteresPrimeraPalabra)
    {
        //VARIABLES LOCALES//
        //CUERPO DEL METODO//
        texto = texto.trim();
        texto = texto.substring(caracteresPrimeraPalabra);
        return(texto);
    }
}