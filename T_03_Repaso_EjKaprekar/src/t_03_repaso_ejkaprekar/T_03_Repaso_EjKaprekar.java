package t_03_repaso_ejkaprekar;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 3, 2019 1:02:33 PM<p>                                                               *
 * <p>nombre del proyecto: T_03_Repaso_EjKaprekar.java<p>                                                                    *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>El matemático indio Dattaraya Ramchandra Kaprekar descubrió en 1949 una curiosa característica del número 6174.   *
 * Hoy, se conoce a dicho número como constante de Kaprekar en honor a él.                                              *
 * El número es notable por la siguiente propiedad:                                                                     *
 *                                                                                                                      *
 * 1. Elige un número de cuatro dígitos que tenga al menos dos diferentes (es válido colocar el dígito 0 al principio,  *
 *    por lo que el número 0009 es válido).                                                                             *
 * 2. Coloca sus dígitos en orden ascendente y en orden descendente para formar dos nuevos números. Puedes añadir       *
 *    los dígitos 0 que necesites al principio.                                                                         *
 * 3. Resta el menor al mayor.                                                                                          *
 * 4. Vuelve al paso 2.                                                                                                 *
 *                                                                                                                      *
 * A este proceso se le conoce como la rutina de Kaprekar, y siempre llegará al número 6174 en, como mucho,             *
 * 7 iteraciones. Una vez en él, el proceso no avanzará, dado que 7641 − 1467 = 6174.                                   *
 * Por ejemplo, el número 3524 alcanzará la constante de Kaprekar en 3 iteraciones:                                     *
 *      5432 − 2345 = 3087                                                                                              *
 *      8730 − 0378 = 8352                                                                                              *
 *      8532 − 2358 = 6174                                                                                              *
 * Los únicos dígitos de cuatro cifras para los que la rutina de Kaprekar no alcanza el número 6174 son los repdigits,  *
 * es decir aquellos cuyas cuatro cifras son iguales (como 1111), pues en la primera iteración se alcanzará el valor 0  *
 * y no podrá salirse de él. Es por esto que en el paso 1 se pedía explícitamente que el número inicial tuviera al      *
 * menos dos dígitos diferentes.                                                                                        *
 * El resto de los números de cuatro cifras terminarán siempre en el número 6174.                                       *
 * A continuación se muestran dos ejemplos más:                                                                         *
 * El número 1121 necesita 5 iteraciones:                                                                               *
 * 2111 − 1112 = 0999                                                                                                   *
 * 9990 − 0999 = 8991                                                                                                   *
 * 9981 − 1899 = 8082                                                                                                   *
 * 8820 − 0288 = 8532                                                                                                   *
 * 8532 − 2358 = 6174                                                                                                   *
 * El número 1893 necesita 7:                                                                                           *
 * 9831 − 1389 = 8442                                                                                                   *
 * 8442 − 2448 = 5994                                                                                                   *
 * 9954 − 4599 = 5355                                                                                                   *
 * 5553 − 3555 = 1998                                                                                                   *
 * 9981 − 1899 = 8082                                                                                                   *
 * 8820 − 0288 = 8532                                                                                                   *
 * 8532 − 2358 = 6174</p>                                                                                               *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 2 horas 39 minutos 49 segundos</p>  (Aprox)                                     *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_EjKaprekar {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p></p>
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final String KAPREKAR = "6174";
        String numero;
        String asc;
        String desc;
        String resultado;
        //FRONTEND//
            //PETICION DE DATOS//
            numero = pideCuatroDigitos();
        //BACKEND//
        for(int i = 0; i < 7; i++)
        {
            asc = ordenaCadenaAsc(numero);
            desc = invierteCadena(asc);
            numero = restaString(invierteCadena(ordenaCadenaAsc(numero)), ordenaCadenaAsc(numero));
            if(numero.equals(KAPREKAR))
            {
                System.out.println("ÉXITO!");
                System.out.println("Número de iteraciones: " + (i+1));
                break;
            }
        }
        
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir al usuario 4 dígitos</p>                                                                                |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return la cadena de caracteres que contiene los 4 dígitos                                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     | ~~~~<p>Tiempo tardado en crear: 23 minutos</p>~~~~                                                               |
     |_________________________________________________________________________________________________________________*/
    static String pideCuatroDigitos()
    {
        //VARIABLES LOCALES//
        String numero;
        boolean centinela;
        boolean distintosNumeros;
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        do
        {
            centinela = false;
            distintosNumeros = false;
            System.out.println("Introduzca 4 dígitos: ");
            numero = in.nextLine();
            for(int i = 0; i < numero.length(); i++)
            {
                if(i < numero.length()-1 && !distintosNumeros)
                {
                    if(numero.charAt(i) != numero.charAt(i+1))
                    {
                        distintosNumeros = true;
                    }
                }
                if(!esNumero(numero.charAt(i)))
                    centinela = true;
                if(i > 4)
                {
                    break;
                }
            }
        }while((numero.length() != 4) || centinela || !distintosNumeros);
        return numero;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Determinar si un carácter es un número</p>                                                                    |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cifra es el carácter que queremos determinar si es un número                                              |
     | @return true o false                                                                                             |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static boolean esNumero(char cifra)
    {
        //VARIABLES LOCALES//
        //CUERPO DEL METODO//
        return cifra >= 48 && cifra <= 57;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Ordenar una cadena en orden ascendente según su equivalente en codificación ASCII</p>                         |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param numero es el String que queremos ordenar                                                                  |
     | @return La cadena de números ordenada de menor a mayor                                                           |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     | ~~~~<p>Tiempo tardado: más de una hora. Necesario crear métodos para organizar el código.                        |
     |_________________________________________________________________________________________________________________*/
    static String ordenaCadenaAsc(String numero)
    {
        //VARIABLES LOCALES//
        char minimoRecord;
        int j;
        int posicion = 0;
        String numeroOrdenado = "";
        //CUERPO DEL METODO//
        for(int i = 0; i < numero.length()-1; i++)
        {
            minimoRecord = getMenor(numero);
            posicion = numero.indexOf(minimoRecord);
            numeroOrdenado += minimoRecord;
            if(posicion == 0)
            {
                numero = numero.substring(posicion+1);
            }
            else if(posicion == numero.length()-1)
            {
                numero = numero.substring(0, numero.length()-1);
            }
            else
                numero = numero.substring(0, posicion) + numero.substring(posicion+1, numero.length());
            i--;
        }
        return numeroOrdenado + numero;
        
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Conseguir la posición del carácter menor de una cadena según su equivalente en codificación ASCII</p>         |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param numero es el String que queremos ordenar                                                                  |
     | @return La cadena de números ordenada de menor a mayor                                                           |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static char getMenor(String numero)
    {
        char caracterRecord = numero.charAt(0);
        for(int i = 0; i < numero.length(); i++)
        {
            if(caracterRecord > numero.charAt(i))
                caracterRecord = numero.charAt(i);
        }
        return caracterRecord;
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
     | <p>Resta dos enteros codificados en String</p>                                                                   |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param texto es la frase a la que borrar su primera palabra.                                                     |
     | @param caracteresPrimeraPalabra son los caracteres que borraremos de la cadena.                                  |
     | @return La frase con la primera palabra eliminada.                                                               |
     | ~~~~<p>Método dirigido a: BackEnd  </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    public static String restaString(String sustraendo, String minuendo)
    {
        String resultado = "";
        boolean llevoUna = false;
        int contadorSustraendo;          //apunta a la ultima posicion del sustraendo
        int contadorMinuendo;            //apunta a la ultima posicion del minuendo
        for(contadorMinuendo = minuendo.length()-1, contadorSustraendo = sustraendo.length()-1;
                contadorMinuendo >= 0; contadorMinuendo--, contadorSustraendo--)
        {
            int aux = (charsToNumbers(sustraendo.charAt(contadorSustraendo)) - (charsToNumbers(minuendo.charAt(contadorMinuendo))));
            if(llevoUna)
            {
                aux -= 1;
                llevoUna = false;
            }
            if(aux < 0)
            {
                aux += 10;
                llevoUna = true;
            }
            resultado = aux + resultado;
        }
        return resultado;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Transformar el carácter recibido a la cifra correspondiente</p>                                               |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cifra es el número a convertir a entero                                                                   |
     | @return la cifra pero en formato entero                                                                          |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int charsToNumbers(char cifra)
    {
        //VARIABLES LOCALES//
        //CUERPO DEL METODO//
        switch(cifra)
        {
            case 48: return 0;
            case 49: return 1;
            case 50: return 2;
            case 51: return 3;
            case 52: return 4;
            case 53: return 5;
            case 54: return 6;
            case 55: return 7;
            case 56: return 8;
            case 57: return 9;
            default: return -1;
        }
    }
}