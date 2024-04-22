import java.util.Scanner;
public class First 
{
public static void main(String[] args)
{

int a[]; // Array Declaration
a = new int[]{1,2,3,4,5,6}; // Array initilisation and define
System.out.println(a[0]);



// in single line declaration and initilization
int []b = new int[3];
b[0] = 10;
b[1] = 20;
b[2] = 30;
System.out.println (b[0]);


// Program to take data from user

int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of element you want to enter");
num = sc.nextInt();
int array[] = new int[num];
for(int i = 0;i<num;i++)
{
array[i] = sc.nextInt();
}

for(int i = 0;i<num;i++)
{
System.out.println("Number " + i+1);
System.out.println(array[i]);
}
}
}