/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cameraprototype;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilihan;
        Scanner scanner = new Scanner(System.in);
        CameraCache.loadCache();
        
        System.out.println("Silahkan pilih Tipe Camera dengan memasukkan nomor : ");
        System.out.println("1. Analog");
        System.out.println("2. Instan");
        System.out.println("3. DSLR");
        System.out.print("Pilihan anda : ");
        pilihan = scanner.nextInt();
        while (pilihan < 1 || pilihan > 3) {
            System.out.println("Harap pilih nomor yang ada!");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. DSLR");
            System.out.print("Pilihan anda : ");
            pilihan = scanner.nextInt();
        }
        if (pilihan == 1){
            Camera clonedCamera = (Camera) CameraCache.getCamera("1");
            System.out.println("Model : " + clonedCamera.getType());
            System.out.println("Harga Sewa : " + clonedCamera.getHarga());
        }
        else if (pilihan == 2){
            Camera clonedCamera2 = (Camera) CameraCache.getCamera("2");
            System.out.println("Model : " + clonedCamera2.getType());
            System.out.println("Harga Sewa : " + clonedCamera2.getHarga());
        } else {
            Camera clonedCamera3 = (Camera) CameraCache.getCamera("3");
            System.out.println("Model : " + clonedCamera3.getType());
            System.out.println("Harga Sewa : " + clonedCamera3.getHarga());
        }
    }
    
}
