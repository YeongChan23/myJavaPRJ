public class Height {
    //세로로 뽑을때
    public static void main(String[] args) {

        int i, k;

        for (i=2; i<=9; i++) {
            for (k=1; k<=9; k++){
                System.out.printf("%3dX%d = %2d\n", i, k, i*k);
            }
            System.out.printf("\n");
        }
    }
}
