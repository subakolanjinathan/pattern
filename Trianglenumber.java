public class Trianglenumber
{
public static void main(String args[])
{
int m = 4;
int n = 2;
for (int i = 1; i <= m; i++)
{
for (int j = i; j <= m; j++)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++)
{
System.out.print(n+" ");
} 
System.out.println("  ");
n = n + 2;
}
}
}
