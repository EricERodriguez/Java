//2.24 Enteros menor y mayor: El usuario itroduce 5 enteros y la aplicacion lee cual es mayor y menor

import java.util.Scanner;

public class enteromenormayor 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        System.out.print("Ingrese el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese segundo entero: ");
        numero2 = entrada.nextInt();

        System.out.print("Ingrese tercer entero: ");
        numero3 = entrada.nextInt();

        System.out.print("Ingrese cuarto entero: ");
        numero4 = entrada.nextInt();

        System.out.print("Ingrese quinto entero: ");
        numero5 = entrada.nextInt();

        if (numero1 > numero2 )
            if (numero1 > numero3)
                if(numero1 > numero4)
                    if(numero1 > numero5)
                        System.out.printf("%d es el mayor%n", numero1);

        if (numero2 > numero1 )
            if (numero2 > numero3)
                if(numero2 > numero4)
                    if(numero2 > numero5)
                        System.out.printf("%d es el mayor%n", numero2);

        if (numero3 > numero2 )
            if (numero3 > numero1)
                if(numero3 > numero4)
                    if(numero3 > numero5)
                        System.out.printf("%d es el mayor%n", numero3);

        if (numero4 > numero2 )
            if (numero4 > numero3)
                if(numero4 > numero1)
                    if(numero4 > numero5)
                        System.out.printf("%d es el mayor%n", numero4);

        if (numero5 > numero2 )
            if (numero5 > numero3)
                if(numero5 > numero4)
                    if(numero5 > numero1)
                        System.out.printf("%d es el mayor%n", numero5);
        
    }
    
}
