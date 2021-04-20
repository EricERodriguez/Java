import java.util.Scanner;

public class matrizalumno 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        double notas [][] = new double [4][4];
        double suma = 0;

        //carga de matriz
        for(int f = 0; f<4 ; f++)
        {
            System.out.println("Ingrese las tres notas para el alumno: " + f);
            for(int c = 0; c<3; c++)
            {
                //guardo en la matriz la nota leida por teclado
                notas [f][c] = entrada.nextDouble();
                //voy sumando/acumulando en cada vuelta cada nota para despues sacar el promedio
                suma = suma + notas [f][c];
            }
            notas [f][3] = suma / 3;
            suma = 0; //volvemos el acumulador a 0 para que en la proxima vulta del proximo alumno empiece de 0
        }


        for(int f = 0; f<4 ; f++)
        {
            System.out.println("Las notas y promedio del alumno  " + f + " son: ");
            for(int c = 0; c<4; c++)
            {
                System.out.println(notas[f][c]);

            }

        }

    }
}
