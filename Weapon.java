import java.util.*;
public class Weapon
{
  String name;
  int atkdam;
  double defMult;
  int cooldown;
  int currcool=0;
  int price;
  boolean isMagic;
  boolean isRanged;
  Status possEnemyStatus;
  double enemyStatusChance;//chance that enemy receives status, less than 1
  Status possSelfStatus;
  ArrayList<Role> allowedUsers = new ArrayList();
  public Weapon(String n, int a, double dM, int c, int p, boolean isM, boolean isR, Status statE, double statusChance, Status statS, Role[] roles)
  {
    name = n;
    atkdam = a;
    defMult=dM;
    cooldown = c;
    price = p;
    isMagic=isM;
    isRanged=isR;
    possEnemyStatus=statE;
    enemyStatusChance=statusChance;
    possSelfStatus=statS;
    for(int i = 0; i<roles.length;i++)
    {
      allowedUsers.add(roles[i]);
    }
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
      e.addStatus(new Status(possEnemyStatus.makeCopy())); 
     }
    }
    if(possSelfStatus!=null)
    {
      p.addStatus(new Status(possSelfStatus.makeCopy()));
    }
  }
  public Weapon makeCopy()
  {
    Role[] r = new Role[allowedUsers.size()];
    for(int i = 0; i<r.length;i++)
    {
      r[i]=allowedUsers.get(i);
    }
    return new Weapon(name, atkdam, defMult, cooldown, price, isMagic, isRanged, possEnemyStatus.makeCopy(), enemyStatusChance,possSelfStatus.makeCopy(),r);
  }
}
