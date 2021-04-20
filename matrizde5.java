import java.util.Scanner;

public class matrizde5 
{
    public static void main(String [] args) 
    {
        int matriz [][] = new int [4] [5];

        matriz [0][0]= 5;
        matriz [0][1]= 5;
        matriz [0][2]= 5;
        matriz [0][3]= 5;
        matriz [0][4]= 5;
        matriz [1][0]= 5;
        matriz [1][1]= 5;
        matriz [1][2]= 5;
        matriz [1][3]= 5;
        matriz [1][4]= 5;
        matriz [2][0]= 5;
        matriz [2][1]= 5;
        matriz [2][2]= 5;
        matriz [2][3]= 5;
        matriz [2][4]= 5;
        matriz [3][0]= 5;
        matriz [3][1]= 5;
        matriz [3][2]= 5;
        matriz [3][3]= 5;
        matriz [3][4]= 5;

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

