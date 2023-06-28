/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author mangg
 */
public class DataItem implements Serializable{
    int nim;
    String nama;
    String kelas;
    String angkatan;
    String email;
    String alamat;
    String nohp;
    
    public DataItem(int nim, String name, String item_kelas, String item_angkatan, String item_email, String item_alamat, String item_nohp){
        this.nim = nim;
        this.nama = name;
        this.kelas = item_kelas;
        this.angkatan = item_angkatan;
        this.email = item_email;
        this.alamat = item_alamat;
        this.nohp = item_nohp;

    }

    @Override
    public String toString() {
        return "\r\nNIM " + nim + "\r\nNAMA = " + nama + "\r\nKELAS = " + kelas + "\r\nANGKATAN = " + angkatan +
                "\r\nEMAIL = " + email + "\r\nALAMAT = " + alamat + "\r\nNO.HP = " + nohp + "\r\n";
    }
    
}
