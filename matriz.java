import java.util.Scanner;


public class matriz 
{
    public static void main(String [] args) 
    {
        int matriz [][] = new int [4] [4];

        Scanner entrada = new Scanner (System.in);

        for (int f=0; f< 4;f++)
        {
            for(int c=0; c< 4; c++)
            {

                System.out.println("Estoy en la fila " + f+ " y columna "+ c);
                matriz [f][c] = entrada.nextInt();
            }
        }
    }
}
