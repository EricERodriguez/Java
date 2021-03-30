import java.util.Scanner;


public class fordetwo 
{
    public static void main(String [] args) 
    {

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Ingrese valor a contar:");
        num = entrada.nextInt();

        for ( int i = 1 ; i <= num; i++)
        {
            if(i%2 == 0){
            System.out.println(i);
            }
        }

        
    }
    
}
