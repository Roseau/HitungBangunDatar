package hitungluas.lingkaran;

public class Lingkaran{
    public static void tampilLuas(int a){
        System.out.println("Luas lingkaran dengan jari - jari "+a+" adalah "+hitungLuas(a));
    }
    private static double hitungLuas(int jari){
        return 3.14*jari*jari;
    }
}