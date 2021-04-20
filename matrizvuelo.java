import java.util.Scanner;


public class matrizvuelo 
{
    public static void main(String [] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int matriz [][]= new int [6][3];
        int resta = 0;

        //carga de matriz
        for(int f = 0; f<6 ; f++)
        {
            System.out.println("Ingrese la cantidad de asiento para el destino " + f);
            for(int c = 0; c<3; c++)
            {
                //guardo en la matriz la cantidad de asientos leida por teclado
                matriz [f][c] = entrada.nextInt();
            }
        }

        //ingresar los asientos que desea el cliente y restarlo de la matriz
        for(int f = 0; f<6 ; f++)
        {
            System.out.println("Ingrese la cantidad de asiento que requiere para " + f);
            for(int c = 0; c<3; c++)
            {
                //guardo en la matriz la cantidad de asientos leida por teclado
                resta = entrada.nextInt();

                matriz [f][c] = matriz [f][c] - resta ;
                if(matriz [f][c] > resta){
                    System.out.println("Su reserva fue realizada con exito!");
                }
                else{
                    System.out.println("disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
                }
            }
            resta=0;
        }

        System.out.println("---Cantidad de asientos disponibles: ");
        for(int f=0;f<6;f++){
        for(int c=0;c<3;c++){
        System.out.print(matriz[f][c]+",");
        }
        System.out.println();//damos un enter
        }
    }
}
