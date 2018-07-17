import java.util.*;
public class Encounter
{
    String text;
    ArrayList<String> options=new ArrayList();
    ArrayList<Integer> damage = new ArrayList();// damage, stress, and payout all are the same length as options, and correspond to each option.
    ArrayList<Integer> stress=new ArrayList();
    ArrayList<Object> payout=new ArrayList();//could be weapons, armor, or even new people
    ArrayList<Integer> money=new ArrayList();//so if buying, selling, or finding money
    
    public Encounter(String t, String[] o, int[] d, int[] s, Object[] p, int[] m)
    {
        text=t;
        for(int i = 0; i<o.length;i++)
        {
            options.add(o[i]);
            damage.add(d[i]);
            stress.add(s[i]);
            payout.add(p[i].makeCopy());
            money.add(m[i]);
        }
        
    }

}
