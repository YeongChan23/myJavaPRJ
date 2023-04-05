public class Ex07_while {
    public static void main(String[] args) {
    int i = 1, k = 2;

    while (i <= 9) {
        System.out.printf("%3dX%d=%2d", k, i, i*k);
        if (k >= 9) {
            System.out.printf("\n");
            k = 1;
            i++;
        }
        k++;
     }
    }
}


