//fig 2.16: compara numeros mas grandes o guales
import java.util.Scanner;

public class comparaciondeenteros
{
    //el metodo main empieza la ejecucion de la aplicacion
    public static void main(String[] args)
    {
        //crea objeto Sccanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; //primer numero a comparar
        int numero2; //segundo numero a comparar

        System.out.print("Escriba el primer entero: ");//indicador
        numero1 = entrada.nextInt(); //lee el primer numero del usuario

        System.out.print("Escriba el segundo entero: ");//indicador
        numero2 = entrada.nextInt(); //lee el segundo numero

        if (numero1 == numero2)
            System.out.printf("Estos numero son iguales", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("Es mas grandes", numero1, numero2);



    } //fin del metodo main
    
} //fin de la clase comparacion

