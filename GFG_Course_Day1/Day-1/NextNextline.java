import java.util.Scanner;

public class NextNextline {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();
        System.out.println(a);
        System.out.println(s);

    }
}
