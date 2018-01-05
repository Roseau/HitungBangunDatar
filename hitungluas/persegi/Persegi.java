package hitungluas.persegi;

public class Persegi{
    public static void tampilLuas(int a){
        System.out.println("Luas lingkaran dengan jari - jari "+a+" adalah "+hitungLuas(a));
    }
    private static int hitungLuas(int sisi){
        return sisi*sisi;
    }
}