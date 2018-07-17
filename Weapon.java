public class Weapon
{
  String name;
  int atkdam;
  int cooldown;
  int currcool=0;
  int price;
  boolean isMagic;
  boolean isRanged;
  Status possEnemyStatus;
  double enemyStatusChance;//chance that enemy receives status, less than 1
  Status possSelfStatus;
  public Weapon(String n, int a, int c, int p, boolean isM, boolean isR, Status statE, double statusChance, Status statS)
  {
    name = n;
    atkdam = a;
    cooldown = c;
    price = p;
    isMagic=isM;
    isRanged=isR;
    possEnemyStatus=statE;
    enemyStatusChance=statusChance;
    possSelfStatus=statS;
  }
  public void tick(Person p, Person e)
  {
    currcool++;
    if(currcool==cooldown)
    {
      currcool=0;
      Attack(p,e);
    }
  }
  public void Attack(Person p, Person e)
  {
    double multiplier = p.getMultiplier();
    double defMultiplier = e.getDefMultiplier();
    if(isMagic)
    {
      e.takeDamage( (int)( ( ( (double)(30+p.Mtk) )/(30+e.Mef) )*atkdam*multiplier ) +1 ) 
    }
    else
    {
      e.takeDamage( (int)( ( ( (double)(30+p.Atk) )/(30+e.Def) )*atkdam*multiplier/defMultiplier ) +1 )
    }
    if(possEnemyStatus!=null){
     if(Math.random()<enemyStatusChance)
     {
      e.addStatus(new Status(possEnemyStatus.name, possEnemyStatus.timeLimit , possEnemyStatus.atkMult , possEnemyStatus.damOverTime , possEnemyStatus.damageTime )); 
     }
    }
    if(possSelfStatus!=null)
    {
    p.addStatus(new Status(possSelfStatus.name, possSelfStatus.timeLimit , possSelfStatus.atkMult , possSelfStatus.damOverTime , possSelfStatus.damageTime));
    }
  }
}
