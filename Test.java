public class Test
{
public static void main(String args[])
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
if(i%2==1)
{
System.out.print((char)(j+64)+" ");
}
else
System.out.print("* ");
}
System.out.println();
}
}
}

