//Programa que recibe dos numeros y muestra la suma, producto, diferencia y cociente.
import java.util.Scanner; // el programa usa la clase Scanner

public class Aritmetica
{
    //el metodo main empieza la ejecucion de la aplicacion java
    public static void main(String[] args) 
    {
        //crea objeto Scaneer para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; //Primer numero a sumar
        int numero2; //Segundo numero a sumar
        int suma; // suma de numero 1 y numero2
        int resta; // resta de numero 1 y numero2
        int producto; // multiplica numero 1 y numero2
        int division; // divide numero 1 y numero2

        System.out.print("Escriba el primer numero entero: ");
        numero1 = entrada.nextInt(); //Lee el primer numero del usuario

        System.out.print("Escriba el segundo numero entero: ");
        numero2 = entrada.nextInt(); //Lee el segundo numero del usuario

        suma = numero1 + numero2; //Suma los numeros, despues almacena el total en suma
        resta = numero1 - numero2; //Resta los numeros, despues almacena el total en resta
        producto = numero1 * numero2; //Multiplica los numeros, despues almacena el total en producto
        division = numero1 / numero2; //divide los numeros, despues almacena el total en division

        System.out.printf("La suma es %d%n",suma); //muestra la summa
        System.out.printf("La diferencia es %d%n",resta); //muestra la diferencia
        System.out.printf("El producto es %d%n",producto); //muestra el producto
        System.out.printf("El cociente es %d%n",division); //muestra el cociente
    }
}