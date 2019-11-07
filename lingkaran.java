/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.io.*;
public class lingkaran {
  private double radius;
  public lingkaran (double radius){
      this.radius=radius;
  }
  public void Luas(){
      double luas= 3.14*radius*radius;
      System.out.println("Luas lingkaran : "+luas);
  }
  public void Keliling(){
      double keliling= 2.0*3.14*radius;
      System.out.println("Keliling Lingkaran: "+keliling);
  }
  public static void main(String[] args)throws Exception{
      DataInputStream dis= new DataInputStream(System.in);
      System.out.print("input radius: ");
      String input= dis.readLine();
      double i= Double.parseDouble(input);
      lingkaran A= new lingkaran(i);
      A.Luas();
      A.Keliling();
  }
    }

