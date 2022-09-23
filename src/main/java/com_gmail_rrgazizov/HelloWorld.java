package com_gmail_rrgazizov;

public class HelloWorld {

    public static void main(String[] args) {

        String DisplayedInConsole = "cat";

        if (DisplayedInConsole != null && DisplayedInConsole.length() == 3) {
            System.out.println("Строка из трех символах! :" + DisplayedInConsole);
        }
        //упражнение с математическими операторами
        int a = 3;
        int b = 2;
        double aaa = 3.14;
        double bbb = 1.5;

        System.out.println(a * b);
        System.out.println(a + b);
        System.out.println(aaa + bbb);

        //упражнение с переполнением

        byte aa = 130;
        byte bb = 100;
        System.out.println(aa + bb);
    }


}
