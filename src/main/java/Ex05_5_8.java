import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex05_5_8 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a;

            System.out.printf("점수를 입력하세요 : ");
            a = s.nextInt();

            if (a >= 90)
                System.out.printf("A");
            else if (a >= 80)
                System.out.printf("B");
            else if (a >= 70)
                System.out.printf("C");
            else
                if (a >= 60)
                System.out.printf("D");
            else
                System.out.println("F");

            System.out.println("학점 입니다.\n");
        }
    }

