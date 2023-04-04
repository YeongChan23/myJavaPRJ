public class 구구단 {

    public static void main(String[] args) {
        int i, k;


        for (i = 1, k = 2; i <= 9; k++) {
            System.out.printf("%3dX%d=%2d", k, i, i*k);
            if (k >= 9) {
                System.out.printf("\n");
                k = 1;
                i++;
            }
        }
    }
}
