public class Weapon
{
  String name;
  int atkdam;
  int cooldown;
  int currcool=0;
  int price;
  boolean isMagic;
  boolean isRanged;
  public Weapon(String n, int a, int c, int p)
  {
    name = n;
    atkdam = a;
    cooldown = c;
    price = p;
  }

}
