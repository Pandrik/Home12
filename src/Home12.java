import java.util.Scanner;

public class Home12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min2 = 0;
        int min;
        int ch1 = console.nextInt();
        int ch2 = console.nextInt();
        if (ch1 > ch2) {
            min = ch2;
            ch2 = ch1;
            ch1 = min;
        }
        min2 = ch2;
        while (console.hasNextInt()) {
            int ch3 = console.nextInt();
            if (ch3 < ch1 && ch3 < ch2) {
                min2 = ch1;
            } else if (ch3 > ch1 && ch3 < ch2) {
                min2 = ch3;
            } else if (ch3 > ch1 && ch3 > ch2 && ch1 != ch2) {
                min2 = ch2;
            } else if (ch1 == ch2 & ch3 > ch1) {
                min2 = ch3;
            } else if (ch3 < ch1 && ch3 == ch2) {
                min2 = ch1;
            }
        }
        System.out.println(min2);
    }
}

