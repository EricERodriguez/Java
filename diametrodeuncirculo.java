//2.28  diametro,circunferencia y area de un circulo

import java.util.Scanner;
import static java.lang.Math.*;

public class diametrodeuncirculo 
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int radio;        
        
        System.out.print("Introducir radio: ");
        radio = entrada.nextInt();       

        System.out.print("Diametro:");
        System.out.println(2 * radio);

        System.out.print("Circunferencia: ");
        System.out.println(2 * radio * Math.PI);

        System.out.print("Area: ");
        System.out.println((Math.PI * radio)*(Math.PI * radio));


    }
}
