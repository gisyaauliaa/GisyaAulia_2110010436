/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;

/**
 *
 * @author ASUS
 */
public class biaya {
    
    private String namaBiaya;
    private int nominalBiaya;
    private String ketBiaya;
    private String tanggalBiaya;
    
    public biaya(String namaBiaya, int nominalBiaya, String ketBiaya, String tanggalBiaya){
        setNamaBiaya(namaBiaya);
        setNominalBiaya(nominalBiaya);
        setKetBiaya(ketBiaya);
        setTanggalBiaya(tanggalBiaya);
    }
    
    //method set
    public void setNamaBiaya(String namaBiaya){
        this.namaBiaya = namaBiaya;
    }
    public void setNominalBiaya(int nominalBiaya){
        this.nominalBiaya = nominalBiaya;
    }
    public void setKetBiaya(String ketBiaya){
        this.ketBiaya = ketBiaya;
    }
    public void setTanggalBiaya(String tanggalBiaya){
        this.tanggalBiaya = tanggalBiaya;
    }
    
    //method get
    public String getNamaBiaya(){
        return namaBiaya;
    }
    public int getNominalBiaya(){
        return nominalBiaya;
    }
    public String getKetBiaya(){
        return ketBiaya;
    }
    public String getTanggalBiaya(){
        return tanggalBiaya;
    }
    
} //end class biaya
