/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;
/**
 *
 * @author ASUS
 */
public class siswa {
        
    private int nis;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private String tanggalLahir;
    private String jenisKelamin;
    private int umur;
    private String agama;
    
    
    public siswa(int nis, String nama, String alamat, String tempatLahir, String tanggalLahir, String jenisKelamin, int umur, String agama){
        setNIS(nis);
        setNama(nama);
        setAlamat(alamat);
        setTempatLahir(tempatLahir);
        setTanggalLahir(tanggalLahir);
        setJenisKelamin(jenisKelamin);
        setUmur(umur);
        setAgama(agama);
    }

    
    //method set
    public void setNIS(int nis){
        this.nis = nis;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setTempatLahir(String tempatLahir){
        this.tempatLahir = tempatLahir;
    }
    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setAgama(String agama){
        this.agama = agama;
    }
    
    //method get
    public int getNIS(){
        return this.nis;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public String getTempatLahir(){
        return this.tempatLahir;
    }
    public String getTanggalLahir(){
        return this.tanggalLahir;
    }
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
    public int getUmur(){
        return this.umur;
    }
    public String getAgama(){
        return this.agama;
    }
    
    
} //end class siswa
