/**
 * Enter Numeric value :
 * Enter Numeric value :
 * Save two values and save them as String variables
 * Add the two values together and display the result.
 */
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numeric Value : ");
        String x = sc.nextLine();
        System.out.print("Enter Numeric Value : ");
        String y = sc.nextLine();

        System.out.println("==============");
        System.out.println(Double.parseDouble(x)+Double.parseDouble(y));
    }

}
