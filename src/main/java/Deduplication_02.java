import java.util.Scanner;
public class Deduplication_02 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.printf("다섯개의 정수를 입력하세요.\n");

        for (i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
    }
}
