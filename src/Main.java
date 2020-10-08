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
            System.out.printf("Geben Sie einen Wert ein: ");
            int i = sc.nextInt();
        }
        catch(InputMismatchException ex)
        {
            System.out.printf("Es wurde kein nummerischer Wert eingegeben!!");
        }
    }
}
