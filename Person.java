import java.util.*;
public class Person
{
String name;
int maxHealth;
int currHealth;

Role r;
Weapon w;
ArrayList<Item> inventory = new ArrayList();

Public Person(String n, Role ro, int h)
{
name = n;
r = ro;
maxHealth = h;
currHealth = maxHealth;
}
}
