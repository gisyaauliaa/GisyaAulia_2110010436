/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;

/**
 *
 * @author ASUS
 */
public class pembayaran {
    
    private String tanggalPembayaran;
    private String ketPembayaran;
    private String jatuhTempo;
    private int bulanSpp;
    private int denda;
    
    public pembayaran(String tanggalPembayaran, String ketPembayaran, String jatuhTempo, int bulanSpp, int denda){
        setTanggalPembayaran(tanggalPembayaran);
        setKetPembayaran(ketPembayaran);
        setJatuhTempo(jatuhTempo);
        setBulanSpp(bulanSpp);
        setDenda(denda);
    }
    
    //method set
    public void setTanggalPembayaran(String tanggalPembayaran){
        this.tanggalPembayaran = tanggalPembayaran;
    }
    public void setKetPembayaran(String ketPembayaran){
        this.ketPembayaran = ketPembayaran;
    }
    public void setJatuhTempo(String jatuhTempo){
        this.jatuhTempo = jatuhTempo;
    }
    public void setBulanSpp(int bulanSpp){
        this.bulanSpp = bulanSpp;
    }
    public void setDenda(int denda){
        this.denda = denda;
    }
    
    //mthod get
    public String getTanggalPembayaran(){
        return tanggalPembayaran;
    }
    public String getKetPembayaran(){
        return ketPembayaran;
    }
    public String getJatuhTempo(){
        return jatuhTempo;
    }
    public int getBulanSpp(){
        return bulanSpp;
    }
    public int getDenda(){
        return denda;
    }
    
} //end class pembayaran
