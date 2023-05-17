/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;

/**
 *
 * @author ASUS
 */
public class sekolah {
    
    private String namaSekolah;
    private String namaKepsek;
    private String alamatSekolah;
    private int kodePos;
    private String telponSekolah;
    private int faxSekolah;
    private String emailSekolah;
    private String websiteSekolah;
    
    public sekolah(String namaSekolah, String namaKepsek, String alamatSekolah, int kodePos, String telponSekolah, int faxSekolah, String emailSekolah, String websiteSekolah){
        setNamaSekolah(namaSekolah);
        setNamaKepsek(namaKepsek);
        setAlamatSekolah(alamatSekolah);
        setKodePos(kodePos);
        setTelponSekolah(telponSekolah);
        setFaxSekolah(faxSekolah);
        setEmailSekolah(emailSekolah);
        setWebsiteSekolah(websiteSekolah);
    }
    
    //method set
    public void setNamaSekolah(String namaSekolah){
        this.namaSekolah = namaSekolah;
    }
    public void setNamaKepsek(String namaKepsek){
        this.namaKepsek = namaKepsek;
    }
    public void setAlamatSekolah(String alamatSekolah){
        this.alamatSekolah = alamatSekolah;
    }
    public void setKodePos(int kodePos){
        this.kodePos = kodePos;
    }
    public void setTelponSekolah(String telponSekolah){
        this.telponSekolah = telponSekolah;
    }
    public void setFaxSekolah(int faxSekolah){
        this.faxSekolah = faxSekolah;
    }
    public void setEmailSekolah(String emailSekolah){
        this.emailSekolah = emailSekolah;
    }
    public void setWebsiteSekolah(String websiteSekolah){
        this.websiteSekolah = websiteSekolah;
    }
    
    //method get
    public String getNamaSekolah(){
        return namaSekolah;
    }
    public String getNamaKepsek(){
        return namaKepsek;
    }
    public String getAlamatSekolah(){
        return alamatSekolah;
    }
    public int getKodePos(){
        return kodePos;
    }
    public String getTelponSekolah(){
        return telponSekolah;
    }
    public int getFaxSekolah(){
        return faxSekolah;
    }
    public String getEmailSekolah(){
        return emailSekolah;
    }
    public String getWebsiteSekolah(){
        return websiteSekolah;
    }
    
    
} //end class sekolah
