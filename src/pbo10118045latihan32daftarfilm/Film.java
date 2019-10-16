/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan32daftarfilm;

/**
 *
 * @author Ilham
 */
public class Film {
    private String filmName,filmGenre;
    private double filmRating;
    private int filmDuration;

    public String getfilmName() {
        return filmName;
    }

    public void setfilmName(String filmName) {
        this.filmName = filmName;
    }
    
    public String getfilmGenre() {
        return filmGenre;
    }

    public void setfilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public double getfilmRating() {
        return filmRating;
    }

    public void setfilmRating(double filmRating) {
        this.filmRating = filmRating;
    }

    public int getfilmDuration() {
        return filmDuration;
    }

    public void setfilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }
    
    
    public void nowPlaying(){
        System.out.println("");
        System.out.println("Judul Film : " +filmName);
        System.out.println("Genre Film : " +filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " +filmDuration+ " Menit");
    }

    
}
