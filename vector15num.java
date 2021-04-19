import java.util.Scanner;

public class vector15num {
    public static void main(String[] args) 
    {
        int numero [] = new int [15];

        Scanner entrada = new Scanner(System.in);

        for(int i= 0; i < numero.length;i++)
        {
            System.out.println("Ingrese el valor para la posicion "+i);
            numero [i]= entrada.nextInt();
        }

        int c = 0;

        for(int x=0; x<numero.length;x++)
        {
            if(numero [x] == 3)
            {
                c++;
            }
        }
        System.out.println("El numero 3 se cargo : " + c);
    }
    
}
