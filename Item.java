public class Item
{
String name;
int price;

double attackMult;
double defMult;
double stressMult;
  
ArmorType place;

public Item(String n, int p, ArmorType pos, double atkm, double defm, double strm)
{
  name = n;
  price = p;
  place = pos;
  attackMult = atkm;
  defMult = defm;
  stressMult = strm;
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
