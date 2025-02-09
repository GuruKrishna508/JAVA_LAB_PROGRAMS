class box{
    double width,height,depth;
    box(){
        width=222;
        height=333;
        depth=444;
    }
    box(double width,double height,double depth){
         this.width=width;
         this.height=height;
         this.depth=depth;
    }
    double volume(){
        return width*height*depth;
    }


}
public class ap2 {
    public static void main(String args[]){
        box box1=new box();
        System.out.println("Width-->"+box1.width);
        System.out.println("Depth-->"+box1.depth);
        System.out.println("Height-->"+box1.height);
        System.out.println("Volume-->"+box1.volume());
        box box2=new box(22.2,33.3,44.4);
        System.out.println("Width-->"+box2.width);
        System.out.println("Depth-->"+box2.depth);
        System.out.println("Height-->"+box2.height);
        System.out.println("Volume-->"+box2.volume());

    }
    
}
