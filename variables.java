class main
{
public static void main(String args[])
{
int num=11;
int a=2,b=3;
if(num%5==0)
{
a=a+b;//5
b=a-b;//2
a=a-b;
System.out.println(a+" "+b);
}
else
{
a=a+b;
System.out.println(a+" "+b);
}
}
}
