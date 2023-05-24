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

public class DBayar {
    private String nobar;
    private int idbayar;
    private int nis;
    private Date tglbayar;
    private String keterangan;
    private double jumlah;
    private String nama;

    // Konstruktor
    public DBayar(int idbayar, int nis, int par2, Date tglbayar, String nobar, double jumlah) {
        this.nobar = nobar;
        this.idbayar = idbayar;
        this.nis = nis;
        this.tglbayar = tglbayar;
        this.keterangan = keterangan;
        this.jumlah = jumlah;
        this.nama = nama;
    }

    // Properti
    public String getNobar() {
        return nobar;
    }

    public void setNobar(String nobar) {
        this.nobar = nobar;
    }

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

    public Date getTglbayar() {
        return tglbayar;
    }

    public void setTglbayar(Date tglbayar) {
        this.tglbayar = tglbayar;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
