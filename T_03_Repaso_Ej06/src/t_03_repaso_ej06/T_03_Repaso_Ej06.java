package t_03_repaso_ej06;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 1, 2019 2:30:17 PM<p>                                                                *
 * <p>nombre del proyecto: T_03_Repaso_Ej06.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Repaso.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>6. Implementa un método llamado numbersToWords que reciba un parámetro entero y devuelva una cadena de texto con  *
 *       los números convertidos en palabras, por ejemplo:                                                              *
 *         123 → UNO DOS TRES                                                                                           *
 *         1010 → UNO CERO UNO CERO</p>                                                                                 *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 33 minutos 54 segundos</p>                                              *
 * nota que si obligo a que se reciba un parámetro entero, en el caso de que empiece por cero no se va a detectar       *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_Repaso_Ej06 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pide un número con pideNumero(), y lo transforma a letras con numbersToWords()</p>                             *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int numero;
        String textoNumero;
        //FRONTEND//
            //PETICION DE DATOS//
            numero = pideNumero();
        //BACKEND//
        textoNumero = numbersToWords(numero);
        System.out.println(textoNumero);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una frase: </p>                                                                                         |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La cadena de caracteres                                                                                  |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    public static int pideNumero ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println("Introduzca el número:");
        return(in.nextInt());
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Coge número por número y lo va pasando al método transformaNumeroLetras</p>                                   |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param numero es el número a convertir a cadena de caracteres                                                    |
     | @return una cadena que devuelva en letras número por número                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String numbersToWords(int numero)
    {
        //VARIABLES LOCALES//
        String textoNumero = "";
        String numeroCadena;
        //CUERPO DEL METODO//
        numeroCadena = numero + "";
        for(int i = 0; i < numeroCadena.length(); i++)
        {
            textoNumero = textoNumero + numbersToWords(numeroCadena.charAt(i)) + " ";
        }
        return textoNumero.trim();
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Transformar el número recibido a la cadena de caracteres correspondiente</p>                                  |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cifra es el número a convertir a letra                                                                    |
     | @return letras que significa el número en español.                                                               |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String numbersToWords(char cifra)
    {
        //VARIABLES LOCALES//
        String textoCifra = "";
        String cifraString;
        final String cero = "Cero";
        final String uno = "Uno";
        final String dos = "Dos";
        final String tres = "Tres";
        final String cuatro = "Cuatro";
        final String cinco = "Cinco";
        final String seis = "Seis";
        final String siete = "Siete";
        final String ocho = "Ocho";
        final String nueve = "Nueve";
        //CUERPO DEL METODO//
        switch(cifra)
        {
            case 48: return cero;
            case 49: return uno;
            case 50: return dos;
            case 51: return tres;
            case 52: return cuatro;
            case 53: return cinco;
            case 54: return seis;
            case 55: return siete;
            case 56: return ocho;
            case 57: return nueve;
            default: return "Invalido";
        }
    }
}