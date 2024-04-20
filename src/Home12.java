import java.util.Scanner;

public class Home12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min;
        int ch1 = console.nextInt();    //считываю первое число
        int ch2 = console.nextInt();    //считываю второе число
        if (ch1 > ch2) {                //определяю большее и переопределяю переменные как ch1<ch2
            min = ch2;
            ch2 = ch1;
            ch1 = min;
        }
        while (console.hasNextInt()) {      //вхожу в цикл если введено число
            int ch3 = console.nextInt();
            if (ch3 < ch1 && ch3 < ch2) {   // список всех возможных вариантов с переназначением ch1 и ch2
                ch2 = ch1;
                ch1 = ch3;
            } else if (ch3 > ch1 && ch3 < ch2) {
                ch2 = ch3;
            } else if (ch3 > ch1 && ch3 > ch2 && ch1 == ch2) {
                ch2 = ch3;
            } else if (ch1 == ch2 & ch3 > ch1) {
                ch2 = ch3;
            }
        }
        System.out.println(ch2);
    }
}

