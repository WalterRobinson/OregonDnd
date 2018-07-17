import java.util.*;
public class Person
{
String name;
int maxHealth;
int currHealth;
int level=1;
int expNecessary=100;
int currExp=0;
boolean isAlive=true;

int Atk=10;
int Mtk=10;
int Def=10;
int Mef=10;

Role r;
Weapon w;
Item headspot;
Item chestspot;
Item handspot;
Item legspot;
Item footspot;
Item beltspot;
Item ring1;
Item ring2

int stressLevel=0;
  
ArrayList<Status> effects = new ArrayList();
  
public Person(String n, Role ro, int h)
{
name = n;
r = ro;
maxHealth = h;
currHealth = maxHealth;
w = new Weapon("Fists", 5, 20, 0, false, false, null);
}
public void tick(Person e)
{
  w.tick(this,e);
  for(int i = 0; i<effects.size();i++)
  {
    effects.get(i).tick(this);
  }
}
public double getMultiplier()
{
  int mult = 1;
  for(int i = 0; i<effects.size;i++)
  {
   mult=mult*effects.get(i).atkMult; 
  }
  return mult;
}
public void addStatus(Status s){
 effects.add(s); 
}
public void removeStatus(Status s){
  effects.remove(s);
}
public void takeDamage(int dam){
  currHealth=currHealth-dam;
  if(currHealth>maxHealth)
  {
   currHealth=maxHealth; 
  }
  if(currHealth<=0)
  {
    isAlive=false;
  }
}
}
