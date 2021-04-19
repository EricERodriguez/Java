import java.util.Scanner;


public class tresvectores 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        String ciudad [] = new String[5];
        int min [] = new int[5];
        int max []= new int[5];

        for(int i = 0; i<ciudad.length; i++){

            System.out.println("Ciudad " + i);
            ciudad [i] = entrada.nextLine();
        }
        for(int i = 0; i<min.length; i++){
            System.out.println("Temperatura minima de  " + ciudad [i]);
            min [i] = entrada.nextInt();
        }
        for(int i = 0; i<max.length; i++){
            System.out.println("Temperatura max de " + ciudad [i]);
            max [i] = entrada.nextInt();
        }

        int may = 0;

        for (int x = 0; x<max.length; x++)
        {
            if(max[x]>may)
            {
                may = max[x];
            }
        }
        int men = 0;

        for (int x = 0; x<max.length; x++)
        {
            if(max[x]>men)
            {
                men = max[x];
            }
        }

        System.out.println("La temperatura maxima fue de " + may );
        System.out.println("La temperatura minima fue de " + men );
    }
}
