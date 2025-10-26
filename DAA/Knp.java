import java.util.*;

class kobject{
    float w;
    float p;
    float r;
}

public class Knp {
    static final int max=20;
    static int n;
    static float m;
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the number of objects");
        n=in.nextInt();
        kobject[] obj=new kobject[n];
        for(int i=0;i<n;i++)
        obj[i]=new kobject();
        readobj(obj);
        knapsack(obj);

    }
    static void readobj(kobject[] obj){
        float temp=0;
        System.out.println("enter the maximum capacity of the knapsack");
        m=in.nextFloat();
        System.out.println("Enter the weights");
        for(int i=0;i<n;i++)
        obj[i].w=in.nextFloat();
        System.out.println("enter the profits");
        for(int i=0;i<n;i++)
        obj[i].p=in.nextFloat();
        for(int i=0;i<n;i++)
        obj[i].r=obj[i].p/obj[i].w;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(obj[j].r<obj[j+1].r)
                temp=obj[j].r;
                obj[j].r=obj[j+1].r;
                obj[j+1].r=temp;
            }
        }
     
    }
    static void knapsack(kobject[] ob){
        float[] x=new float[max];
        float rc=m;
        float totalprofit=0;
        Arrays.fill(x,0);
        int i;
        for( i=0;i<n;i++){
            if(ob[i].w>rc)
            break;
            x[i]=1;
            totalprofit+=ob[i].p;
            rc-=ob[i].w;
        }
        if(i<n)
        x[i]=rc/ob[i].w;
        totalprofit+=ob[i].p*x[i];
        for(i=0;i<n;i++)
        {System.out.println(ob[i].w+" "+ob[i].p);}
        System.out.println("total profits="+totalprofit);
    }
}
