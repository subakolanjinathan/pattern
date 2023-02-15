public class Arrow
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=10;j++)
{
if (i==3 || j==8 || j==9 && i>1 && i<5)
{
System.out.print("*");
}
else
System.out.print(" ");
}
System.out.println();
}
}
}

