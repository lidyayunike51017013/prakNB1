/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
 class A {
     int x;
     int y;
     public void setX(int x){
         this.x =x;
         
           public void setY(int y){
         this.y =y;          
         }
           public void getNilai(){
               System.out.println("nilai x:"+ x +" nilai y:" + y);
               {
                   A ortu = new A ();
                   B anak = new B ();
                   System.out.println("superclass");
                   ortu.setX(10);
                   ortu.setY(20); ortu.getNilai();
                   System.out.println("sub Class");
                   anak.setX(5);
                   anak.setY(4);
                   anak.getNilai();
                   anak.setZ(50);
                   anak.getJumlah();
               }
           }
     }
    
