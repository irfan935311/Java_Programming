import java.util.Scanner;

class Array{
public static void main(String args[])
{

int sum=0,MIN=0,MAX=0;
int sum1=0,sum2=0;
int MAX1=0,MAX2=0;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the size of Row and Col");

int r_size=scan.nextInt();
int c_size=scan.nextInt();

int a[][]=new int[r_size][c_size];

System.out.println("Enter The Array Elements");

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
a[i][j]=scan.nextInt();
sum=sum+a[i][j];

if(MAX<a[i][j])
MAX=a[i][j];


if(MIN<a[i][j])
MIN=MIN;


sum1=sum1+a[j][i];
if(MAX1<a[j][i])

MAX=a[i][i];

sum2=sum2+a[j][j];


}
}


System.out.println("Sum Of All Elements "+sum);
System.out.println("Max of Element of the Array "+MAX);
System.out.println("MIN of Element of the Array "+MIN);

System.out.println("Sum Of row "+sum1);
System.out.println("MAX Of Row "+MAX1);

System.out.println("Sum Of col "+sum2);



}
}