package Latihan5;

public class Truck {
//the truck class has three field
public int cadence;
public int gear;
public int speed;
//the truck clasa has one cunstructor
public Truck (int startCadence, int startSpeed, int startGear)
{
  gear = startGear;
  cadence = startCadence;
  speed = startSpeed; 
}
//the truck class has four method 
public void setCadence(int newValue) 
{
  cadence = newValue; 
}
public void setGear(int newValue)
{
  gear = newValue;
}
public void applybrake (int decrement)
{
  speed = decrement;
}
public void speedUp(int increment)
{
  speed = increment;
}
}
