import java.util.Date;
import java.util.Scanner;
public class Lr1_3{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input Day: ");
        String Day = in.nextLine();
        System.out.print("Input Month: ");
        String Month = in.nextLine();
        System.out.print("Input Date: ");
        int Date = in.nextInt();
        System.out.printf("%s %d %s \n" , Day, Date, Month);
        in.close();
    }
}