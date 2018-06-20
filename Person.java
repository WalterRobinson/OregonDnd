import java.util.*;
public class Person
{
String name;
int maxHealth;
int currHealth;
int level=1;
int expNecessary=100;
int currExp=0;

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
  
Public Person(String n, Role ro, int h)
{
name = n;
r = ro;
maxHealth = h;
currHealth = maxHealth;
w = new Weapon("Fists", 5, 20, 0, false, false, null);
}
}
