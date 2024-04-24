import java.util.Scanner;
class Deletion 
{
// Node Structure class 
static class Node
{
int data ;
Node next;
Node(int data)
{
this.data = data;
this.next = null;
}
}
// Node structure Complete
Node head = null;

// node creation
public void creation()
{

Scanner sc = new Scanner(System.in);
int data,n;
do
{
System.out.println("----------------------------------");
System.out.println("Enter the data");
System.out.println("----------------------------------");
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
//do loop
System.out.println("----------------------------------");
System.out.println("Press 1 to add node in linkedlist");
System.out.println("----------------------------------");
n =sc.nextInt();
}
while(n==1);
//node
}


public void traverseList()
{
if(head == null)
{
System.out.println("----------------------------------");
System.out.println("Linkedlist is empty");
System.out.println("----------------------------------");
}
else
{
Node temp = head;
System.out.println("----------------------------------");
while(temp!=null)
{
System.out.print(temp.data + " " );
temp = temp.next;
}
System.out.println();
System.out.println("----------------------------------");
}

}

public void deletion()
{
// deletion from beggining
Scanner sc = new Scanner(System.in);

int n;
do
{
if(head == null)
{System.out.println("----------------------------------");
System.out.println("LinkedlIst is empty nothing to delete");
System.out.println("----------------------------------");
}
else
{
int case_value;
System.out.println("-------------------------------------------------------------------");
System.out.println("Prees 1  to delete from beggining, 2 for End, 3 for any specific point");
System.out.println("-------------------------------------------------------------------");

case_value = sc.nextInt();
switch(case_value)
{
case 1:
Node temp = head;
head = temp.next;
break;

case 2 :
temp =head;
Node ptr = temp.next;
while(ptr.next!=null)
{
temp = ptr;
ptr = ptr.next;
}
temp.next = null;
break;

case 3:
int s_point;
System.out.println("-------------------------------------------------------------------");
System.out.println("Enter the position you want to delete");
System.out.println("-------------------------------------------------------------------");
s_point = sc.nextInt();
temp = head;
ptr= temp.next;
for(int i =0 ;i<s_point/2 ;i++)
{
 temp = ptr;
 ptr = ptr.next;
}
temp.next = ptr.next;
break;


default:
System.out.println("-------------------------------------------------------------------");
System.out.println("Value is incorrect");
System.out.println("-------------------------------------------------------------------");
break;


}


}
System.out.println("-------------------------------------------------------------------");
System.out.println("Do you want to delete another node press 2 ");
System.out.println("-------------------------------------------------------------------");
n = sc.nextInt();
//do while
}
while(n==2);

}



//main method
public static void main(String[] args)
{
Deletion list = new Deletion();
list.creation();
list.traverseList();
list.deletion();
list.traverseList();

}


}