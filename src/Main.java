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
        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while (b)
        {
            try
            {
                System.out.printf("Geben Sie einen Wert ein: %n");
                Double i = sc.nextDouble();

                System.out.printf("Geben Sie den zweiten Wert ein, den Sie addieren möchten: ");
                Double o = sc.nextDouble();

                Double sum = i + o;

                System.out.printf("Das Ergebnis bertägt: %f", sum);
                b = false;

            } catch (InputMismatchException ex)
            {
                System.out.printf("Es wurde kein nummerischer Wert eingegeben!!%n");

                sc.next();
            }
        }
    }
}
