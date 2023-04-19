import java.util.Scanner;

public class test0419_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        int i, k, temp;

        System.out.printf("숫자를 입력하세요 : ");
        for (i = 0; i <5; i++){
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            for (k = 1; k < 5; k++) {
                if (arr[i] < arr[k]) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = arr[i];
                }
            }
            System.out.printf("%d ", arr[i]);
        }
    }
}
