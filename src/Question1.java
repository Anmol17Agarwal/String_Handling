
import java.util.Scanner;
public class Question1 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();

        System.out.print("index:");
        for(int i=0; i<Input.length(); i++ )
        {
            System.out.print("\t" + i );
        }
        System.out.println();
        System.out.print("char:");
        for(int j=0; j<Input.length(); j++)
        {
            System.out.print("\t" +Input.charAt(j));
        }
    }

}