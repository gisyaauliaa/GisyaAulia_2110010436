/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keuangan;

/**
 *
 * @author ASUS
 */
public class angkatan {
    
    private int tahunAngkatan;
    private String status;
    
    public angkatan(int tahunAngkatan, String status){
        setTahunAngkatan(tahunAngkatan);
        setStatus(status);
    }
    
    //method set
    public void setTahunAngkatan(int tahunAngkatan){
        this.tahunAngkatan = tahunAngkatan;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    //method get
    public int getTahunAngkatan(){
        return tahunAngkatan;
    }
    public String getStatus(){
        return status;
    }
    
} //end class angkatan
