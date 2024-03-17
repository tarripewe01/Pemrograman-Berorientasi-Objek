package src;
import src.MenghitungBidang.Balok;
import src.MenghitungLuas.Persegi;


public class Main {
    public static void main(String[] args) {
        Balok cetakLuasBalok = new Balok();
        Persegi p = new Persegi();

        cetakLuasBalok.panjang = 15;
        cetakLuasBalok.lebar = 5;
        cetakLuasBalok.tinggi = 10;

        p.setPanjang(12);
        p.setLebar(6);

        cetakLuasBalok.HitungLuasBalok();
        cetakLuasBalok.HitungKelilingBalok();
        cetakLuasBalok.HitungVolumeBalok();

        p.getLuas();
        System.out.println("Luas persegi dengan sisi " + p.getLuas() );
    }

}