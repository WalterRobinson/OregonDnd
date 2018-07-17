import java.util.*;
public class Person
{
String name;
int maxHealth;
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
Item ring2;

int stressLevel=0;
  
ArrayList<Status> effects = new ArrayList();
  
public Person(String n, Role ro, int h)
{
name = n;
r = ro;
maxHealth = h;
currHealth = maxHealth;
w = new Weapon("Fists", 5, 1.0 20, 0, false, false, null, 0.0, null,{Role.BARD,Role.CLERIC,Role.DRUID,Role.ENCHANTER,Role.MONK,Role.NECROMANCER,Role.NINJA,Role.PALADIN,Role.PIRATE,Role.RANGER,Role.ROGUE,Role.SHADOWKNIGHT,Role.SORCERER,Role.WARLOCK,Role.WARRIOR,Role.WIZARD});
}
public void tick(Person e)
{
  w.tick(this,e);
  for(int i = 0; i<effects.size();i++)
  {
    effects.get(i).tick(this);
  }
}
public Person makeCopy(){
  Person copy = new Person(name, r, h);
  copy.w=w.makeCopy();
  copy.headspot=headspot.makeCopy();
  copy.chestspot=chestspot.makeCopy();
  copy.handspot=handspot.makeCopy();
  copy.legspot=legspot.makeCopy();
  copy.footspot=footspot.makeCopy();
  copy.beltspot=beltspot.makeCopy();
  copy.ring1=ring1.makeCopy();
  copy.ring2=ring2.makeCopy();
  copy.Atk=Atk;
  copy.Def=Def;
  copy.Mtk=Mtk;
  copy.Mef=Mef;
  copy.stressLevel=stressLevel;
  for(int i = 0; i<effects.size();i++)
  {
    copy.effects.add(effects.get(i).makeCopy());
  }
  return copy;
}
public double getMultiplier()
{
  int mult = 1;
  for(int i = 0; i<effects.size;i++)
  {
   mult=mult*effects.get(i).atkMult; 
  }
  mult=mult*headspot.attackMult*beltspot.attackMult*ring1.attackMult*ring2.attackMult*footspot.attackMult*handspot.attackMult*chestspot.attackMult*legspot.attackMult;
  return mult;
}
public double getDefMultiplier()
{
  int mult = 1;
  mult=mult*w.defMult*headspot.defMult*beltspot.defMult*ring1.defMult*ring2.defMult*footspot.defMult*handspot.defMult*chestspot.defMult*legspot.defMult;
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
