//2.30 separacion de los digitos en un entero

import java.util.Scanner;

public class separaciondedigitos 
{
    public static void main(String [] args)
    {

    Scanner entrada = new Scanner(System.in);

    int numero;
    int digito1;
    int digito2;
    int digito3;
    int digito4;
    int digito5;

    System.out.print("Escribir numero de 5 digitos: ");
    numero = entrada.nextInt();
    
    digito1 = numero/10000;
    digito2 = (numero/1000)%10;
    digito3 = (numero/100)%10;
    digito4 = (numero/10)%10;
    digito5 = (numero%10);
    
    System.out.printf("%d   %d   %d   %d   %d",digito1 , digito2, digito3, digito4, digito5);



    }
}
