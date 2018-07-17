import java.util.*;
public class Person
{
String name;
int maxHealth;
int currHealth;
int level=1;
int expNecessary=100;
int currExp=0;

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
public attack()
{
  
}
public addStatus(Status s){
 effects.add(s); 
}
public removeStatus(Status s){
  effects.remove(s);
}
}
