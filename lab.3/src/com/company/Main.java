package com.company;
import java.util.Random;
import java.util.Scanner;

class student{
    public String prizv;
    public int kurs;
    public String spec;
    public int fiz;
    public int mat;
    public int prog;

    public student(String prizv, int kurs, String spec, int fiz, int mat, int prog)
    {
        this.prizv = prizv;
        this.kurs = kurs;
        this.spec = spec;
        this.fiz=fiz;
        this.mat=mat;
        this.prog=prog;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final Random rand = new Random();
        String str = "Drogobych, (city), house, university";
        char[] string = str.toCharArray();
        System.out.println("STRING = " + str);
        System.out.println("TASK 1:");
        int k = 0;
        int nomer = 0;
        if (str.length() < 3)
            k = 0;
        else
        {
            for (int i = 0; i < str.length(); i++) {
                if (string[i] == ',' && k < 3) {
                    k++;
                    nomer = i + 1;
                }
                else if (k == 3)
                    break;
            }
        }
        str = str.replace(",", "*");
        if (k > 0)
            System.out.println("third , number: " + nomer);
        else
            System.out.println("there are less than 3 elements, or no ',' symbols");

        System.out.println("Modified String = " + str );

        /*Дано літерний рядок, який містить послідовність символів s0, ..., sn, ... . Вилучити з
            цієї послідовності групи символів, які знаходяться між дужками «(», «)».Самі дужки теж
            мають бути вилучені.Вважається, що всередині кожної пари дужок нема інших дужок.Якщо
            всередині деякої пари дужок є пара інших дужок(вкладені дужки), то виводиться
            повідомлення про помилку.*/
        System.out.println("TASK 2:");

        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (string[i] == '(' && k != 2)
            {
                k1++;
            }

            else if (k == 2)
                for (int j = 0; j < str.length(); j++)
                {
                    if (string[i] == ')' && k != 2)
                    {
                        k2++;
                    }
                }
        }
        if (k1 != 1 && k2 != 1)
            System.out.println("ERROR \n STRING CONTAINES MORE THAN 1 BRACKETS");
        else
        {
            char temp;
            int pos = str.indexOf('(');
            int pos2 = str.indexOf(')');
            str = str.substring(0, pos) + str.substring(pos2+1);
            System.out.println(str);
        }
    }
}
