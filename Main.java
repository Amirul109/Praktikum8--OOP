/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum8;

/**
 *
 * @author Amir
 */
public class Main {
    public static void main(String[] args) {
        Customer amirul = new Customer();
        amirul.nama = "Amirul Mu'minin";
        amirul.alamat = "Kebumen-Jawa Tengah";

        Order laptop = new Order();

        laptop.date = 16;
        laptop.status = "Baru";

        Payment baru = new Payment();

        baru.jumlah = 20000000;
    }
}
