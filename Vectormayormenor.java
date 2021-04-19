import java.util.Scanner;

public class Vectormayormenor
{
    public static void main(String []args)
    {

        int numero [] = new int[10];

        Scanner entrada = new Scanner (System.in);

        for(int i = 0; i<numero.length; i++)
            {
            System.out.println("Ingrese numero para vector: " + i);
            numero[i] = entrada.nextInt();
            }
        int min  = numero [0] ;
        int may = numero [0];
        for (int x = 0; x<numero.length; x++)
        {
            if(numero[x]<min)
            {
                min = numero[x];
            }
        }
        for (int x = 0; x<numero.length; x++)
        {
            if(numero[x]>may)
            {
                may = numero[x];
            }
        }
        System.out.println(min);
        System.out.println(may);
    }


}
