/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrasi_Sekolah;

/**
 *
 * @author Acer
 */
public class utsuas {
    private int idutsuas;
    private double uts;
    private double uas;
    private String nama;
    
    // Konstruktor
    public utsuas(int idutsuas, double uts, double uas, String nama) {
        this.idutsuas = idutsuas;
        this.uts = uts;
        this.uas = uas;
        this.nama = nama;
    }
    
    // Properti
    public int getIdutsuas() {
        return idutsuas;
    }
    
    public void setIdutsuas(int idutsuas) {
        this.idutsuas = idutsuas;
    }
    
    public double getUts() {
        return uts;
    }
    
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUas() {
        return uas;
    }
    
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
