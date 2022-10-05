import java.util.Scanner;
public class Lr1_1{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input Familia: ");
        String Familia = in.nextLine();
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input Otchestvo: ");
        String Otchestvo = in.nextLine();
        System.out.printf("Hallo %s %s %s \n" , Familia, name, Otchestvo);
        in.close();
    }
}
