/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahesa.pkg2110010062;

import Administrasi_Sekolah.Bayar;
import Administrasi_Sekolah.DBayar;
import Administrasi_Sekolah.Jurusan;
import Administrasi_Sekolah.Kelas;
import Administrasi_Sekolah.Praktikum;
import Administrasi_Sekolah.Siswa;
import Administrasi_Sekolah.Tapel;
import Administrasi_Sekolah.utsuas;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class MainClass {
    public static void main(String[] args) {
        // Membuat objek Siswa
        Siswa siswa = new Siswa(123456, "John Doe", "Laki-laki", "Jl. Pahlawan No. 123", "Jane Doe", "Jakarta", new Date(), 500000.0);

        // Membuat objek Kelas
        Kelas kelas = new Kelas(1, "XII IPA", "John Doe");

        // Membuat objek Praktikum
        Praktikum praktikum = new Praktikum(1, "Fisika", 100000.0, "John Doe");

        // Membuat objek Jurusan
        Jurusan jurusan = new Jurusan(1, "Teknik Informatika");

        // Membuat objek Tapel
        Tapel tapel = new Tapel(1, "2022/2023", "Semester 1");

        // Membuat objek UTSUAS
        utsuas utsuas = new utsuas(1, 80.0, 85.0, "John Doe");

        // Membuat objek Bayar
        Bayar bayar = new Bayar(1, 123456, "John Doe", "SPP", 500000.0);

        // Membuat objek DBayar
        DBayar dbayar = new DBayar(1, 123456, 1, new Date(), "Pembayaran SPP", 500000.0);

        // Melakukan operasi atau logika lainnya dengan objek-objek tersebut
        // ...

        // Contoh penggunaan properti dan metode pada objek Siswa
        System.out.println("NIS Siswa: " + siswa.getNis());
        System.out.println("Nama Siswa: " + siswa.getNama());

        // Contoh penggunaan properti dan metode pada objek Kelas
        System.out.println("ID Kelas: " + kelas.getIdkelas());
        System.out.println("Nama Kelas: " + kelas.getNamakelas());

        // Contoh penggunaan properti dan metode pada objek Praktikum
        System.out.println("ID Praktikum: " + praktikum.getIdpraktikum());
        System.out.println("Nama Praktikum: " + praktikum.getNama_praktikum());

        // Contoh penggunaan properti dan metode pada objek Jurusan
        System.out.println("ID Jurusan: " + jurusan.getIdjurusan());
        System.out.println("Nama Jurusan: " + jurusan.getNamajurusan());

        // Contoh penggunaan properti dan metode pada objek Tapel
        System.out.println("ID Tapel: " + tapel.getIdtapel());
        System.out.println("Nama Tapel: " + tapel.getNamatapel());

        // Contoh penggunaan properti dan metode pada objek UTSUAS
        System.out.println("ID UTSUAS: " + utsuas.getIdutsuas());
        System.out.println("Nilai UTS: " + utsuas.getUts());

        // Contoh penggunaan properti dan metode pada objek Bayar
        System.out.println("ID Bayar: " + bayar.getIdbayar());
        System.out.println("NIS Bayar: " + bayar.getNis());

        // Contoh penggunaan properti dan metode pada objek DBayar
        System.out.println("ID DBayar: " + dbayar.getNobar());
        System.out.println("ID Bayar: " + dbayar.getIdbayar());

        // ...
    }

}
