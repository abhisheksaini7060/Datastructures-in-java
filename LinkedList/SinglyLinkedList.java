import java.util.Scanner ;
public class SinglyLinkedList
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
Node head = null ;

public void creation()
{
int data,n;
Scanner sc= new Scanner(System.in);
do
{
System.out.println("Enter the data");

data = sc.nextInt();
Node new_node = new Node(data);
if (head ==null)
{
head = new_node;

}

else
{
new_node.next = head;
head = next;
}
System.out.println("Press 1 to add data in node");
n = sc.nextInt();
}
while(n==1);

}

public void traverse()
{
Node temp = head;
if(head ==null)
{
System.out.println("Linked List does not exist");
}
else
{
While(temp!=null)
{
System.out.println(temp.data);
temp = temp.next;
};

}

}

public static void main(String[] args)
{
 
SinglyLinkedList list = new SinglyLinkedList();
list.creation();
list.traverse();

}


}