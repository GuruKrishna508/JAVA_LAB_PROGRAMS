package Advanced java;
class Book{
   String name,author,price,pages;
   void setter(String name,String author,String price,String pages){
    this.name=name;
    this.author=author;
    this.price=price;
    this.pages=pages;
   }
   String getter(){
    return "name:"+name+" author:"+author+" price:"+price+" pages:"+pages;

   }

}
public class BP2 {
    public static void main(String [] args){
        Book[] book=new Book[2];
        book[0]=new Book();
        book[0].setter("Divine comedy","Dante Algeri","160","60");
        System.out.println(book[0].getter().toString());
        book[1]=new Book();
        book[1].setter("Divine comedy","Dante Algeri","160","60");
        System.out.println(book[1].getter().toString());
      


    }
    
}
