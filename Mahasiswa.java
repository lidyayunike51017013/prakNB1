

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Mahasiswa extends Manusia {
    private double hasil;
    private String NIIM;
    
    void dataMahasiswa(String NIM, String Fakultas, String Jurusan){
        System.out.println("NIM :" +NIM);
        System.out.println("Fakultas :"+Fakultas);
        System.out.println("Jurusan:" +Jurusan);
        
        
    }
     
    void nilaiMahasiswa(double Tugas1, double Tugas2, double Tugas3, double UTS, double UAS){
        hasil = ((Tugas1+Tugas2+Tugas3)/3) * 0.4 + UTS *0.3 + UAS * 0.3;
        System.out.println("Nilai Akhir :" +hasil);
  
    }

    void identitas(String NIK, String Nama, String JenisKelamin, int Umur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void nialiMahasiwa(double Tugas1, double Tugas2, double Tugas3, double UTS, double UAS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}