//2.34 calculadora del crecimiento de la poblacion mundial.

import java.util.Scanner;

public class calcdecrecpobla 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        //el crecimeinto de la poblacion es del 6% anual

        int annon;
        int pob;
        int annoe;

        System.out.print("Introduzca año que desea estimar la poblacion mundia: ");
        annon = entrada.nextInt();

        System.out.print("Introduzca poblacion mundial actual: ");
        pob = entrada.nextInt();

        annoe = annon - 2020;

        System.out.printf("La poblacion mundial para el años %d sera de : ", annon);
        System.out.print((pob*(annoe*0.06))+pob);

    }
    
}
