import java.util.Scanner;
class Insertionarray 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int a;
System.out.println("Enter the length of array");
a = sc.nextInt();
int array[] = new int[a];
System.out.println("Enter the elements of array");
for(int i=0;i<a;i++)
{
array[i] = sc.nextInt();
}

System.out.println("Enter the index value you want to insert the element");
int index = sc.nextInt();
System.out.println("Enter the value you want to insert in array");
int value = sc.nextInt();
int arraydup[] = new int[a+1];  
for(int j =0 ;j<a+1;j++)
{
if(j<index)
{
arraydup[j] = array[j];
}
else if(j==index)
{
arraydup[j]= value;
}
else
{
arraydup[j] = array[j-1];
}


}
System.out.println("After the insertion the array is ");
for(int j =0 ;j<a+1;j++)
{

System.out.print( arraydup[j] + " ");
}


}

}