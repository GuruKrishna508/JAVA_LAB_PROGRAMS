public class ap3 {
    //method overloading
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        ap3 s=new ap3();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(40,50,60));
        
    }
    
}
