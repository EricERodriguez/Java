import java.util.Scanner;

public class matriz6x6condiagonal1 
{
    public static void main(String [] args) 
    {
        int matriz [][] = new int [6] [6];

        matriz [0][0]= 1;
        matriz [1][1]= 1;
        matriz [2][2]= 1;
        matriz [3][3]= 1;
        matriz [4][4]= 1;
        matriz [5][5]= 1;

        Scanner entrada = new Scanner (System.in);

        for (int f=0; f< 4;f++)
        {
            for(int c=0; c< 5; c++)
            {

                System.out.println("Estoy en la fila " + f+ " y columna "+ c + " El numero es: " + matriz[f][c]);
            }
        }
    }
}