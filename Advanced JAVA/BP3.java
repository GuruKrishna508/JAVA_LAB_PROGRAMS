import java.util.Scanner;
class Father{
    int fage;
    Scanner in=new Scanner(System.in);
    Father(){
        System.out.println("Fathers age");
        fage=in.nextInt();
    }
}
class Son extends Father{
    int sage;
    Scanner in=new Scanner(System.in);
    Son(){
        System.out.println("sons age");
        sage=in.nextInt();
    }
    }
    class My_exception extends Exception{
        public My_exception(String str){
            System.out.println(str);
        }
    }
    public class BP3{
        public static void main(String args[]) throws My_exception{
            Son s=new Son();
            try{
                if(s.sage>=s.fage){
                    throw new My_exception("Exception:");
                }
                else{
                    System.out.println("Valid ");
                }
            }
            catch(My_exception e){
                System.out.println(e+" sons age is greater than father");
            }

        }
    }