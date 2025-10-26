class Collegename extends Thread{
    public void run(){
        while(true){
        System.out.println("Vidya vardhaka college of Engineering");
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }}
}
class Deptname extends Thread{
    public void run(){
        while(true){
        System.out.println("Computer Science Department");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }}
}



public class BP4 {
    public static void main(String[] args) {
        Collegename clg=new Collegename();
        Deptname dpt=new Deptname();
        clg.start();
        dpt.start();
        
    }
    
}
