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
public class DaftarGaji extends Pegawai{
    public Pegawai[] listPegawai;
    public int jumlahPegawaiSekarang = 0;
    
    public DaftarGaji(int jumlahPegawai){
        listPegawai = new Pegawai[jumlahPegawai];
    }
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }
    public void infoGaji(){
        System.out.println("Daftar Gaji");
        for (int i = 0; i < jumlahPegawaiSekarang; i++){
            System.out.println(listPegawai[i].getNama() + 
            " : Rp." + listPegawai[i].getGaji());
        }
    }
}
