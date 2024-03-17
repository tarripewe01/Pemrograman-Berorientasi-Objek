package src.MenghitungBidang;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public int luasBalok;
    public int kelilingBalok;
    public int volumeBalok;

    public void HitungLuasBalok(){
        luasBalok = 2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (lebar * tinggi);

        System.out.println("Luas Balok :" +String.valueOf(luasBalok));
    }

    public void HitungKelilingBalok(){
        int value = panjang + lebar + tinggi;
        kelilingBalok = 4 * (value);

        System.out.println("Keliling Balok :" +String.valueOf(kelilingBalok));
    }

    public void HitungVolumeBalok(){
        volumeBalok = panjang * lebar * tinggi;

        System.out.println("Volume Balok :" +String.valueOf(volumeBalok));
    }
}