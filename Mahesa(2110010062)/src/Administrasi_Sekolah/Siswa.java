/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrasi_Sekolah;

/**
 *
 * @author Acer
 */
import java.util.Date;

public class Siswa {
    private int nis;
    private String nama;
    private String jk;
    private String alamat;
    private String ortu;
    private String tlahir;
    private Date tgllahir;
    private double spp;
    
    // Konstruktor
    public Siswa(int nis, String nama, String jk, String alamat, String ortu, String tlahir, Date tgllahir, double spp) {
        this.nis = nis;
        this.nama = nama;
        this.jk = jk;
        this.alamat = alamat;
        this.ortu = ortu;
        this.tlahir = tlahir;
        this.tgllahir = tgllahir;
        this.spp = spp;
    }
    
    // Properti
    public int getNis() {
        return nis;
    }
    
    public void setNis(int nis) {
        this.nis = nis;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getJk() {
        return jk;
    }
    
    public void setJk(String jk) {
        this.jk = jk;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getOrtu() {
        return ortu;
    }
    
    public void setOrtu(String ortu) {
        this.ortu = ortu;
    }
    
    public String getTlahir() {
        return tlahir;
    }
    
    public void setTlahir(String tlahir) {
        this.tlahir = tlahir;
    }
    
    public Date getTgllahir() {
        return tgllahir;
    }
    
    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }
    
    public double getSpp() {
        return spp;
    }
    
    public void setSpp(double spp) {
        this.spp = spp;
    }
    
}
