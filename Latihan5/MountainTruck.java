package Latihann5;

public class MountainTruck extends Truck{
//the mountaintruck subclass adds one field
public int seatHeight;
//the mountaintruck subclass has one cunstructor
public MountainTruck (int startHeight, int startCadence,int startSpeed,int startGear)
{
  super (startCadence, startSpeed, startGear);
  seatHeight = startHeight;
}
//the maountaintruck sub class adds one method 
public void setHeight(int newValue)
{
  seatHeight = newValue;
}
public void main (String [] args)
{
  System.out.println("mulai berjalan");
  MountainTruck MB = new MountainTruck(0,0,0,0);
  System.out.println("gear="+MB.gear);
  System.out.println("speed="+MB.speed);
  MB.setGear(2);
  MB.speedUp(2);
  System.out.println("gear="+MB.gear);
  System.out.println("speed="+MB.gear);
  MB.speedUp(2);
  System.out.println("gear="+MB.gear);
  System.out.println("speed"+MB.speed);
}
}
