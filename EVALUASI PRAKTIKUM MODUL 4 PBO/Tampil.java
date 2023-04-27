package com.mycompany.tampil;

public class Tampil {

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.munculSuara();
        
        Hewan sapi = new Sapi();
        sapi.munculSuara();
        
        Hewan ayam = new Ayam();
        ayam.munculSuara();
    }
}
