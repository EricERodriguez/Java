//2.32 vaores negativos, positivos y cero: recibe 5 numeros y cuentas cuantos son positivos, negativos y ceros.

import java.util.Scanner;

public class valoresnegposce 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        System.out.print("Escriba su primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba su segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Escriba su tercer numero: ");
        numero3 = entrada.nextInt();

        System.out.print("Escriba su cuarto numero: ");
        numero4 = entrada.nextInt();

        System.out.print("Escriba su quinto numero: ");
        numero5 = entrada.nextInt();

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        if (numero1 > 0)
        positivos = positivos +1;

        if (numero2 > 0)
        positivos = positivos +1;

        if (numero3 > 0)
        positivos = positivos +1;

        if (numero4 > 0)
        positivos = positivos +1;

        if (numero5 > 0)
        positivos = positivos +1;

        if (numero1 < 0)
        negativos = negativos +1;

        if (numero2 < 0)
        negativos = negativos +1;

        if (numero3 < 0)
        negativos = negativos +1;

        if (numero4 < 0)
        negativos = negativos +1;

        if (numero5 < 0)
        negativos = negativos +1;

        if (numero1 == 0)
        ceros = ceros +1;

        if (numero2 == 0)
        ceros = ceros +1;

        if (numero3 == 0)
        ceros = ceros +1;

        if (numero4 == 0)
        ceros = ceros +1;

        if (numero5 == 0)
        ceros = ceros +1;

        System.out.printf("La cantidad de numeros negativos es %d%nLa cantidad de numeros positivos es %d%nLa cantidad de ceros es %d%n", negativos, positivos, ceros);


    }
    
}
