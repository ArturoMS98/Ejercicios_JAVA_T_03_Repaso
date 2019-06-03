package t_03_repaso_ej02;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 31, 2019 3:16:37 PM<p>                                                               *
 * <p>nombre del proyecto: T_03_Repaso_Ej02.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>2. Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo:                                             *
 *       Entrada: "casa blanca"                                                                                         *
 *       Salida: "acnalb asac"</p>                                                                                      *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 04 minutos 26 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej02 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Lástima que la inversión de cadena del otro método nos borraba el carácter último y no podemos reutilizarlo.   *
    *    Llamamos al método pideFrase para pedir la cadena a invertir, y al método invierteCadena para invertirla.      *
    *    Por último, la muestra por pantalla.</p>                                                                       *
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
        System.out.println(invierteCadena(cadena));
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una cadena a invertir: </p>                                                                             |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La cadena a invertir                                                                                     |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String pideFrase ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println("Introduzca la cadena a invertir:");
        return(in.nextLine());
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