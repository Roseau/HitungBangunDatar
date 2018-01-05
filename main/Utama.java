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
    }
}