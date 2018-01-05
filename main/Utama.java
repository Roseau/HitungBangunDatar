package main;

import hitungluas.lingkaran.Lingkaran;
import hitungluas.persegi.Persegi;
import hitungluas.persegipanjang.PersegiPanjang;

public class Utama{
    public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();

        l.tampilLuas(8);
        p.tampilLuas(14);
        pp.tampilLuas(10,5);
    }
}