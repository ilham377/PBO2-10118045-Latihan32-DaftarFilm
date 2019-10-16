/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan32daftarfilm;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : daftar film
 */
public class PBO10118045Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar film sedang Tayang===");
        Film flm1 = new Film();
        Film flm2 = new Film();
        Film flm3 = new Film();
        Film flm5 = new Film();
        Film flm4 = new Film();
        flm1.setfilmName("Venom");flm1.setfilmGenre("Action, Hprrpr, Scifi");flm1.setfilmRating(8.5);flm1.setfilmDuration(120);
        flm2.setfilmName("Small Foot");flm2.setfilmGenre("Animation");flm2.setfilmRating(9.0);flm2.setfilmDuration(96);
        flm3.setfilmName("Crazy Rich Asian");flm3.setfilmGenre("Comedy");flm3.setfilmRating(7.8);flm3.setfilmDuration(115);
        flm4.setfilmName("Asih");flm4.setfilmGenre("Horror");flm4.setfilmRating(6.0);flm4.setfilmDuration(100);
        flm1.nowPlaying();
        flm2.nowPlaying();
        flm3.nowPlaying();
        flm4.nowPlaying();
        
        
    }
    
}
