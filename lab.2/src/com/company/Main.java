package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final Random random = new Random();
        //Завдання 1
        System.out.println("TASK 1:");
            /*Написати програму, яка за допомогою генератора випадкових чисел формує вказаний
            масив – такий, що значення його елементів належать заданому діапазону.Обчислити
            кількість та суму тих елементів, які задовольняють вказаному критерію; а також замінити
            нулями ці елементи.*/

            /*Діапазон значень елементів масиву: (-50,...,15)
            Одновимірний масив a із 24 елементів цілого типу.
            Критерій – всі від’ємні або непарні.*/


        int n = 24;
        int[] a = new int[n];

        int low = -50;
        int high = 15;

        for (int i = 0; i < n; i++)
            a[i] = low + random.nextInt(high-low+1);

        System.out.print("a[] = {");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+", ");

        }
        System.out.println("}");

        int S = 0;
        int k = 0;

        for (int i = 0; i < n; i++)
            if (a[i] < 0 || a[i] % 2 == 1)
            {
                S += a[i];
                k++;
                a[i] = 0;
            }

        System.out.println("Number = " + k);
        System.out.println("Sum = " + S);
        System.out.print("a[] = {");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+", ");

        }
        System.out.println("}");

        //Завдання 2
        System.out.println("TASK 2:");
            /*Написати функцію, яка обчислює кількість непарних елементів одновимірного масиву
            (вектора) a із n елементів цілого типу.*/

        int nt = 5;
        low = 1;
        high = 10;

        for (int i = 0; i < nt; i++)
            a[i] = low + random.nextInt(high-low+1);
        System.out.print("a[] = {");

        for (int i = 0; i < nt; i++)
        {
            System.out.print(a[i]+", ");

        }
        System.out.println("}");

        k = 0;
        for (int i = 0; i < nt; i++)
            if (a[i] % 2 == 1)
            {
                k++;
            }
        System.out.println("Number = " + k);

        //Завдання 3
        System.out.println("TASK 3:");
        /*Написати програму, яка шукає суму мінімальних елементів по всіх рядках матриці (k * n).*/

        int rowCount = 3;
        int colCount = 3;

        int[][] ab = new int[rowCount][colCount];

        for (int i = 0; i < rowCount; i++)
            for (int j = 0; j < colCount; j++)
                ab[i][j] = low + random.nextInt(high-low+1);

        for (int i = 0; i < rowCount; i++)
        {
            for (int j = 0; j < colCount; j++)
                System.out.print(ab[i][j] + " ");

            System.out.println();
        }
        System.out.println();

        S = 0;
        for (int i = 0; i < rowCount; i++)
        {
            int min = ab[i][0];
            for (int j = 1; j < colCount; j++)
                if (ab[i][j] < min) min = ab[i][j];
            S += min;

        }
        System.out.println("Sum = " + S);

    }
}
