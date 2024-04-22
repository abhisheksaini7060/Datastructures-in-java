import java.util.Scanner;
class SinglyLinkedList1 
{
static class Node
{
int data;
Node next;

Node(int data)
{
this.data = data ;
this.next = null;
}
}

Node head = null;

public void creation()
{
int data,n;
Scanner sc = new Scanner(System.in);
do
{
System.out.println("Enter the data");
data = sc.nextInt();
Node new_node = new Node(data);
if(head == null)
{
head = new_node;
}
else
{
new_node.next = head;
head = new_node;
}
System.out.println("Doyou want to add new data press 1");
n = sc.nextInt();
}
while(n==1);

}

public void traversing()
{
Node temp = head;
if(temp ==null)
{
System.out.println("LinkedList is empty");
}
else
{
while(temp!= null)
{
System.out.println(temp.data);
temp = temp.next;
}
}


}




public static void  main(String[] args)
{

SinglyLinkedList1  list = new SinglyLinkedList1();
list.creation();
list.traversing();

}



}