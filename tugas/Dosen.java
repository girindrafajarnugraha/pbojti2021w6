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
public class Dosen extends Pegawai{
    public int jumlahSks;
    public int tarifSks;
    
    public Dosen(){
        
    }
    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }
    public void setSks(int sks){
        this.jumlahSks = sks;
    }
    public int getGaji(){
        int total = jumlahSks * tarifSks;
        return total + super.getGaji();
    }
}
