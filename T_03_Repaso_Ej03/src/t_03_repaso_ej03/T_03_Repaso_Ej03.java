package t_03_repaso_ej03;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 31, 2019 3:26:28 PM<p>                                                               *
 * <p>nombre del proyecto: T_03_Repaso_Ej03.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>3. Leer una frase y encontrar la palabra de mayor longitud. El programa debe imprimir la palabra como el número   *
 * de caracteres de la misma</p>                                                                                        *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 32 minutos 18 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej03 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pedir un String con pideFrase y llamar al método midePalabraMayor, que calcula la palabra contenida de mayor   *
    *    longitud, supuesto el único delimitador entre palabra y palabra como el carácter ' '.</p>                      *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String frase;
        String palabraMayor;
        int caracteresPalabra;
        
        //FRONTEND//
            //PETICION DE DATOS//
            frase = pideFrase();
        
        //BACKEND//
        palabraMayor = midePalabraMayor(frase);
        caracteresPalabra = palabraMayor.length();
        System.out.println("La palabra de mayor longitud es: " + palabraMayor + ", y contiene " + caracteresPalabra + " caracteres");
    }
    

    //Metodos suplementarios de la clase principal//

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
     | <p>Busca la palabra de mayor longitud, delimitando palabra y palabra con un espacio, y la devuelve</p>           |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param frase es la frase en la que buscar la palabra                                                             |
     | @return La palabra de mayor longitud                                                                             |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String midePalabraMayor(String frase)
    {
        //VARIABLES LOCALES//
        String palabraMayor;
        int recordCaracteres = 0;
        int contadorCaracteres = 0;
        int posicionFinalPalabraRecord = 0;
        //CUERPO DEL METODO//
        frase = frase + " ";
        for(int i = 0; i < frase.length(); i++)
        {
            if((frase.charAt(i) == ' ') || (i == frase.length()-1))
            {
                if(contadorCaracteres >= recordCaracteres)
                {
                    recordCaracteres = contadorCaracteres;
                    posicionFinalPalabraRecord = i; //Nota que si estamos en el final de la frase, el último carácter no será espacio.
                }                                   //Por tanto, lo ponemos, para evitar los muchísimos parches que serían necesarios de otro modo
                contadorCaracteres = 0;
            }
            else
                contadorCaracteres++;
        }
        palabraMayor = frase.substring((posicionFinalPalabraRecord - recordCaracteres), posicionFinalPalabraRecord);
        palabraMayor = palabraMayor.trim();
        return palabraMayor;
    }
}