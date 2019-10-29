package Latihan2;

public class Person {
  private String nama;
  private int usia; 

 //konstruktor
 public Person (String nama, int usia)
 {
   this.nama = nama;
   this.usia = usia;
 }
 //method
 public void info ()
 {
   System.out.println("nama:"+this.nama);
   System.out.println("usia:"+this.usia);
 }
}
