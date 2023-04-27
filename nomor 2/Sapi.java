/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tampil;

class Sapi extends Hewan {
    //Menggunakan method dari kelas induk abstrak
    @Override
    protected void munculSuara(){
        System.out.println("Suara Sapi: Moo...moo...moo");
    }
}
