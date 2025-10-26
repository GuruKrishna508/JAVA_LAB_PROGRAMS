class Node{
    int data;
    Node next;
   
     Node insert_front(Node first){
        Node temp=new Node();
        temp.data=1;
        if(first==null){
            first=temp;
        }
       else{
        temp.next=first;
        first=temp;
       }
       return first;

    }
     Node insert_rear(Node first){
        Node temp=new Node();
        temp.data=1;
        if(first==null)
       { first=temp;}
       else{
        Node cur=first;
        while(cur.next!=null)
        {
            cur=cur.next;
        }
        cur.next=temp;
       }
      return first;
    }

 Node delete_front(Node first){
  
    if(first.next==null)
    { first=null;}
    else{
        Node cur=first;
        first=first.next;
        cur=null;
    }
    return first;
}
 Node delete_rear(Node first){
    if(first.next==null)
    { first=null;}
    else{
        Node cur=first;
        Node prev=new Node();
        while(cur.next!=null){
            prev=cur;
            cur=cur.next;

        }
        prev.next=null;
        cur=null;

    }
    return first;
}
 void display(Node first){
    Node cur;
    if(first==null){
        System.out.println("NO elements are there");

    }
    else{
        cur=first;
        while(cur!=null){
            System.out.print(cur.data+" -> ");
            cur=cur.next;
        }
    }
}
}


public class Sll {
    public static void main(String[] args) {
        Node first=new Node();
        first=first.insert_front(first);
        first=first.insert_front(first);
        first=first.insert_front(first);
        first=first.insert_rear(first);
        first.display(first);
    }
    
    
    
}
