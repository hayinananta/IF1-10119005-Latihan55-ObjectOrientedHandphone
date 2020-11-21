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
public class Android extends Handphone {
    
    private String keyStore;
    
    public Android(String man, String os, String model, int harga, String keyStore) {
        super(man, os, model, harga);
        this.keyStore = keyStore;
    }
    
    public String getKeyStore() {
        return this.keyStore;
    }
    
    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}