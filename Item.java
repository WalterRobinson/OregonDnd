public class Item
{
String name;
int price;

double attackMult;
double defMult;
double stressMult;
  
int enemyDam;
int selfDam;//negative for healing
  
ArmorType place;

public Item(String n, int p, ArmorType pos, double atkm, double defm, double strm, int eDam, int sDam)
{
  name = n;
  price = p;
  place = pos;
  attackMult = atkm;
  defMult = defm;
  stressMult = strm;
  enemyDam=eDam;
  selfDam=sDam;
}
  
public Item makeCopy()
{
  return new Item(name,price,place,attackMult,defMult,stressMult,enemyDam,selfDam);
}
//public double beforeAttack(){
 //return attackMult; 
//}
public void afterAttack();
//public double beforeDefend(){
 //return defMult; 
//}
public void afterDefend();
public double gainingStress(){
 return stressMult; 
}
  
}
