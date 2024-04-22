import java.util.Scanner;
class Multidimensional 
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
int rows,columns;
System.out.println("Enter the number of rows in array");
rows = sc.nextInt();
System.out.println("Enter the number of columns");
columns = sc.nextInt();
int array[][] = new int [rows][columns];
System.out.println("Enter the elements in array");
for(int i = 0; i<rows;i++)
{
for(int j =0 ; j<columns ;j++)
{
array[i][j] = sc.nextInt();
}
}


for(int i = 0; i<rows;i++)
{
for(int j =0 ; j<columns ;j++)
{
System.out.print(array[i][j]+" ");
}
System.out.println();
}

}
}