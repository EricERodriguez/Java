//2.27 multiplos: aplicacion que lee 2 numero y dice si el segundo entrado es multiplo del primero

import java.util.Scanner;

public class multiplos 
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner (System.in);

        int numero1;
        int numero2;
        int multiplo;

        System.out.print("Escriba el primer numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba segundo numero: ");
        numero2 = entrada.nextInt();

        multiplo = (numero1/numero2);

        if ((numero1%numero2) == 0)
            System.out.printf("%d es multiplo de %d y el resultado es %d%n", numero1, numero2, multiplo);
    }
   
}
