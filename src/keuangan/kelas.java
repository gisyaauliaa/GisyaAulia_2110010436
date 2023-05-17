/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;

/**
 *
 * @author ASUS
 */
public class kelas {
    
    private String namaKelas;
    private int dayaTampung;
    
    public kelas(String namaKelas, int dayaTampung){
        setNamaKelas(namaKelas);
        setDayaTampung(dayaTampung);
    }
    
    //method set
    public void setNamaKelas(String namaKelas){
        this.namaKelas = namaKelas;
    }
    public void setDayaTampung(int dayaTampung){
        this.dayaTampung = dayaTampung;
    }
    
    //method get
    public String getNamaKelas(){
        return namaKelas;
    }
    public int getDayaTampung(){
        return dayaTampung;
    }
    
} //end class kelas
