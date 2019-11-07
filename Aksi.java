/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Aksi {
    public static void main(String args[]){
        String NIK,Nama,JenisKelamin;
        int Umur;
        String NIM,Fakultas,Jurusan;
        double Tugas1,Tugas2,Tugas3;
        double UTS = 0, UAS = 0;
        double hasil;
        
       Mahasiswa MHS = new Mahasiswa();
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Masukkan NIK : ");
        NIK = SC.nextLine();
        System.out.println("Masukkan Nama Anda : ");
        Nama = SC.nextLine();
        System.out.println("Masukkan Jenis Kelamin : ");
        JenisKelamin = SC.nextLine();
        System.out.println("Masukkan Umur : ");
        Umur = SC.nextInt();
        SC.nextLine();
        System.out.println("Masukkan NIM :");
        NIM = SC.nextLine();
        System.out.println("Masukkan Fakultas :");
        Fakultas = SC.nextLine();
        System.out.println("Masukkan Jurusan :");
        Jurusan = SC.nextLine();
        
        System.out.println("Masukkan TGS1");
        Tugas1 = SC.nextDouble();
        System.out.println("Masukkan TGS2");
        Tugas2 = SC.nextDouble();
        System.out.println("Masukkan TGS3");
        Tugas3 = SC.nextDouble();
        
        MHS.identitas(NIK, Nama, JenisKelamin, Umur);
        MHS.dataMahasiswa(NIM, Fakultas, Jurusan);
        MHS.nialiMahasiwa(Tugas1, Tugas2, Tugas3, UTS, UAS);
                
    }
}
  