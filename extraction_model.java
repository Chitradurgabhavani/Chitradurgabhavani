//maximum digit in a given number
class main
{
  public static void main(String args[])
{
  int num=4563,max=0,digit=0;
  while(num!=0)
  {
   digit=num%10;
   
   if(digit>max)
     { 
       max=digit;
     }
  num=num/10;
  }
System.out.println(max);
}
}

// minimum digit number\