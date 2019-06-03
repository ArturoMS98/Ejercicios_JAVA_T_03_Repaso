package t_03_repaso_ej01;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 31, 2019 2:51:08 PM<p>                                                               *
 * <p>nombre del proyecto: T_03_Repaso_Ej01.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>1. Cadena espejo. Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, *
 * esto es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por lo que *
 * la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir “teclado” devolverá      *
 * “tecladodalcet” y al introducir “goma” devolverá “gomamog”.</p>                                                      *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 15 minutos 33 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej01 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llama al método pideFrase y lo pasa por parámetro al método invierteFrase, sumando al final la primera cadena  *
    *    y la segunda, haciendo que compartan la letra que hace de espejo.</p>                                          *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String cadena;
        String cadenaEspejo;
        
        //FRONTEND//
            //PETICION DE DATOS//
            cadena = pideFrase();
        
        //BACKEND//
        cadenaEspejo = invierteFrase(cadena);
        System.out.println("La cadena espejo es: " + cadena + cadenaEspejo);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una cadena para la que calcular su espejo y devolverla</p>                                              |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La cadena a calcular su espejo                                                                           |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String pideFrase ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println("Introduzca la cadena a calcular su espejo:");
        return(in.nextLine());
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Calcular el espejo de la cadena pasada</p>                                                                    |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cadena es el String a calcular su espejo.                                                                 |
     | @return El espejo sin la primera letra de la cadena pasada.                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String invierteFrase (String cadena)
    {
        //VARIABLES LOCALES//
        String espejo = "";
        //CUERPO DEL METODO//
        for(int i = 0; i < cadena.length() - 1; i++)
        {
            espejo = cadena.charAt(i) + espejo;
        }
        return espejo;
    }
}