package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            //Завдання 1
        /*Написати програму для обчислення і виводу на екран значення змінної y – функції від
        аргументу x. x, y – дійсні числа.
        Значення x ввести з клавіатури. В одній програмі реалізувати два способи: 1)
        використання лише команд розгалуження в скороченій формі та 2) використання лише
        команд розгалуження в повній формі – отримані результати мають збігатися.
        */
        double x; // вхідний параметр
        double y; // результат обчислення виразу
        double A = 0; // проміжний результат - функціонально стала частина виразу
        double B = 0; // проміжний результат - функціонально змінна частина виразу
        System.out.println("TASK 1:");
        System.out.print("x = ");
        x = in.nextDouble();
        A = 2 / x + Math.abs(x);
        if (x < 0)
            B = 1 + 4 * Math.pow(x, 2);
        else
            if (x > 2)
                B = 5 * Math.sin(x * x + 1);
            else
                B = Math.pow(Math.exp(x) + Math.abs(x), 2);

            y = A + B;

            System.out.println("Task 1: y = " + String.format("%.3f", y));

        //Завдання 2
            /*Написати програму для обчислення і виводу на екран значення функції F від
            аргументу x. a, b, c – дійсні числа.
            Значення a, b, c, x ввести з клавіатури. В одній програмі реалізувати два способи: 1)
            використання лише команд розгалуження в скороченій формі та 2) використання лише
            команд розгалуження в повній формі – отримані результати мають збігатися.
            */
        System.out.println("TASK 2:");

        double a; // вхідний параметр
        double b; // вхідний параметр
        double c; // вхідний параметр
        double F = 0; // результат обчислення виразу

        System.out.print("a = ");
        a = in.nextDouble();
        System.out.print("b = ");
        b = in.nextDouble();
        System.out.print("c = ");
        c = in.nextDouble();
        System.out.print("x = ");
        x = in.nextDouble();

        if (a < 0 && c != 0)
            F = a * x * x + b * x + c;

        else
        if (a > 0 && c == 0)
            F = (-a) / (x - c);

        else
            F = a * (x + c);

        System.out.println("Task 2: F = " + String.format("%.3f", F));

        //Завдання 3
            /*Написати програму, яка обчислює значення вказаного виразу за допомогою циклів. В
            одній програмі слід вивести результати обчислень за 4-ма способами:
            1) while(...) { ... }
            2) do{ ... } while(...);
            3) for(...; ...; n++) {... }
            4) for(...; ...; n--) {... }
            Всі 4 результати мають збігатися.
            */
        System.out.println("TASK 3:");

        int k = 1, N, i;
        double S;

        System.out.print("N = ");
        N = in.nextInt();

        S = 0;
        i = k;
        while (i <= N)
        {
            S += (1.0 / i + Math.sqrt(1 + Math.sin(i) * Math.sin(i)));
            i++;
        }
        System.out.println("1) S = " + String.format("%.3f", S));

        S = 0;
        i = k;
        do
        {
            S += (1.0 / i + Math.sqrt(1 + Math.sin(i) * Math.sin(i)));
            i++;
        } while (i <= N);
        System.out.println("2) S = " + String.format("%.3f", S));

        S = 0;
        for (i = k; i <= N; i++)
        {
            S += (1.0 / i + Math.sqrt(1 + Math.sin(i) * Math.sin(i)));
        }
        System.out.println("3) S = " + String.format("%.3f", S));

        S = 0;
        for (i = N; i >= k; i--)
        {
            S += (1.0 / i + Math.sqrt(1 + Math.sin(i) * Math.sin(i)));
        }
        System.out.println("4) S = " + String.format("%.3f", S));
    }
}
