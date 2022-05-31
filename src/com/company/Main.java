package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    double boy;
    int kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();

        System.out.print("Vücut Kitle İndeksiniz : " + (kilo / (boy * boy)) );






    }
}
