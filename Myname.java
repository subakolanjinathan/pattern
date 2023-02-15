public class Myname
{
public static void main(String args[])
{ 
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||i==3||i==5||(j==1&&i<=3)||(j==5&&i>=3))
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1||j==5||i==5)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||i==5||i==3||j==1||j==5)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i==1||i==3||j==1||j==5)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}
