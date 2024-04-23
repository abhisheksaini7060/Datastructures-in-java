import java.util.Scanner;

class Insertion 
{
 // Node class
static class Node
{
 int data;
Node next;
Node(int data)
{
this.data = data;
this.next = null;
}
}
//Node completed

// head creation
Node head = null ;
 // head completed with null 

// node creation and send data
public void creation()
{
Scanner sc = new Scanner(System.in);
int data,n;
do{
System.out.println("Enter Data");
data = sc.nextInt();
Node new_node = new Node(data);
// Node creation complete

// conditions 
if(head == null)
{
head = new_node;
}

else
{
    int insert_value;
  System.out.println("Enter 1 for insertion at beggining");
  System.out.println("--------------------------------------------------------------------------------------");
  System.out.println("Enter 2 for insertion at Ending");
  System.out.println("--------------------------------------------------------------------------------------");
  insert_value = sc.nextInt();

 // Switch case for insert_value handle

switch(insert_value)
{
  case 1 :
  new_node.next = head;
  head = new_node;
  System.out.println("");
  System.out.println("--------------------------------------------------------------------------------------");
  System.out.println("----------Insertion is Succesfull at beggining----------");
  System.out.println("--------------------------------------------------------------------------------------");
 break; 

case 2 :
Node temp = head ;
while(temp.next!=null)
{
temp = temp.next;
}
 temp.next = new_node;
 System.out.println("");
 System.out.println("--------------------------------------------------------------------------------------");
 System.out.println("----------Insertion is Succesfull at Ending----------");
 System.out.println("--------------------------------------------------------------------------------------");
 break;

case 3 :
System.out.println("Hello i am in case 3");
break;

default :
System.out.println("Enter the right value");

}


}
System.out.println("--------------------------------------------------------------------------------------");
System.out.println("Do you want to add new element press 1");
System.out.println("--------------------------------------------------------------------------------------");
n = sc.nextInt();

// do closing
}
while(n ==1);



// creation closing
}


public void traversing()
{
 Node temp1 = head;
System.out.println("--------------------------------------------------------------------------------------");
 while(temp1!= null)
{
System.out.print(temp1.data + " ");
temp1 = temp1.next;
}
System.out.println("--------------------------------------------------------------------------------------");
//traversing ending

}


// main method
public static void main(String[] args)
{
Insertion list = new Insertion();
list.creation();
list.traversing();
}






}