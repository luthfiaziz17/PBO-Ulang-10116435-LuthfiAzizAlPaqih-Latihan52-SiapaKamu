/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.luthfiazizalpaqih.latihan52.siapakamu;

/**
 *
 * @author
 * NAMA     : Luthfi Aziz Al PAqih
 * NIM      : 10116435
 */
public class Dosen extends Manusia{
    private String nim;
    private String mataKuliah;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun "
                + "sedang mengajar matakuliah PBO");
    }
    
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
    
}
