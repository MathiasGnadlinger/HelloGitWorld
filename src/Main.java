import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Mathias Gnadlinger
 * @version 4, 08.10.2020
 */
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Geben Sie einen Wert ein: %n");
            int i = sc.nextInt();

            System.out.printf("Geben Sie den zweiten Wert ein, den Sie addieren möchten: ");
            int o = sc.nextInt();

            int sum = i +o;

            System.out.printf("Das Ergebnis bertägt: %d",sum);;

        }
        catch(InputMismatchException ex)
        {
            System.out.printf("Es wurde kein nummerischer Wert eingegeben!!");
        }



    }
}
