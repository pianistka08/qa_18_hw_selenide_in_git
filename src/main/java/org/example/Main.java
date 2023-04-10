package org.example;

public class Main {
    public static void main(String[] args) {
        // Переполним int
        int maxInt = 2147483647;
        int minInt = -2147483648;

        System.out.println((maxInt + 1) + " - это результат переполнения максимального int");
        System.out.println((minInt - 1) + " - это результат переполнения минимального int");

        // Разные типы данных (результат меня саму удивил, хотя я знаю, как это работает)
        float simpleDouble = 2.14F;
        int simpleInt = 2;

        System.out.println("Делим double: " + (simpleDouble / (double)simpleInt));

        // Логические выражения
        if(minInt < 0 && maxInt > 0)
            System.out.println("Логический оператор \"И\" проверяет обе части выражения");

        if(minInt != 0)
            System.out.println("Так работает отрицание");

        if(minInt == 0 || maxInt != 1)
            System.out.println("Логический оператор \"ИЛИ\" проверяет обе части выражения");

        String goodBye = (maxInt % 2 == 0) ? "Максимальный int делится на 2 с остатком" : "Максимальный int не делится на 2 с остатком";
        System.out.println(goodBye);
    }
}