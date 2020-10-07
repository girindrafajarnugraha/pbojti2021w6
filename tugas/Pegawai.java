/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author INDRAFN
 */
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    
    public Pegawai(){
        
    }
    public Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public int getGaji(){
        int gaji = 3500000;
        return gaji;
    }
}
