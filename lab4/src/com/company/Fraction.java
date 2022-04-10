package com.company;
import java.util.Scanner;

public class Fraction {
    private double chis;
    private double znam;

    public double GetChis() { return chis; }
    public double GetZnam() { return znam; }

    public boolean SetChis(double value)
    {
        chis = value;
        return true;
    }
    public boolean SetZnam(double value)
    {
        if (value == 0)
        {
            znam = 0;
            return false;
        }
        else
        {
            znam = value;
            return true;
        }
    }
    public boolean Init(double x, double y)
    {
        return SetZnam(y) && SetChis(x);
    }

    public void Read()
    {
        Scanner scan = new Scanner(System.in);
        double ch;
        double zn;
        do
        {
            System.out.println("Chiselnuk = ");
            ch = scan.nextDouble();
            System.out.println("Znamennuk = ");
            zn = scan.nextDouble();
        } while (!Init(ch, zn));
    }
    public void Round(double x, double y)
    {
        for(int i=2; i <= y; i++)
        {
            if (x % i == 0 && y % i == 0)
            {
                x /= i;
                y /= i;
            }
        }
        chis = x;
        znam = y;
        System.out.println("Skorochenui drib = " + chis+"/"+znam);
    }
    public double Calc(double x, double y){ return x / y; }
    public void Display()
    {
        System.out.println("Drib = "+chis+"/"+znam);
        Round(chis, znam);
        System.out.println(chis+"/"+znam +"="+ Calc(chis, znam));
    }

}
