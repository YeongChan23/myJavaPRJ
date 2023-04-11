import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int arr[] = new int[5]; //5개 받을 수 있는 배열 생성
        int i;
        int max = 0, min = 0, sum= 0;
        Scanner sc = new Scanner(System.in); //정수를 받을 수 있는 객체 생성

        System.out.printf("다섯개의 정수를 입력하세요.\n");


        for (i = 0; i < arr.length; i++) { //0부터 미리 선언해놓은 배열의 길이 5까지 정수를 입력 받음
            arr[i] = sc.nextInt();
            {
                max = arr[0];      // 배열의 첫번째 원소로 초기화 해주지 않으면
                min = arr[0];      // min에서 입력받았을때 0보다 큰값을 입력받으면 에러남
                if (max< arr[i]) { //최대값
                    max = arr[i];
                }
                if (min > arr[i]) { //최소값
                    min = arr[i];
                }
            }
            sum += arr[i];
        }

        System.out.printf("가장 큰 값: %d / 가장 작은 값: %d / 평균 값: %d", max, min, sum / arr.length); // 결과 출력
    }
}