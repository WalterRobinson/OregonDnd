public class Status
{
String name;
int timeLimit;//how long will the status last, 0 to not do anything, -1 to last forever
int atkMult;//.5 for slow, 0 for frozen
int damOverTime;//damage per tick, 0 for no damage over time, negative for heal
int count=0;
int damageTime; //when the damage over time occurs, do mod to find when this happens

public Status(String n, int tL, int aM, int dOT, int dT)
{
name= n;
timeLimit=tL;
atkMult=aM;
damOverTime=dOT;
damageTime=dT;
}
public void tick(Person p);
  {
   count++;
   if(count%damageTime==0)
   {
     p.takeDamage(damOverTime);
   }
   if(count%timeLimit==0)
   {
     p.removeStatus(this);
   }
  }
}
public Status makeCopy()
{
 return new Status(name,timeLimit,atkMult,damOverTime,damageTime); 
}
