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
public class tugasMain {
    public static void main(String[] args) {
        
        Pegawai pegawai = new Pegawai();
        pegawai.setNama("Julian");
        
        Dosen dosen1 = new Dosen();
        dosen1.setNama("Hasyim");
        Dosen dosen = new Dosen();
        dosen.setNama("David");

        DaftarGaji gaji = new DaftarGaji(3);
        gaji.addPegawai(pegawai);
        gaji.addPegawai(dosen1);
        gaji.addPegawai(dosen);
        gaji.infoGaji();
    }
}
