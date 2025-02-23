 import java.util.Scanner;
 import java.util.Arrays;
 class Emp{
    int id;
    String name,phone,place,dept;
Emp(int id,String name,String phone,String place,String dept){
    this.id=id;
    this.name=name;
    this.phone=phone;
    this.place=place;
    this.dept=dept;

}
public void disp(){
    System.out.println("ID:"+id);
    System.out.println("NAME:"+name);
    System.out.println("PHONE:"+phone);
    System.out.println("PLACE:"+place);
    System.out.println("DEPARTMENT:"+dept);

}}



public class ap7 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("ENter the number of elemenmts:");
        n=in.nextInt();
        Emp[] arr=new Emp[n];
        for(int i=0;i<n;i++){
            System.out.println(".......................");
            System.out.print("Enter your id ");
            int id=in.nextInt();
            in.nextLine();
            System.out.print("Enter your Name ");
            String name=in.nextLine();
            System.out.print("Enter your place ");
            String place=in.nextLine();
            System.out.print("Enter your phone ");
            String phone=in.nextLine();
            System.out.print("Enter your department ");
            String dept=in.nextLine();
            System.out.println(".......................");
            arr[i]=new Emp(id,name,place,phone,dept);
    
        }
        for(Emp e:arr){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            e.disp();
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        }

    }
}
