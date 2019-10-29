package Latihan2;

public class Employ extends Person{

  private String noKaryawan;
  //Konstruktor
  public Employ (String noKaryawan, String nama, int usia)
  {
    super(nama, usia);
    this.noKaryawan = noKaryawan; 
  }
  //method
  public void info()
  {
    System.out.println("no. Karyawan : "+this. noKaryawan);
    super.info();
  }
}//Akhir kelas employ


