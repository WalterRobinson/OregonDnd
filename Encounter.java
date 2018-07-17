import java.util.*;
public class Encounter
{
    String text;
    ArrayList<String> options=new ArrayList();
    ArrayList<Integer> damage = new ArrayList();// damage, stress, and payout all are the same length as options, and correspond to each option.
    ArrayList<Integer> stress=new ArrayList();
    ArrayList<Object> payout=new ArrayList();//could be weapons, armor, or even new people
    ArrayList<Integer> money=new ArrayList();//so if buying, selling, or finding money, positive number means money gain, make sure if money is negative and more than player has, put a rejection message
    ArrayList<int[]> statChange=new ArrayList();//order is Atk,Mtk,Def,Mef. positive number means stat increase
    ArrayList<Encounter> followingEncounters = new ArrayList();
    
    public Encounter(String t, String[] o, int[] d, int[] s, Object[] p, int[] m, int[][] stats, ArrayList<Encounter> fE)
    {
        text=t;
        for(int i = 0; i<o.length;i++)
        {
            options.add(o[i]);
            damage.add(d[i]);
            stress.add(s[i]);
            payout.add(p[i].makeCopy());
            money.add(m[i]);
            statChange.add(stats[i]);
            followingEncounters.add(fE.get(i));
        }
        
    }

}
