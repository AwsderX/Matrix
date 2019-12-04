import java.util.Scanner;

public class Main {
    private static int x1, x2, y1, y2;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int multiplie = 0;
        System.out.println("Введите данные первой матрицы");
        x1 = in.nextInt();
        x2 = in.nextInt();
        y1 = in.nextInt();
        y2 = in.nextInt();
        Matrix2 a = new Matrix2(x1, x2, y1, y2);
        System.out.println("Введите данные второй матрицы");
        x1 = in.nextInt();
        x2 = in.nextInt();
        y1 = in.nextInt();
        y2 = in.nextInt();
        Matrix2 b = new Matrix2(x1, x2, y1, y2);
        Matrix2.summa(a, b);
        Matrix2.raznost(a, b);
        Matrix2.multiplication(multiplie, a);
        Matrix2.matrixmultiplication(a, b);
        Matrix2.opredelitel( a, b);
        Matrix2.obratnaya(multiplie, a, b);
    }
}