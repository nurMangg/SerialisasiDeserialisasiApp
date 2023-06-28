/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author mangg
 */
public class Data implements Serializable{

    private List<DataItem> items;
    

    public void setItems(List<DataItem> items){
        this.items = items;
    }

    @Override
    public String toString() {
        String produk, item = "";
        produk = 
                "Nama Mahasiswa :\r\n";
        item = items.stream().map((obj) -> obj.toString()).reduce(item, String::concat);
        return  produk+item;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
