package src;

import src.Buku.Detail_Buku;
import src.Mahasiswa.Detail_Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Detail_Mahasiswa tampilkanInfo = new Detail_Mahasiswa();
        Detail_Buku tampilkanInfoBuku = new Detail_Buku();

        tampilkanInfo.nama = "Nayaka Salsabilla";
        tampilkanInfo.nim = 22076389;
        tampilkanInfo.umur = 20;
        tampilkanInfo.jurusan = "Teknik Informatika";

        tampilkanInfoBuku.judul = "Pengenalan dan Implementasi Technologi Blockchain pada WEB 3.0";
        tampilkanInfoBuku.penulis = "Dr. Muhammad Agus Zainuddin, S.T.,M.T.";
        tampilkanInfoBuku.penerbit = "Deepublish";
        tampilkanInfoBuku.tahun_terbit = 2023;
        tampilkanInfoBuku.isbn = "978-623-02-7535-7";

        tampilkanInfo.TampilkanInfo();
        tampilkanInfoBuku.Detail_Buku();

    }
}