import java.util.Scanner;
class CircularLinkedlist
{
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
Node head = null;
Node tail = null;

// linkedlist creation
public void creation()
{
Scanner sc = new Scanner(System.in);
int data,n;
do
{
System.out.println("Enter the data");
data = sc.nextInt();
Node new_node = new Node(data);

if(head == null)
{
head = new_node;
tail = new_node;
new_node.next = head;
}

else
{
new_node.next = head;
head = new_node;
tail.next = head;
}
System.out.println("Do you want to enter new node press 1");
n = sc.nextInt();
}
while(n==1);

}


// traversing
public void traversing()
{
Node temp = head;
//System.out.println(temp.data);
if(head == null)
{
System.out.println("LinkedList is empty");
}
else
{
do
{
System.out.println(temp.data +" ");
temp = temp.next;
}
while(temp!= head);
}
}
public static void main(String[] args)
{
CircularLinkedlist list = new CircularLinkedlist();
list.creation();
list.traversing();
}



}