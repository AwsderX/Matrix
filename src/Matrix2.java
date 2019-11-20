public class Matrix2 {
    public void main(String[] args){
        /**Число**/
        double k = 10;
        /**Первая матрица**/
        double x11 = 3;
        double x12 = 5;
        double x21 = 7;
        double x22 = 9;
        /**Вторая матрица**/
        double y11 = 1;
        double y12 = 2;
        double y21 = 6;
        double y22 = 8;
        /**Сложение**/
        double sum11 = x11 + y11;
        double sum12 = x12 + y12;
        double sum21 = x21 + y21;
        double sum22 = x22 + y22;
        /**Вычитание**/
        double minus11 = x11 - y11;
        double minus12 = x12 - y12;
        double minus21 = x21 - y21;
        double minus22 = x22 - y22;
        /**Умножение на число**/
        double ymnoshenie11 = x11 * k;
        double ymnoshenie12 = x12 * k;
        double ymnoshenie21 = x21 * k;
        double ymnoshenie22 = x22 * k;
        /**Перемножение**/
        double pereym11 = x11 * y11 + x12 * y21;
        double pereym12 = x11 * y12 + x12 * y22;
        double pereym21 = x21 * y11 + x22 * y21;
        double pereym22 = x21 * y12 + x22 * y22;
        /**Нахождение определителя**/
        double opred = (x11 * x22) - (x12 * x21);
        /**Обратная матрица**/
        double obrat11 = x22;
        double obrat12 = x22;
        double obrat21 = x12;
        double obrat22 = x11;
        /**Результат**/
        System.out.println(sum11 + " " + sum12 + " " + sum21 + "" + sum22);
        System.out.println(minus11 + " " + minus12 + " " + minus21 + "" + minus22);
        System.out.println(ymnoshenie11 + " " + ymnoshenie12 + " " + ymnoshenie21 + "" + ymnoshenie22);
        System.out.println(pereym11 + " " + pereym12 + " " + pereym21 + "" + pereym22);
        System.out.println(opred);
        System.out.println(obrat11 + " " + obrat12 + " " + obrat21 + "" + obrat22);
    }
}
