/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan55.objectorientedhandphone;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan merek handphone beserta OS, model
 *                     ,harga, dan pin dengan berbasis objek
 */
public class BlackBerry extends Handphone {
    
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga, String pinBB) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
    }
    
    public String getPinBB() {
        return this.pinBB;   
    }
    
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
