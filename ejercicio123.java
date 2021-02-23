//ejercicio 1.2.3 capitulo 2 deitel & deitel

import java.util.Scanner;

public class ejercicio123
{
    public static void main(String[] args)
    {
        int c;
        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Este es un programa java");

        System.out.printf("%s", "Este es un\nprograma java");


        System.out.print("\nIntruducir un entero: ");
        valor = entrada.nextInt();

        if (valor != 7)
            System.out.println("La variable Valor no es igual a 7");
            
    }

}

