import java.util.Scanner;

class Main{
public static void main(String args[])
{

int sum=0;
Scanner scan=new Scanner(System.in);

System.out.println("Enter Size of Rows And Columns");
int r_size=scan.nextInt();
int c_size=scan.nextInt();
int a[][]=new int[r_size][c_size];

System.out.println("Enter The No of Elements");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=scan.nextInt();

sum=sum+a[i][j];

}
}

System.out.println(sum);
}
}

