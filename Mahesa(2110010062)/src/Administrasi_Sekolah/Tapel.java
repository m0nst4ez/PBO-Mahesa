/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administrasi_Sekolah;

/**
 *
 * @author Acer
 */
public class Tapel {
    private int idtapel;
    private String namatapel;
    private String semester;
    
    // Konstruktor
    public Tapel(int idtapel, String namatapel, String semester) {
        this.idtapel = idtapel;
        this.namatapel = namatapel;
        this.semester = semester;
    }
    
    // Properti
    public int getIdtapel() {
        return idtapel;
    }
    
    public void setIdtapel(int idtapel) {
        this.idtapel = idtapel;
    }
    
    public String getNamatapel() {
        return namatapel;
    }
    
    public void setNamatapel(String namatapel) {
        this.namatapel = namatapel;
    }
    
    public String getSemester() {
        return semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
}
