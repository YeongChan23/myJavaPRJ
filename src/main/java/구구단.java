public class 구구단 {

    public static void main(String[] args) {
        int i, k;
//변수 선언

        for (i = 1, k = 2; i <= 9; k++) {
            System.out.printf("%3dX%d=%2d", k, i, i*k);
//이대로 돌리면 2X1 3X1 4X1처럼 나옴
            if (k >= 9) {
//9단 1열 까지 나오면
                System.out.printf("\n");
//아랫줄로 내려가서
                k = 1;
//k를 1로 초기화하고(1로 해야 각단 세로열이 맞음, 왜 0이 아닌지 모르겠음)
                i++;
//세로로 볼때 i 자리가 늘어서 구구단이 되게 만든다
            }
        }
    }
}
