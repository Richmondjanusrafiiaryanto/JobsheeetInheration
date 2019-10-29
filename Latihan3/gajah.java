package Latihan3;

public class gajah extends Hewan
{
  public static void testClassMethod()
  {
    System.out.println("the class method in hewan");
  }
  //meng-override method pada class animal
  public void testInstanceMethod()
  {
    System.out.println("the instance method in gajah");
  }
  public static void main (String [] args)
  {
    gajah mygajah = new gajah();
    Hewan myHewan = mygajah; 
    Hewan.testClassMethod();
    myHewan.testInstanceMethod();
  }
}
