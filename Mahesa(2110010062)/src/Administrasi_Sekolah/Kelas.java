/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrasi_Sekolah;

/**
 *
 * @author Acer
 */
public class Kelas {
    private int idkelas;
    private String namakelas;
    private String nama;
    
    // Konstruktor
    public Kelas(int idkelas, String namakelas, String nama) {
        this.idkelas = idkelas;
        this.namakelas = namakelas;
        this.nama = nama;
    }
    
    // Properti
    public int getIdkelas() {
        return idkelas;
    }
    
    public void setIdkelas(int idkelas) {
        this.idkelas = idkelas;
    }
    
    public String getNamakelas() {
        return namakelas;
    }
    
    public void setNamakelas(String namakelas) {
        this.namakelas = namakelas;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
