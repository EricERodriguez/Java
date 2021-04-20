import java.util.Scanner;

public class matrizperros
{
    public static void main(String [] args) 
    {
        String matriz [][] = new String [3] [3];

        Scanner entrada = new Scanner (System.in);

        for (int f=0; f< 3;f++)
        {
            for(int c=0; c< 3; c++)
            {

                System.out.println("Digite raza de perro para "+ f +" y "+ c);
                matriz [f][c] = entrada.nextLine();
            }
        }
        System.out.println("---Esta es nuestra matriz");
        for(int f=0;f<3;f++){
        for(int c=0;c<3;c++){
        System.out.print(matriz[f][c]+",");
        }
        System.out.println();//damos un enter
        }
        System.out.println("---Digite un valor a buscar---");
        String buscar = entrada.nextLine();
        String coordenadas="";

        for(int f=0;f<3;f++)
        {
            for(int c=0;c<3;c++)
            {
            if(matriz [f][c] == buscar)
            {
            coordenadas ="["+f+","+c+"]"+"\n";
              //'\n' me permite dar enter's(saltos de linea) dentro de la cadena;
            }
            }
        }

            if(coordenadas == matriz[0][0])
            {
            System.out.println("El valor "+buscar+" no existe en la matriz--");
            }else
            {
            System.out.println("El valor "+buscar+" esta en la(s) siguiente(s) coordenadas."+coordenadas);
            System.out.print(coordenadas);
            }
    }
}