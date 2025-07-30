//section 1
//1 prime range

class main1
{
  public static void main(String args[])
   {

 int x;
 for(x=1;x<=10;x++)
 {
    int num=x,y,count=0;
    for(y=1;y<=num;y++)
      {
        if (num%y==0)
         count++;
      }
    if(count==2)
    System.out.println(num);
 }
}}

//2 palindrome range
class main2
{
  public static void main(String args[])
   {

int x;
for(x=1;x<=100;x++)
{
   int num=x,r=0,copy=num,rev=0;
   while(num!=0)
   {
    r=num%10;
    rev=rev*10+r;
    
   
   if (copy==rev)
   {
      System.out.println(rev);
   }
   num=num/10;
   }
}
}}
// 3 armstrong range

class main3
{
  public static void main(String args[])
   {

int x;
for(x=1;x<=500;x++)
{
   int num=x,r=0,sum=0,copy=num,count=0,copy1=num;
   while(num!=0)
   {
    count++;
    num=num/10;
   }
   
   while(copy!=0)
   {
     r=copy%10;
     sum=sum+(int)Math.pow(r,count);
     if(copy1==sum)
     {
         System.out.println(sum);
      }
  copy=copy/10;
  }
}
}}
//4 leap year

class main4
{
  public static void main(String args[])
   {

int x;
for(x=2000;x<=2025;x++)
{
  if(x%4==0||x%100!=0&&x%400==0)
  {
   System.out.println(x);
  }
}
}}
 
// multiplication range

class main5
{
  public static void main(String args[])
   {

int x;
for(x=1;x<=10;x++)
{
  int y,num=x,mul=1;
  for(y=1;y<=10;y++)
   {
    mul=num*y;
    System.out.println(num+" x"+x+"="+mul);
   }

}
}}

//6 largest digit of a number

class main6
{
  public static void main(String args[])
   {

 int num=467,max=0,r=0;
 while(num!=0)
 {
  r=num%10;
  if(r>max)
   {
      max=r;
   }
 num/=10;
 }
 System.out.println("largest digit "+max);
}}





//section 2
//evil number

 class main7
{
  public static void main(String args[])
   {

int num=45,copy=num,sum=0,r=0;
int n1=num*num;

while(n1!=0)
 {
   r=n1%10;
   sum=sum+r;
   n1/=10;
 }
 if(copy==sum)
 {
   System.out.println("evil number");
}
else
 System.out.println("not");

}}

//section 2

class main8
{
  public static void main(String args[])
   {

int num=132,r=0,sum=0,mul=1;
while(num!=0)
{
 r=num%10;
 sum=sum+r;
 mul=mul*r;
 num/=10;
}
if (sum==mul)
 System.out.println("power num");
else
  System.out.println("not");

 }}

//section 3

// automatic number

class main9
{
  public static void main(String args[])
   {

int num=23,r=0,temp=0;
int n1=num*num;
while(n1>=num)
{
  r=n1%100;//76
  temp=r;
  
  if(temp==num)
  System.out.println("automatic num");
  else
  System.out.println("not");
n1/=100;
}

  
}}

//section 5
// busy number

class main10
{
  public static void main(String args[])
   {

 int num=47,r=0;
 while(num!=0)
 {
  r=num%10;
  num=r;
  num=num/10;
  }
  System.out.println(r);
  if(r==7&&num%7==0)
   System.out.println("busy number");
  else {
    System.out.println("not a busy number");}

 
}}

//section 6
// invalid number

class main11
{
  public static void main(String args[])
   {

int num=199,r=0,sum=0;
while(num!=0)
{
  r=num%10;
  sum=sum+r;
  num=num/10;
}
if(sum<9)
{
  System.out.println("invalid");
}
else
  { 
    int sum1=0;
    while(sum!=0)
   {
      r=sum%10;
      sum1=sum1+r;
      sum=sum/10;
   }
  if(sum1>=10)
   System.out.println("valid");
}

}}


 


  








