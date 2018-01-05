package main;

import hitungluas.lingkaran.Lingkaran;
import hitungluas.persegi.Persegi;
import hitungluas.persegipanjang.PersegiPanjang;
import java.util.Scanner;

public class Utama{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Scanner read = new Scanner(System.in);
        /*
        System.out.println("====Lingkaran====");
        System.out.print("Masukkan jari-jari lingkaran : ");
        int a = read.nextInt();
        l.tampilLuas(a);
        System.out.println("====Persegi====");
        System.out.print("Masukkan sisi Persegi : ");
        int b = read.nextInt();
        p.tampilLuas(b);
        System.out.println("====Persegi Panjang====");
        System.out.print("Masukkan panjang : ");
        int c = read.nextInt();
        System.out.print("Masukkan lebar : ");
        int d = read.nextInt();
        pp.tampilLuas(c,d);
        */
        System.out.println("===============================");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi panjang");
        System.out.print("pilih bentuk yang anda inginkan : ");
        int pilih = read.nextInt();
        switch(pilih){
            case 1 :
                System.out.print("Masukkan nilai jari - jari : ");
                int a = read.nextInt();
                l.tampilLuas(a);
            break;
            case 2 :
                System.out.print("Masukkan nilai sisi : ");
                int b = read.nextInt();
                p.tampilLuas(b);
            break;
            case 3 :
                System.out.print("Masukkan nilai panjang : ");
                int c = read.nextInt();
                System.out.print("Masukkan nilai lebar : ");
                int d = read.nextInt();
                pp.tampilLuas(c,d);
            break;
        }
    }
}