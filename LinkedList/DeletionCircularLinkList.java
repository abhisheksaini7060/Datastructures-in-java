import java.util.Scanner;
class DeletionCircularLinkList
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

//node creation
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
new_node.next = head;
tail = new_node;
}
else
{
new_node.next = head;
head = new_node;
tail.next = head;
}
System.out.println("Press 1 to add new node");
n = sc.nextInt();
}
while(n==1);


}
// Deletion 
public void deletion()
{
int n;
Scanner sc = new Scanner(System.in);
do
{
Node temp = head;
Node ptr = temp.next;
int value;
System.out.println("press 1 to delete from beginning, 2 for end, 3 for specific position");
value = sc.nextInt();
switch(value)
{
case 1 :
head= temp.next;
tail.next = head;
break;

case 2:
while(ptr.next != head)
{
temp = ptr;
ptr = ptr.next;
}
tail = temp;
temp.next = head;

}
//
System.out.println("press 2 to delete another element");
 n =sc.nextInt();
}
while(n==2);
}


// traversing 
public void traverse()
{
if(head == null)
{
System.out.println("LinkedList is empty");
}
else
{
Node temp = head;
do
{
System.out.print(temp.data + "  ");
temp = temp.next;
}
while(temp!=head);
}
}



// main method
public static void main(String[] args)
{
 DeletionCircularLinkList list = new  DeletionCircularLinkList();
list.creation();
list.traverse();
list.deletion();
list.traverse();
}


}