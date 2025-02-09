import java.util.Scanner;
public class primegen{
    public boolean isprime(int num){
        int i;
        boolean prime=true;
        for(i=2;i<=num/2;i++){
            if(num%i==0)
            {prime=false;
            break;}
        }
        if(prime)
        return true;
        else
        return false;

    }
    public static void main(String args[]){
        int n,i;
        primegen s=new primegen();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        n=obj.nextInt();
        for(i=2;i<=n;i++){
            if(s.isprime(i))
            {System.out.println(i);}
        }
        obj.close();
    }

}