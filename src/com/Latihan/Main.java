package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	//scanner
        Scanner input = new Scanner(System.in);

        //variabel
        int gol,kwh,bayar,total,tambahan;

        //mulai
        System.out.print("Golongan berapa (1-2)= ");
        gol = input.nextInt();
        System.out.print("Pemakaian Berapa kWh = ");
        kwh = input.nextInt();

        //kondisi
        if (gol == 1 && kwh >= 1000){
            bayar = kwh * 1000;
            tambahan = (int) ((double) bayar * 0.1);
            total = bayar + tambahan;
            System.out.println("Total tagihan anda + 10% = Rp" +total);
        }else if (gol == 1){
            bayar = kwh * 1000;
            System.out.println("Total tagihan anda = Rp" +bayar);
        }else if (gol == 2 && kwh >= 1000){
            bayar = kwh * 2000;
            tambahan = (int) ((double) bayar * 0.1);
            total = bayar + tambahan;
            System.out.println("Total tagihan anda + 10% = Rp" +total);
        }else if(gol == 2){
            bayar = kwh * 2000;
            System.out.println("Total tagihan anda = Rp" +bayar);
        }
    }
}
