package hitungluas.persegipanjang;

public class PersegiPanjang{
    public static void tampilLuas(int a,int b){
        System.out.println("Luas lingkaran dengan panjang "+a+" dan lebar "+b+" adalah "+hitungLuas(a,b));
    }
    private static float hitungLuas(int panjang, int lebar){
        return panjang*lebar;
    }
}