//2.25 aplicacion que determina si un numero es par o impar

import java.util.Scanner;

public class paroimpar 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int dos = 2;
        

        System.out.print("Ingrese su numero: ");
        numero1 = entrada.nextInt();

        if ((numero1%dos) == 0)
            System.out.printf("%d es par", numero1);

        if ((numero1%dos) != 0)
            System.out.printf("%d es impar", numero1);

    }
    
}
