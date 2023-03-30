public class Ex006 {

    public static void main(String[] args) {
        int i, k;

        for (i = 1, k = 2; k <= 9; i++) {
            if (i > 9) {
                i = 0;
                k++;
            } else {
                System.out.printf("%d X %d = %d ", k, i, i * k);
            }
            System.out.printf("\n");
        }
    }
}
