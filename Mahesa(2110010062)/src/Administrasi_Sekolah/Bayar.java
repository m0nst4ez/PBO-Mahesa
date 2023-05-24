/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrasi_Sekolah;

/**
 *
 * @author Acer
 */
public class Bayar {
   private int idbayar;
    private int nis;
    private String nama;
    private double spp;
    private int idtapel;
    private int idkelas;
    private int idjurusan;
    private int idutsuas;
    private int idpraktikum;
    
    // Konstruktor
    public Bayar(int idbayar, int nis, String nama, String spp1, double spp) {
        this.idbayar = idbayar;
        this.nis = nis;
        this.nama = nama;
        this.spp = spp;
        this.idtapel = idtapel;
        this.idkelas = idkelas;
        this.idjurusan = idjurusan;
        this.idutsuas = idutsuas;
        this.idpraktikum = idpraktikum;
    }
    
    // Properti
    public int getIdbayar() {
        return idbayar;
    }
    
    public void setIdbayar(int idbayar) {
        this.idbayar = idbayar;
    }
    
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
    
    public double getSpp() {
        return spp;
    }
    
    public void setSpp(double spp) {
        this.spp = spp;
    }
    
    public int getIdtapel() {
        return idtapel;
    }
    
    public void setIdtapel(int idtapel) {
        this.idtapel = idtapel;
    }
    
    public int getIdkelas() {
        return idkelas;
    }
    
    public void setIdkelas(int idkelas) {
        this.idkelas = idkelas;
    }
    
    public int getIdjurusan() {
        return idjurusan;
    }
    
    public void setIdjurusan(int idjurusan) {
        this.idjurusan = idjurusan;
    }
    
    public int getIdutsuas() {
        return idutsuas;
    }
    
    public void setIdutsuas(int idutsuas) {
        this.idutsuas = idutsuas;
    }
    
    public int getIdpraktikum() {
        return idpraktikum;
    }
    
    public void setIdpraktikum(int idpraktikum) {
        this.idpraktikum = idpraktikum;
    } 
}
