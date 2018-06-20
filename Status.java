public class Status
{
String name;
int timeLimit;//how long will the status last
int atkMult;//.5 for slow, 0 for frozen
int damOverTime;
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
}
