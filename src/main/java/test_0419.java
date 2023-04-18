import java.util.Arrays;
import java.util.Scanner;

public class test_0419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5; // 두번째 for문에서 arr나 5를 넣으면 오류나니까 n에 5를 미리 넣어놓는다
        int arr[] = new int[n]; //n(5)짜리 배열
        int i;

        System.out.printf("숫자를 입력하세요 :");

        for(i = 0; i < 5; i++) {
          arr[i] = sc.nextInt(); //5개까지 변수를 입력받는다
        }

        Arrays.sort(arr); //오름차순 정렬
        for (i = n - 1; i >= 0; i--) { //0번 1번 2번 3번 4번 배열에 100 200 300 400 500
                                    //이 들어있는걸 4번 3번 2번 1번 0번으로 출력되게 하기
            System.out.printf(arr[i] + " ");// 값이 하나 출력 될때마다 한칸 띄우기
        }










    }
}
