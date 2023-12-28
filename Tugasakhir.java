package com.mycompany.tugasakhir;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Tugasakhir {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("          SELAMAT DATANG  ");
        System.out.println("         TOKO BUKU ALFIAN  ");
        System.out.println("  JL. PAHLAWAN NO. 2, SURABAYA");
        System.out.println("----------------------------------");
        LocalDate currentDate = LocalDate.now();
        System.out.print("Tgl: " + currentDate);
        System.out.print("    ");
        LocalTime currentTime = LocalTime.now();
        int jam = currentTime.getHour();
        int menit = currentTime.getMinute();
        int detik = currentTime.getSecond();
        System.out.printf("Waktu: %02d:%02d:%02d%n", jam, menit, detik);
        System.out.println("==================================");
        int pilih;
        System.out.println("---------------MENU---------------");
        System.out.println("1. Pembelian");
        System.out.println("2. Pendaftaran Member");
        System.out.println("3. Peminjaman");
        System.out.println("4. Pengembalian");
        System.out.println("5. Selesai");
        System.out.print("Pilih = ");
        pilih = s.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("1. Bumi                 75.190");
                System.out.println("2. Bulan                72.270");
                System.out.println("3. Matahari             72.270");
                System.out.println("4. Bintang              72.270");
                System.out.println("5. Ceroz dan Batozar    72.270");
                System.out.println("6. Komet                72.270");
                System.out.println("7. Komet Minor          76.650");
                System.out.println("8. Selena               72.270");
                System.out.println("9. Nebula               72.270");
                System.out.println("10. Siputih             72.270");
                System.out.println("11. Lumpu               72.270");
                System.out.println("12. Bibi Gill           72.270");
                System.out.println("13. Sagaras             72.270");
                System.out.println("14. Matahari Minor      72.270");
                System.out.print("Silahkan Mau Beli yang Mana = ");
                pilih = s.nextInt();
                System.out.println("--Terimakasih telah membeli--");
                break;
            default:
                System.out.println("Maaf tidak ada menu tersebut");
            case 2:
                String member[][] = new String[5][10];
                int baris = 0,
                 kolom = 0;
                System.out.println("\n Membership");
                System.out.println("1. Pendaftaran member");
                System.out.println("2. Pencarian member");
                switch (pilih) {
                    case 1:
                        String nama;
                        int i,
                         j = 0;
                        boolean ketemu = false;
                        System.out.print("Nama Anda = ");
                        nama = s.next();
                        System.out.println("Cari nomor...");
                        for (i = 0; i < 5; i++) {
                            baris = i;
                            for (j = 0; j < 10; j++) {
                                kolom = j;
                                if (member[i][j] != null) {

                                    ketemu = true;
                                    break;
                                }break;

                            }
                            if (ketemu) {
                                break;
                            }

                        }
                        if (i == 5 && j == 10) {
                            System.out.println("Membership penuh");
                        } else {
                            member[baris][kolom] = nama;
                            System.out.println(baris + "-" + kolom);
                        }
                        break;

                    case 2:
                        ketemu = false;

                        System.out.print("Cari nama = ");
                        nama = s.next();
                        System.out.println("Tunggu Sebentar...");
                        for (i = 0; i < 5; i++) {
                            baris = i;
                            for (j = 0; j < 10; j++) {
                                kolom = j;
                                if (member[i][j] != null && member[i][j].equals(nama)) {
                                    ketemu = true;
                                    break;
                                }

                            
                        }
                        if (ketemu) {
                            break;
                        }
                }
                if (i == 5) {
                    System.out.println("Nama tidak ada");
                } else {
                    System.out.println("Ada di " + baris + "-" + kolom);
                }
                break;

        }break;
    
    case 3:
                System.out.println("Apakah anda Anggota?");
                System.out.println("1. Ya");
                System.out.println("2. Bukan");
                System.out.print("Jawab = ");
                int anggota = s.nextByte();
                System.out.print("Biayanya?");
            switch (anggota) {
                case 1:
                    System.out.println("Gratis");
                    break;
                case 2:
                    System.out.println("Rp. 10.000");
                    break;
                default:
                    System.out.println("Ups....");
                    break;
            }
                break;
            case 4:
                System.out.println("Terlambat?");
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
                System.out.print("Jawab = ");
                int terlambat = s.nextByte();
                if(terlambat==1){
                    System.out.println("Anggota");
                    System.out.println("1 = Iya");
                    System.out.println("2 = Tidak");
                    System.out.print("Jawab = ");
                    int anggota2 = s.nextByte();
                    System.out.print("Kena denda ");
                    if(anggota2==1){
                        System.out.println("1.000/hari");
                    }else if(anggota2==2){
                        System.out.println("2.000/hari");
                    }
                }else if(terlambat==2){
                    System.out.println("Terimakasih");
                }
                break;

        }while(pilih

!=3);
    }
}
