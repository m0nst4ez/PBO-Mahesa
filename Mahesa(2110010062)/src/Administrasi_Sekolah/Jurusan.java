/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrasi_Sekolah;

/**
 *
 * @author Acer
 */
public class Jurusan {
    private int idjurusan;
    private String namajurusan;
    
    // Konstruktor
    public Jurusan(int idjurusan, String namajurusan) {
        this.idjurusan = idjurusan;
        this.namajurusan = namajurusan;
    }
    
    // Properti
    public int getIdjurusan() {
        return idjurusan;
    }
    
    public void setIdjurusan(int idjurusan) {
        this.idjurusan = idjurusan;
    }
    
    public String getNamajurusan() {
        return namajurusan;
    }
    
    public void setNamajurusan(String namajurusan) {
        this.namajurusan = namajurusan;
    }
    
}
