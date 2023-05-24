/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrasi_Sekolah;

/**
 *
 * @author Acer
 */
public class Praktikum {
    private int idpraktikum;
    private String nama_praktikum;
    private double biaya;
    private String nama;
    
    // Konstruktor
    public Praktikum(int idpraktikum, String nama_praktikum, double biaya, String nama) {
        this.idpraktikum = idpraktikum;
        this.nama_praktikum = nama_praktikum;
        this.biaya = biaya;
        this.nama = nama;
    }
    
    // Properti
    public int getIdpraktikum() {
        return idpraktikum;
    }
    
    public void setIdpraktikum(int idpraktikum) {
        this.idpraktikum = idpraktikum;
    }
    
    public String getNama_praktikum() {
        return nama_praktikum;
    }
    
    public void setNama_praktikum(String nama_praktikum) {
        this.nama_praktikum = nama_praktikum;
    }
    
    public double getBiaya() {
        return biaya;
    }
    
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
