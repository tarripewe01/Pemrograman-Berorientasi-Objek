package src.Buku;

public class Detail_Buku {
    public String judul;
    public String penulis;
    public String penerbit;
    public int tahun_terbit;
    public String isbn;

    public void Detail_Buku(){
        System.out.println("--- Detail Buku ---");
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun Terbit : " + tahun_terbit);
        System.out.println("ISBN : " + isbn);
    }
}
