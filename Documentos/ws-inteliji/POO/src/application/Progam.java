package application;

import entities.Triangles;

import javax.swing.tree.TreeCellRenderer;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangles x, y;
        x = new Triangles();
        y = new Triangles();

        System.out.println("Enter the measyres of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measyres of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double area = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area %.4f%n", area);

        System.out.printf("Triangle X area %.4f%n", areaY);

        System.out.println((areaY > area)? "Y" : "X");

        sc.close();
    }
}
