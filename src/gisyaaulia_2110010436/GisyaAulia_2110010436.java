/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gisyaaulia_2110010436;
import keuangan.*;

/**
 *
 * @author ASUS
 */
public class GisyaAulia_2110010436 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //membuat objek dari class
        //INPUT
        siswa data = new siswa(1234, "Gisya", "Jalan Sungai Jingah", "Banjarmasin", "27 Februari 2004", "Perempuan", 19, "Islam");
        //OUTPUT
        System.out.println("NIS saya adalah " +data.getNIS());
        System.out.println("Nama saya adalah " +data.getNama());
        System.out.println("Alamat saya di " +data.getAlamat());
        System.out.println("Tempat lahir di " +data.getTempatLahir());
        System.out.println("Tanggal lahir saya " +data.getTanggalLahir());
        System.out.println("Jenis kelamin saya " +data.getJenisKelamin());
        System.out.println("Umur saya " +data.getUmur()+" Tahun");
        System.out.println("Agama saya " +data.getAgama());
    
        //objek class pembayaran
        pembayaran bayar = new pembayaran("20 November 2020", "LUNAS", "21 Oktober 2020", 100000, 0);
        //Output
        System.out.println("Tanggal pembayaran adalah : " +bayar.getTanggalPembayaran());
        System.out.println("Keterangan pembayaran anda : " +bayar.getKetPembayaran());
        System.out.println("Akan jatuh tempo pada tanggal : " +bayar.getJatuhTempo());
        System.out.println("SPP perbulan sebesar : " +bayar.getBulanSpp());
        System.out.println("Denda yang harus dibayar sebesar : " +bayar.getDenda());
        
        //objek class biaya
        biaya Biaya = new biaya("Pembangunan Lapangan", 1000000, "Biaya Masuk", "10 Maret 2020");
        //Output
        System.out.println("Biaya digunakan untuk " +Biaya.getNamaBiaya());
        System.out.println("Nominalnya yaitu : " +Biaya.getNominalBiaya());
        System.out.println("Keterangan biaya : " +Biaya.getKetBiaya());
        System.out.println("Tanggal biaya : " +Biaya.getTanggalBiaya());
        
        //objek class pengeluaran
        pengeluaran keluar = new pengeluaran(500000, "membeli semen", "10 Januari 2020", "11 Februari 2020");
        //Output
        System.out.println("Nominal biaya yang dikeluarkan sebesar " +keluar.getNominalBiaya());
        System.out.println("Biaya digunakan untuk " +keluar.getKetBiaya());
        System.out.println("Tanggal pengeluaran : " +keluar.getTanggalPembayaran());
        System.out.println("Jatuh tempo pada : " +keluar.getJatuhTempo());
        
        //objek class kelas
        kelas Kelas = new kelas("XI MIPA", 25);
        //Output
        System.out.println("Nama kelasnya adalah " +Kelas.getNamaKelas());
        System.out.println("Daya tampung kelasnya adalah " +Kelas.getDayaTampung()+" Orang");
        
        //objek class angkatan
        angkatan Angkatan = new angkatan(2021, "Aktif");
        //Output
        System.out.println("Angkatan tahun : " +Angkatan.getTahunAngkatan());
        System.out.println("Status dalam sekolah : " +Angkatan.getStatus());
        
        //objek class sekolah
        sekolah Sekolah = new sekolah("SMA NEGERI 5", "Suripto", "Jalan Sultan Adam", 70121, "08123", 111, "smali@gmail.com", "smali.com");
        //Output
        System.out.println("Nama sekolahannya adalah " +Sekolah.getNamaSekolah());
        System.out.println("Nama kepala sekolahnya adalah " +Sekolah.getNamaKepsek());
        System.out.println("Alamat sekolahan di " +Sekolah.getAlamatSekolah());
        System.out.println("Kode pos sekolah adalah " +Sekolah.getKodePos());
        System.out.println("Nomor telpon sekolah adalah " +Sekolah.getTelponSekolah());
        System.out.println("Fax sekolahan adalah " +Sekolah.getFaxSekolah());
        System.out.println("Email : " +Sekolah.getEmailSekolah());
        System.out.println("Website : " +Sekolah.getWebsiteSekolah());
    } //end class main
        
    } 
    

