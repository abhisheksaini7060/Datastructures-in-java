import java.util.Scanner;
class Deletionarray
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int a;
System.out.println("Enter the length of array");
a= sc.nextInt();
int array[] = new int[a];
System.out.println("Enter the elements in array");
for(int i = 0; i<a ;i++)
{
array[i] = sc.nextInt();
}
System.out.println("Enter the index you want to delete from array");
int index = sc.nextInt();
int arraydup[] = new int[a-1];
for(int j =0; j<a-1;j++)
{
if(j<index)
{
arraydup[j] = array[j];
}

else
{
arraydup[j] = array[j+1];
}

}

for(int j =0; j<a-1;j++)
{
System.out.print(arraydup[j]+" ");
}

}

}