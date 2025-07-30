/*class main
{
  public static void main(String args[])
    {
     int x;
     int c=0;
     for(x=0;x!=11;x++)
       {
         c++;
         System.out.println("hello  "+c);
       }
}}
// sum of n natural numbers
class main
{
 public static void main(String args[])
  {
   int x,s=0;
   for(x=0;x!=10;x++)
     {
       s=s+x;
     }
   System.ou.println(s);
}}
  */
// forward table
/*
class main
{
  public static void main(String args[])
  {
   int i,num=7,t=0;
   for(i=1;i<11;i=i+2)
   {
     t=num*i;
     System.out.println(num + "x" +i+"="+t);
   }
}}
*/
//reverse table
/*
class main
{
  public static void main(String args[])
  {
   int i,num=7,t=0;
   for(i=11;i>=1;i--)
   {
    t=num*i;
    System.out.println(num + "x" +i+"="+t);
}}}*/

// odd number
/*
class main
{
  public static void main(String args[])
  {
   int i,num=7,t=0;
   for(i=1;i<11;i++)
   {
     if(i%2==0)
     {
     t=num*i;
     System.out.println(num + "x" +i+"="+t);}
   }
}}*/
//sum of tables
/*
class main
{
  public static void main(String args[])
  {
   int i,num=7,t=0,s=0;
   for(i=1;i<11;i++)
   {
     t=num*i;
     if(t%2==0)
     {
     s=s+t;
     }
}
System.out.println(s);
}}*/
     
// factor of a number
/*
class main
{
  public static void main(String args[])
  { 
    int i, num=10;
    for (i=1;i<=11;i++)
    {
       if(num%i==0)
       System.out.println(i);

   }
}}*/
 /*
// Range of palindrome
class main
{
  public static void main(String args[])
  { 
   /*int i;
   for(i=1;i<=100;i++)
   { 
     int r=0,rev=0,copy=i;
     while(copy!=0)
      {
        r=copy%10;
        rev=rev*10+r;
        copy=copy/10;}
     if(rev ==i)
     System.out.println(rev);
    
     
}*/
/*
class main
{
 public static void main(String args[])
   {
   int num=6,x,count=0;
   for (x=1;x<=num;x++)
   {
    
    if(num%x==0)
    {
     count++;}}
     if (count%2==0)
       System.out.println("prime");
    
}}*/
 /*
class main
{
 public static void main(String args[])
{
  int num=1600,x,count=0;
  for (x=1;x<=num;x++)
    {
     if(num%x==0)
     count++;
    }
  if (count>10)
  System.out.println("special number");
  else
  System.out.println("not a special number");
}}*/
// leap year range
/*
class main
{
 public static void main(String args[])
{
  int num=1543,count=0,x;
  for (x=num;x>=1150;x--)
  {
   if(x%4==0&&x%100!=0||x%400==0)
     {
      count++;
      System.out.println(count+" "+x);
     }
}
}}*/

//common factors
/*
class main
{
 public static void main(String args[])
{
  int num1=56,num2=72,x,temp=0,temp1=0;
  for (x=1;x<=num1;x++)
  {
   if (num1%x==0&&num2%x==0)
      temp=x; // 1 2 4 8
    if(temp>temp1)
      temp1=temp;
}
   System.out.println(temp1);
   
   }}*/
  
  

// using continue
/*
 class main
{
 public static void main(String args[])
{
  int num=10,x;
  for(x=0;x<=num;x++)
  {
    if (x==7)
      continue;
  
System.out.println(x);}
}}*/

// using break
/*
class main
{
 public static void main(String args[])
{
  int num=10,x;
  for(x=0;x<=num;x++)
  {
    if (x==7)
      break;
  
System.out.println(x);}
}}*/

// range of characters
/*
class main
{
 public static void main(String args[])
{
  int x;
  for (x=1;x<=200;x++)
  {
   if(x>='A'&&x<='Z')
   System.out.println((char)x+"==>"+x);
  
   else if(x>='a'&&x<='z')
   System.out.println((char)x+"==>"+x);
}

}}
   */
//range of uppercase to lowercase
/*
class main
{
  public static void main(String args[])
{
  int x,small=0,capital=0;
  for (x=1;x<=200;x++)
  {
  if(x>='A'&&x<='Z')
  {
    small=x+32;
    System.out.println((char)x+"-->"+(char)small);
}
  else if(x>='a'&&x<='z')
  {
    capital=x-32;
    System.out.println((char)x+"-->"+(char)capital);
}
}}}*/
// count capitals and vowels in a string
/*
class main
{
public static void main(String args[])
{
 String s="BhAvani";
 
 int count_cap=0,count_small=0,x;
for(x=0;x<s.length();x++)
{
  char ch=s.charAt(x);
 if (ch>='A'&& ch<='Z')
 count_cap++;
 else if(ch>='a'&& ch<='z')
 count_small++;
}
System.out.println(count_cap);
System.out.println(count_small);

}}*/

 
// print first 10 capital letters skip the vowels
/*
class main
{
  public static void main(String args[])
{
 int x,ch=0;
 for(x=65;x<75;x++)
{
 if(x>='A'&&x<='z')
 ch=(char)x;
 if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
 continue;
 System.out.println((char)ch);
}}}*/
//reverse number
class main
{
  public static void main(String args[])
{
 int num1=25,num2=75,x,temp=0;
 for (x=num1;x>=2;x--)
 {
  if(num1%x==0&&num2%x==0)
  temp=x;}
  System.out.println(x);
  

}}
 


   






















     