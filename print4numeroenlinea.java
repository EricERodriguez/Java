
import java.util.Scanner;

public class print4numeroenlinea
{
    public static void main(String[] args)  
    {

        Scanner entrada = new Scanner(System.in);

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.print(a + " " + b + " " + c + " "+ d + "\n");

        System.out.println(a + " " + b + " " + c + " "+ d);

        System.out.printf("%d %d %d %d", a , b , c , d);
    }
}
