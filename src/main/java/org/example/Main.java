package org.example;
import java.util.Locale;
import java.util.Scanner;

// основной класс Main, в котором пишется код
public class Main {

    // Константа - радиус Земли в километрах
    public static final double ER = 6371.0;

    // Основной метод main, где пишется код
    public static void main(String[] args)
    {
        // Создание объекта класса Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // useLocale здесь, чтобы можно было принимать число с точкой вместо запятой
        // (удобнее при копировании координат)

        // Ввод широты первой точки с помощью Scanner и Math
        System.out.print("Введите широту первой точки в градусах: ");
        double shirota1 = Math.toRadians(sc.nextDouble());

        // Ввод долготы первой точки с помощью Scanner и Math
        System.out.print("Введите долготу первой точки в градусах: ");
        double dolgota1 = Math.toRadians(sc.nextDouble());

        // Ввод широты второй точки с помощью Scanner и Math
        System.out.print("Введите широту второй точки в градусах: ");
        double shirota2 = Math.toRadians(sc.nextDouble());

        // Ввод долготы второй точки с помощью Scanner и Math
        System.out.print("Введите долготу второй точки в градусах: ");
        double dolgota2 = Math.toRadians(sc.nextDouble());

        // Вычисление расстояния с помощью Сферической теоремы косинусов
        // (разделила строки для удобства просмотра)
        double S = ER * Math.acos(Math.sin(dolgota1) * Math.sin(dolgota2)
                + Math.cos(dolgota1) * Math.cos(dolgota2)
                * Math.cos(shirota2 - shirota1));

        // Вывод результата
        System.out.println("Расстояние между точками: " + S + " км");
    }
}