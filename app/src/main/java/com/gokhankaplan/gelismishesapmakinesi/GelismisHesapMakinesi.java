package com.gokhankaplan.gelismishesapmakinesi;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama: " + result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int carpım(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma: " + result);
        return result;
    }

    static void divide(int a, int b){
        int result = a / b;
        System.out.println("Bölme: " + result);
        if (b == 0) {
            System.out.println("Bölen sayı 0 olamaz.");
        }
    }

    static int Uslu(int a, int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        int result;
        result = a % b;
        return result;
    }

    static void Calc(int a, int b) {
        System.out.println("Alan: " + a * b);
        System.out.println("çevre" + 2*(a + b));
    }




    public static void main(String[] args){

        String menu = "1-Toplama işlemi\n" +
                "2-Çıkarma işlemi\n" +
                "3-Çarpma işlemi\n" +
                "4-Bölme işlemi\n" +
                "5-Üslü sayı hesaplama\n" +
                "6-Mod alma\n" +
                "7-Dikdrötgen alan ve çevre hesabı\n" +
                "8-:Çıkış yap";

        int a, b, select;

        System.out.println(menu);


        while (true) {

            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();

            if(select == 0) {
                break;
            }

            System.out.println("İlk sayıyı giriniz: ");
            a = input.nextInt();
            System.out.println("İkinci sayıyı giriniz: ");
            b = input.nextInt();
            switch (select) {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    carpım(a,b);
                    break;
                case 4:
                    divide(a,b);
                case 5:
                    System.out.println("Üslü: " + Uslu(a,b));
                case 6:
                    System.out.println("Mod: " + mod(a,b));
                case 7:
                    Calc(a,b);
                default:
                    System.out.println("Çıkış yaptınız!");
            }

        }

    }
}
