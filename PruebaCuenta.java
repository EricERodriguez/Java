//Fig. 3.2: PruebaCuenta.java
//crear y manipular un objeto Cuenta
import java.util.Scanner;

public class PruebaCuenta 
{
    public static void main(String[] args)
    {
        //Crea un objeto Scanner para obtener la entrada desde el simbolo del sistema
        Scanner entrada = new Scanner(System.in);

        //crea un objeto cuenta y los asigna a miCuenta
        cuenta miCuenta = new cuenta();

        //muestra el valor incial del nombre(null)
        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());

        //pide y lee el nombre
        System.out.println("Introduzca el nombre: ");
        String elNombre = entrada.nextLine();//lee una linea de tecto
        miCuenta.establecerNombre(elNombre);//coloca elNombre en mi cuenta
        System.out.println();//imprime una linea en blanco

        //muestra el nombre almacenado en el objeto miCuenta
        System.out.printf("el nombre en el objeto miCuenta es : %n%s%n",
            miCuenta.obtenerNombre());
    }
}//fin de la clase PruebaCuenta
