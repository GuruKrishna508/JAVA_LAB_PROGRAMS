enum Session{
    MONDAY,TUESDAY,WEDNESDAY;
}
public class prac {
    public static void main(String[] args)  {
     Session[] s=Session.values();
     for(Session e:s){System.err.println(e);}
     Session d=Session.valueOf("MONDAY");
     int ord=d.ordinal();
     System.out.println(d+" "+ord);

    }
}
