package t_03_repaso_ej05;

import java.util.Scanner;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 31, 2019 4:32:21 PM<p>                                                               *
 * <p>nombre del proyecto: T_03_Repaso_Ej05.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>5. Un palíndromo es un término o una expresión que puede leerse tanto de izquierda a derecha como de derecha a    *
 *    izquierda (es decir, expresa lo mismo al ser leído de manera tradicional o al revés). Se trata del equivalente a  *
 *    lo que, respecto a los números, se conoce como capicúa.                                                           *
 *      Por ejemplo: “Anita lava la tina” es un palíndromo ya que, si invertimos el orden de las letras, aún se seguirá *
 *      leyendo la misma expresión. Por supuesto, cualquier cambio (por mínimo que sea) en la estructura de la oración, *
 *      terminará con el palíndromo. De este modo, “Ana lava la tina” o “Anita lava una tina” no son palíndromos.       *
 *      Implementar un programa en Java que pida al usuario una frase e indique si es un palíndromo.</p>                *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 40 minutos 00 segundos(aprox)</p>                                       *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej05 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pedir al usuario una frase, y llamar al metodo esPalindromo</p>                                                *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String palindromo;
 
        //FRONTEND//
            //PETICION DE DATOS//
            palindromo = pideFrase();
        
        //BACKEND//
        if(esPalindromo(palindromo))
        {
            System.out.println("La cadena es un palíndromo");
        }
        else
            System.out.println("La cadena no es un palíndromo");
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Averiguar si la cadena pasada por parámetro es un palíndromo o no.</p>                                        |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param palindromo es la cadena a averiguar si se trata de un palíndromo.                                         |
     | @return True en caso de que fuese palíndromo, o false en caso contrario.                                         |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static boolean esPalindromo(String palindromo)
    {
        //VARIABLES LOCALES//
        String cadenaAuxiliar = "";
        String cadenaInicial = palindromo;
        palindromo = formatoFrase(palindromo, cadenaAuxiliar);
        while(!cadenaInicial.trim().equals(""))
        {
            cadenaAuxiliar = invierteCadena(cogePrimeraPalabra(cadenaInicial)) + cadenaAuxiliar;
            cadenaInicial = borrarPrimeraPalabra(cadenaInicial, cogePrimeraPalabra(cadenaInicial).length());
            cadenaAuxiliar = " " + cadenaAuxiliar;
        }
        cadenaAuxiliar = cadenaAuxiliar.trim();
        if(palindromo.trim().equalsIgnoreCase(cadenaAuxiliar))
            return true;
        else
            return false;
    }

    private static String formatoFrase(String palindromo, String cadenaAuxiliar) {
        //CUERPO DEL METODO//
        while(!palindromo.trim().equals(""))
        {
            cadenaAuxiliar = cadenaAuxiliar + cogePrimeraPalabra(palindromo);
            palindromo = borrarPrimeraPalabra(palindromo, cogePrimeraPalabra(palindromo).length());
            cadenaAuxiliar = cadenaAuxiliar + " ";
        }
        palindromo = cadenaAuxiliar.trim();
        return palindromo;
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