package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */
    public static void main(String[] args) {
        System.out.println(min(5, 2, 3));
    }

    public static int min(int a, int b, int c) {
        if (b >= a && c >= a) {
            return a;
        } else if (a >= b && c >= b) {
            return b;
        } else return c;
    }

}
