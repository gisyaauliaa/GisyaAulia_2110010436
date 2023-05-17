/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;

/**
 *
 * @author ASUS
 */
public class pengeluaran {
  
    private int nominalBiaya;
    private String ketBiaya;
    private String tanggalPembayaran;
    private String jatuhTempo;
    
    public pengeluaran(int nominalBiaya, String ketBiaya, String tanggalPembayaran, String jatuhTempo){
        setNominalBiaya(nominalBiaya);
        setKetBiaya(ketBiaya);
        setTanggalPembayaran(tanggalPembayaran);
        setJatuhTempo(jatuhTempo);
    }
    
    //method set
    public void setNominalBiaya(int nominalBiaya){
        this.nominalBiaya = nominalBiaya;
    }
    public void setKetBiaya(String ketBiaya){
        this.ketBiaya = ketBiaya;
    }
    public void setTanggalPembayaran(String tanggalPembayaran){
        this.tanggalPembayaran = tanggalPembayaran;
    }
    public void setJatuhTempo(String jatuhTempo){
        this.jatuhTempo = jatuhTempo;
    }
    
    //method get
    public int getNominalBiaya(){
        return nominalBiaya;
    }
    public String getKetBiaya(){
        return ketBiaya;
    }
    public String getTanggalPembayaran(){
        return tanggalPembayaran;
    }
    public String getJatuhTempo(){
        return jatuhTempo;
    }
} //end class pengeluaran
