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
public class IF110119005Latihan55ObjectOrientedHandphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android;
        BlackBerry blackBerry;
        WindowsPhone windowsPhone;
        
        android = new Android("Samsung", "Android", "Grand", 3000000, "234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        System.out.println();
        
        blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000, "BHS249");
        blackBerry.displayProduct();
        System.out.println("PIN : " + blackBerry.getPinBB());
        System.out.println();
        
        windowsPhone = new WindowsPhone("Nokia", "Win8", "Model", 1000000, "UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("WP Key Store : " + windowsPhone.getWpKeyStore());
    }
    
}