import java.util.Date;
import java.util.Scanner;
public class Lr1_4{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Month: ");
        String Month = in.nextLine();
        System.out.print("Input Date: ");
        int i = in.nextInt();
        if(i <= 31){
            System.out.print("true ");}
        else {
            System.out.print("false ");
        }

        System.out.printf("%s %d \n", Month, i);

        in.close();
    }
}