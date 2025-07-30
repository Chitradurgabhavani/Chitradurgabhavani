//

/*class main
{ 
  public static void main(String args[])
    {
      int num=12000,r=0,count1=0,count2=0,rev=0,r1=0,rev1=0,diff=0,copy=rev;
      while(num!=0)
        {
         count1++;
         r=num%10;
         rev=rev*10+r;//21
         num=num/10;
        }
      while(rev!=0)
        {
         count2++;
         r1=rev%10;
         rev1=rev1*10+r1;//12
         rev=rev/10;
        }   
     System.out.println(rev1);   
     diff=count1-count2;
     System.out.println(diff);      
     System.out.println((int)(rev1*Math.pow(10,diff)));

}}*/
/*
//armtrong sum of each digit  power no of digits
class main
{
  public static void main(String args[])
   {
    int num=153,count=0,copy=num,r=0,sum=0,copy1=num;
    while(num!=0)
    {
      count++;
      num=num/10;
    }
    while(copy!=0)
    {
      r=copy%10;
      sum=sum+(int)(Math.pow(r,count));
      copy=copy/10;
    }
    System.out.println((copy1==sum)?("Armstrong"):("not"));
}}*/

/*class main
{
  public static void main(String args[])
    {
     int num=675,r=0,rev=0,copy=num,r1=0,rev1=0;
     while(num!=0)
       {
        r=num%10;
        rev=rev*10+r;//576
        num=num/10;
       }
     while(copy!=0)
       {
        r1=copy%10;
        rev1=rev*10+r;//576
        switch(r1)
        {
        case 6:System.out.println("six");
               break;
        
       }
     copy=copy/10;
     }}}*/

       
// factorial of number
 
/*class main
{
  public static void main(String args[])
    {
     int num=5,count=1,factorial=1;
     while(count<=num)
       {
        
        factorial*=count;
        count++;
        
        }
       System.out.println(factorial);


}}*/
// average of number
/*
class main
{
  public static void main(String args[])
   {
    int num=1234,count=0,copy=num,r=0,sum=0;
    while(num!=0)
      {
         count++;
         num=num/10;
      }
    while(copy!=0)
      {
         r=copy%10;
         sum=sum+r;
         copy=copy/10;
      }
   System.out.println("digits "+sum);
   System.out.println("average "+sum/count);
}}*/

/*class main
{
  public static void main(String args[])
   {
    int num=335667492,c=0,r=0,p1=1,p2=1 ;
    while(num!=0)
      {
       c++;
       r=num%10;
       if(c==1||c==7||c==6||c==5)
       {
          p1=p1*r;
       }
       else
         {
          p2=p2*r;
          }
       num=num/10;
      }
      System.out.println(p1+p2);
}}*/
/*
class main
{
  public static void main(String args[])
   {
    int num=916548327,r=0,c=0,c1=0,c2=0;
    while(num!=0)
    {
      r=num%10;
      if(r>=1&&r<=4)
        c++;
      else if(r==5)
 
        c1++;

      else
    
        c2++;
      
      num=num/10;
     }
    System.out.println("max priority"+c2);
    System.out.println("no priority"+c1);
    System.out.println("min priorty"+c);
}}
*/
/*
// check whether the rem is even or odd
class main
{
  public static void main(String args[])
   {
      int num=23456,r=0,c1=0,c2=0;
      while (num!=0)
      {
        r=num%10;
        if(r%2==0)
        c1++;
        else
         c2++;
      num=num/10;
      }
       System.out.println("even"+c1);
       System.out.println("odd"+c2);
}}*/
//digit place
/*class main
{
  public static void main(String args[])
  {
     int num=3456,count=0,p1=1,p2=2,r=0;
     while(num!=0)
       {
        count++;
        r=num%10;
        if (count==1||count==4)
        p1=p1*r;
        else
        p2=p2*r;
        num=num/10;
        }
       System.out.println(p1+p2);
}}*/

/*class main
{
  public static void main(String args[])
{
  int num=168539,count=0,even_digit=0,odd_digit=1,r=0;
  while(num!=0)
  {
    count++;
    r=num%10;
    if (count%2==0)
    even_digit+=r;
    else
    odd_digit*=r;
    num=num/10;
  }
  System.out.println("even position values sum "+even_digit);-
  System.out.println("odd position values mul "+odd_digit);
}}

    
    
   











        
 







