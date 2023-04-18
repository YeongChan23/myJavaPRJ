import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Deduplication_03 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.printf("다섯 개의 정수를 입력하세요.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            set.add(num);
        }

        int[] deduplicatedArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            deduplicatedArr[index++] = num;
        }

        Arrays.sort(deduplicatedArr);
        System.out.printf("저장된 값은");
        System.out.printf(Arrays.toString(deduplicatedArr));
        System.out.printf("입니다");

    }
}
