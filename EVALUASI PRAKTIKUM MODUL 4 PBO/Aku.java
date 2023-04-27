package com.mycompany.aku;

public class Aku {

    public static void main(String[] args) {
        user fifit = new user();
        
//menggunakan method setter
fifit.setUsername("fifit");
fifit.setPassword("kopiJava");

//menggunakan method getter
System.out.println("Username: " + fifit.getUsername());
System.out.println("Password: " + fifit.getPassword());
    }
}
