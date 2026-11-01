package Tugas2Algoritma;

import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double persenLembur;
        double gajiLembur;
        double totalPenghasilan;

        //Input data karyawan
        System.out.print("Masukan golongan karyawan (A/B/C): ");
        golongan = input.next().toUpperCase();

        System.out.print("Masukan jumlah jam lembur: ");
        jamLembur = input.nextInt();

        //Menentukan gaji pokok
        switch(golongan){
            case "A":
                gajiPokok = 5000000;
                break;
            
             case "B":
                gajiPokok = 6500000;

             case "C":
                gajiPokok = 9000000;
                break;
            
            default:
                System.out.println("Golongan tidak valid");
                input.close();
                return;
        }

        //Menentukan persentase lembur
        if (jamLembur == 1){
            persenLembur = 0.30;
        }
        else if (jamLembur == 2){
            persenLembur = 0.32;
        }
        else if (jamLembur == 3){
            persenLembur = 0.34;
        }
        else if (jamLembur == 4){
            persenLembur = 0.36;
        }
        else if (jamLembur >=5){
            persenLembur = 0.38;
        }
        else {
            persenLembur = 0;
        }

        //Menghitung gaji lembur
        gajiLembur = gajiPokok * persenLembur;

        //Menghitung total penghasilan
        totalPenghasilan = gajiPokok + gajiLembur;

        //Hasil Output
        System.out.println("======Hasil perhitungan gaji======");
        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
        System.out.println("Gaji Lembur: Rp. " + gajiLembur);
        System.out.println("Total Penghasilan: Rp. " + totalPenghasilan);

        input.close();
 
    }
}