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
 import java.sql.Date;

public class Order {
    int date;
    String status;
    
    public void cetakInfo() {
        System.out.println("Tanggal     :" + this.date);
        System.out.println("Status     :" + this.status);
    }
}   

