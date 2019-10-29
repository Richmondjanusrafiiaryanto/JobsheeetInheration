package Latihan4;

public class B extends A
{
  private int b; 
  public void setB (int nilai)
  {
    b=nilai;
  }
  public int getB()
  {
    return b;
  }
  //melakukan override terhadap method tampilkan nilai ()
  //yang terdapat pada kelas A
  
  public void tampilkanNilai()
  {
    super.tampilkanNilai();//memanggil method dalam kelas A
    System.out.println("nilai b :"+getB());
  }
}
