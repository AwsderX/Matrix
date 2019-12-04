import java.util.Scanner;

public class Matrix2 {
    private int x1, x2, y1, y2;
    public Matrix2(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public Matrix2(){
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }
    public static Matrix2 summa(Matrix2 a, Matrix2 b){
        Matrix2 summa = new Matrix2();
        summa.x1 = a.x1+b.x1;
        summa.x2 = a.x2+b.x2;
        summa.y1 = a.y1+b.y1;
        summa.y2 = a.y2+b.y2;
        printmatrix(summa);
        return summa;
    }
    public static Matrix2 raznost(Matrix2 a, Matrix2 b){
        Matrix2 raznost = new Matrix2();
        raznost.x1 = a.x1-b.x1;
        raznost.x2 = a.x2-b.x2;
        raznost.y1 = a.y1-b.y1;
        raznost.y2 = a.y2-b.y2;
        printmatrix(raznost);
        return raznost;
    }
    public static Matrix2 multiplication( int multiplie, Matrix2 a){
        Scanner in = new Scanner(System.in);
        multiplie = in.nextInt();
        System.out.println(multiplie + "*1 матрица равняется");
        Matrix2 multiplication = new Matrix2();
        multiplication.x1 = a.x1*multiplie;
        multiplication.x2 = a.x2*multiplie;
        multiplication.y1 = a.y1*multiplie;
        multiplication.y2 = a.y2*multiplie;
        printmatrix(multiplication);
        return multiplication;
        }
    public static Matrix2 matrixmultiplication(Matrix2 a, Matrix2 b){
        System.out.println("При перемножении матриц образованная матрица имеет вид");
        Matrix2 matrixmultiplication = new Matrix2();
        matrixmultiplication.x1 = a.x1*b.x1+a.x2*b.y1;
        matrixmultiplication.x2 = a.x1*b.x2+a.x2*b.y2;
        matrixmultiplication.y1 = a.y1*b.x1+a.y2*b.y1;
        matrixmultiplication.y2 = a.y1*b.x2+a.y2*b.y2;
        printmatrix(matrixmultiplication);
        return matrixmultiplication;
    }
    public static void opredelitel(Matrix2 a, Matrix2 b){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, определитель какой матрицы вы хотите узнать");
        System.out.println("Определитель первой матрицы равняется " + (a.x1*a.y2-a.x2*a.y1));
        System.out.println("Определитель второй матрицы равняется " + (b.x1*b.y2-b.x2*b.y1));
    }
    public static void obratnaya( int multiplie, Matrix2 a, Matrix2 b) {
        Scanner in = new Scanner(System.in);
        multiplie = (a.x1 * a.y2 - a.x2 * a.y1);
        if (multiplie != 0) {
            System.out.println("Матрица, обратная первой " + multiplie);
            System.out.println((a.y2 * multiplie) + " " + (-1 * a.y1 * multiplie));
            System.out.println((-1 * a.x2 * multiplie) + " " + (a.x1 * multiplie));
        } else {
            System.out.println("Определитель равен 0, обратной матрицы не существует");
        }
    }
    public static void matrixachange(Matrix2 a){
        Scanner in = new Scanner(System.in);
        a.x1 = in.nextInt();
        a.x2 = in.nextInt();
        a.y1 = in.nextInt();
        a.y2 = in.nextInt();
    }
    public static void matrixbchange(Matrix2 b){
        Scanner in = new Scanner(System.in);
        b.x1 = in.nextInt();
        b.x2 = in.nextInt();
        b.y1 = in.nextInt();
        b.y2 = in.nextInt();
    }
    public static void printmatrix(Matrix2 a) {
        System.out.println(a.x1 + " " + a.x2 );
        System.out.println(a.x1 + " " + a.x2 );
    }
}