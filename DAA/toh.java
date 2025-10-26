
public class toh {
     void tower(int n,char s,char d,char t){
        if(n==1){
           System.out.println("move from "+s+" to "+d); 
        }
        else{
            tower(n-1,s,d,t);
            System.out.println("move "+s+" to "+d);
            tower(n-1,t,s,d);
        }
    }
    public static void main(String[] args) {
        toh obj=new toh();
       obj.tower(3,'s','t','d');
    }
}