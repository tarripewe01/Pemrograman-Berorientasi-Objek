package src.Mahasiswa;

public class Detail_Mahasiswa {
    public String nama;
    public int nim;
    public int umur;
    public String jurusan;

    public void TampilkanInfo(){
        System.out.println("--- Detail Mahasiswa ---");
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Umur : " + umur);
        System.out.println("Jurusan : " + jurusan);
    }
}