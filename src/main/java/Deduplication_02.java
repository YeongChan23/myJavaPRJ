import java.util.Arrays;
import java.util.Scanner;
public class Deduplication_02 {
    public static void main(String[] args) {
        boolean inArr[] = new boolean[5];
        int arr[] = new int[5];
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.printf("다섯개의 정수를 입력하세요.\n");

        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i <= sc.nextInt(i); i++) {
            arr[i] == inArr[i] == true;
        }



        Arrays.sort(arr);
        System.out.printf(Arrays.toString(arr));

    }
}
