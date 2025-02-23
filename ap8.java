class Emp{
    int id;
    String name,phone;
Emp(int id,String name,String phone){
    this.id=id;
    this.name=name;
    this.phone=phone;
    

}
public void disp(){
    System.out.println("ID:"+id);
    System.out.println("NAME:"+name);
    System.out.println("PHONE:"+phone);
    

}}
class Tester extends Emp{
    int pid;
    String pname;
    Tester(int id,String name,String phone,int pid,String pname){
        super(id, name, phone);
        this.pid=pid;
        this.pname=pname;
    }
    public void disp(){
        super.disp();
        System.out.println("Project ID:"+pid);
        System.out.println("Project name:"+pname);
    }
}
class Developer extends Emp{
  String proname;
  Developer(int id,String name,String phone,String proname){
    super(id,name,phone);
    this.proname=proname;
  }
  public void disp(){
    super.disp();
    System.out.println("Project name:"+proname);
  }
}
public class ap8 {
    public static void main(String[] args) {
  Tester t1=new Tester(1,"chiranthan","9108313854",600,"khhfk");
  Tester t2=new Tester(1,"chiranthan","9108313854",600,"khhfk");
Developer d1=new Developer(2,"Guru","9845899508","hkhkhdkh");
Developer d2=new Developer(2,"Guru","9845899508","hkhkhdkh");
t1.disp();
t2.disp();
d1.disp();
d2.disp();
}}
