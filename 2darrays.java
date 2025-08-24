import java.util.Arrays;
import java.util.*;

class Main
{
 public static void main (String args[])
 {                    
   int[] a=new int[]{23,34,56,72,56,16,23};
   Main main=new Main();
   int[] b=main.sortArray(a);
   //for(int temp:b)
   System.out.println(b[b.length-2]);
 }
   int[] sortArray(int[] a)
   {
      Arrays.sort(a);
      return a;
   }

}

//second minimum
class min
{
 public static void main(String args[])
{
 int[] a=new int[]{12,10,6,5,13,54};
 int firstmin=Integer.MAX_VALUE;
 int secondmin=Integer.MAX_VALUE;
 for(int x=0;x<a.length;x++)
 {
   if(a[x]<firstmin)
   {
     secondmin=firstmin;
     firstmin=a[x];
   }
if(a[x]>firstmin&&a[x]<secondmin)
{
 secondmin=a[x];
}
}
System.out.println(secondmin);
}}
//second maximum
class max
{
 public static void main(String args[])
{
 int[] a=new int[]{12,10,6,5,13,54};
 int firstmax=0;
 int secondmax=0;
 for(int y=0;y<a.length;y++)
 {
   if(a[y]>firstmax)
   {
     secondmax=firstmax;
     firstmax=a[y];
   }
   if(a[y]>firstmax &&a[y]<secondmax)
   {
       secondmax=a[y];
    }
}

System.out.println(secondmax);
}
}
//print the first duplicate value
class firstduplicate
{
  public static void main(String args[])
  {
    int[] a=new int[]{12,23,45,23,16,15,16};
    boolean[] b=new boolean[a.length];
    int x;
    for(x=0;x<a.length;x++)
    {
      if (b[x]==true)
      {
        continue;
      }
    int count=1;
    for(int y=x+1;y<a.length;y++)
    {
      if(a[x]==a[y])
      {
        count++;
      }
    }
    
   if(count>1)
   break;
   }
   System.out.println("first duplicate value is  "+a[x]);
   
}
}
//print the last duplicate value
class lastduplicate
{
  public static void main(String args[])
  {
    int[] a=new int[]{12,23,45,23,16,15,16};
    boolean[] b=new boolean[a.length];
    
    int x;
    //int count=1;
    for(x=a.length-1;x>=0;x--)
    {
      if (b[x]==true)
      {
        continue;
      }
    int count=1;
    for(int y=a.length-2;y>=0;y--)
    {
      if(a[x]==a[y])
      {
        count++;
      }
    }
   
   if(count>1)
   {
    break;
   }
   }
   System.out.print(a[x]);
   
        
}
}
//print first unique value
class firstunique
{
  public static void main(String args[])
  {
    int[] a =new int[]{10,13,14,15,10};
    boolean[] b=new boolean[a.length];
    firstunique main=new firstunique();
    main.uniqueValue(a,b);
   }
   void uniqueValue(int[]a,boolean[] b)
   { 
     int x;
     for( x=0;x<a.length;x++)
     {
       if(b[x]==true)
        {
         continue;
        }
     int count=1;
     for(int y=x+1;y<a.length;y++)
     {
       if(a[x]==a[y])
       {
         count++;
       }
     }  
    if(count==1)
      break;

   }
   
    System.out.println(a[x]);
 
}
}
//print last unique
//print first unique value
class lastunique
{
  public static void main(String args[])
  {
    int[] a =new int[]{10,13,14,15,10};
    boolean[] b=new boolean[a.length];
    lastunique main=new lastunique();
    main.uniqueValue(a,b);
   }
   void uniqueValue(int[]a,boolean[] b)
   { 
     int x;
     for( x=a.length-1;x>=0;x--)//4>=0//
     {
       if(b[x]==true)
        {
         continue;
        }
     int count=1;
     for(int y=a.length-2;y>0;y--)//3>=0//2>=0//1>=0//0==0
     {
       if(a[x]==a[y])//10==15//10==14//10==14//10==10
       {
         count++;//2
       }
     }  
    if(count==1)
      break;
   }
  
    System.out.println(a[x]);
 
}
}

//insert and display the below elements in the array
/*
class array1
{
 public static void main(String args[])
 {
  char[] ch=new char[]{"hello","all","good","morning","453","?<>|+_"};
  for(int x=0;x<a.length;x++)
  {
    System.out.println(ch[x]);
  }
 }
}
*/
//print array elements which are repeated  even no of times
class main
{
 public static void main(String args[])
 {
   int[] a=new int[]{12,23,12,23,24,23,24};
   boolean[] b=new boolean[a.length];
   for(int x=0;x<a.length;x++)
   {
     if(b[x]==true)
     {
       continue;
     }
   int count=1;
   for(int y=x+1;y<a.length;y++)
   {
     if(a[x]==a[y])
      {
        count++;
      }
   }
   if(count>1)
   {
   if(count%2!=0||count%2==0)
   System.out.println(a[x]);
   }
  }
}
}	
//print the 2_d array
class main1
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{2,3},{3,4},{4,6}};
  System.out.println(a[0][0]+" "+a[0][1]);
  System.out.println(a[1][0]+" "+a[1][1]);
  System.out.println(a[2][0]+" "+a[2][1]);
}
}
//print the length of the rows and columns
class main2
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12},{3,4,5}};
  System.out.println("rows "+a.length);
  System.out.println("columns "+a[0].length);
}
}
//print the 2darray using forloop

class main3
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},{4,5,6},{7,8,9},{1,1,1},{3,4,5}};
  for(int x=0;x<a.length;x++)
  {
    for(int y=0;y<a[0].length;y++)
    {
     System.out.print(a[x][y]+" ");
    }
   System.out.println();
  }
}
}
//print the arrays using scanner class

class main4
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter rows");
 int r=sc.nextInt();
 System.out.println("enter columns");
 int c=sc.nextInt();
 int[][] a=new int[r][c];
 for(int x=0;x<r;x++)
 {
  for(int y=0;y<c;y++)
  {
    a[x][y]=sc.nextInt();
  }
 }
for(int x=0;x<r;x++)
 {
  for(int y=0;y<c ;y++)
  {
    System.out.print(a[x][y]+ " ");
  }
 System.out.println();
 }
}
}
//addation of two matrices
 class main5
{
 public static void main(String args[])
 {
 int[][] a=new int[][]{{1,2},{3,4},{4,5}};
 int[][] b=new int[][]{{5,6},{7,8},{9,1}};
 for(int x=0;x<a.length;x++)
 {
   for(int y=0;y<a[x].length;y++)
    {
      System.out.print(a[x][y]+b[x][y]+" ");
     
    }
 System.out.println();
}
}
}
//print the sum of diagnol array
class main6
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                        {7,8,9}};
 int sum=0;
 for(int x=0;x<a.length;x++)//0<3//1<3//2<3
 {
  sum+=a[x][x];//a[0][0]=1//a[1][1]=5//a[2][2]=9
}
System.out.println(sum);
}
}
//print the sum of each row elements in the array
class main7
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                        {7,8,9}};
  
  for(int x=0;x<a.length;x++)//0<3
  {
    int sum=0;
    for(int y=0;y<a[x].length;y++)//0<3
    {
      sum+=a[x][y];//a[0][0]=1//1+a[0][1]=1+2=3//3+3//3+
    }
   System.out.println(sum);
 }
}
}
//claculate sum of elemnts in the array
 class main8
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                        {7,8,9}};
  int sum=0;
  for(int x=0;x<a.length;x++)//0<3
  {
    
    for(int y=0;y<a[x].length;y++)//0<3
    {
      sum+=a[x][y];//a[0][0]=1//1+a[0][1]=1+2=3//3+3//3+
    }
  }
  
   System.out.println(sum); 
}
}
// claculate sum of each column of array

 class main9
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                        {7,8,9}};

  for(int x=0;x<a.length;x++)
  {
   int sum=0;
   for(int y=0;y<a[x].length;y++)
   {
     sum+=a[y][x];
   }
   System.out.println(sum);
  }
}}

//print reverse diagnols
 class main10
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                        {7,8,9}};
  for(int x=0,y=a.length-1;x<=a.length-1;x++,y--)
  {
    System.out.println(a[x][y]);
  }
}
}
// sum of both diagnolas
class main11
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                        {7,8,9}};
 int first_sum=0;
 int sec_sum=0;
 for(int z=0;z<a.length;z++)
 {
  first_sum+=a[z][z];
 }
 for(int x=0,y=a.length-1;x<a.length;x++,y--)
 {
  sec_sum+=a[x][y];
 }
 System.out.println(first_sum+sec_sum);
}}
//count the no of times in a 2d array
class main12
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                         {7,8,9}};
 int prime_count=0;
    
 for(int x=0;x<a.length;x++)
 {  
   
   for(int y=0;y<a[x].length;y++)
   {
     int num=a[x][y];
     int count=0;
     int z;
     for( z=2;z<=num;z++)
     {
        if (num%z==0)
        count++;
     }
     if(count==1)
      {
       prime_count++;
      }
    }
  }
    System.out.println(prime_count);
}
}
//find the min

class main13
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                       {7,8,9}};
 int min_ele=Integer.MAX_VALUE;
 for(int x=0;x<a.length;x++)
 { 
   int c=0;
   int min=Integer.MAX_VALUE;
   for(int y=0;y<a[x].length;y++)
   {
     c=a[x][y];
     if(c<min)
     {
        min=c;
     }
   }
  //System.out.println(min)
 if(min<min_ele)
  {
     min_ele=min;
  }
}
 System.out.println(min_ele);
}
}   
//find the max element
class main14
{
 public static void main(String args[])
 {
  int[][] a=new int[][]{{1,2,3},
                        {4,5,6},
                       {7,8,9}};
 int max_ele=0;
 for(int x=0;x<a.length;x++)
 { 
   int c=0;
   int max=0;
   for(int y=0;y<a[x].length;y++)
   {
     c=a[x][y];
     if(c>max)
     {
        max=c;
     }
   }
  //System.out.println(min)
 if(max>max_ele)
  {
     max_ele=max;
  }
}
 System.out.println(max_ele);
}
}   

//display the number of times it appears in the array

class main15
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter length");
   int[] a=new int[10];
   System.out.println("enter search element");
   int search=sc.nextInt();
   System.out.println("Enter 10 elements");
   for(int x=0;x<a.length;x++)
   {
      a[x]=sc.nextInt();
   }
   int count=0;
   for(int y=0;y<a.length;y++)
   {
     if(search==a[y])
     count++;
   }
   System.out.println("no_of_times:"+count);
}
}
//print the how many positive,negative,even,odd in an array
class main16
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int[] a=new int[5];
  System.out.println("enter elements");
  for(int x=0;x<a.length;x++)
  {
   a[x]=sc.nextInt();
  }
  int c_pos=0,c_neg=0,c_even=0,c_odd=0;
  for(int y=0;y<a.length;y++)
  {
    if(a[y]>0)
      c_pos++;
    if (a[y]<0)
      c_neg++;
    if(a[y]%2==0)
      c_even++;
    else
      c_odd++;
 }
  System.out.println("no of pos numbers "+c_pos);
  System.out.println("no of neg numbers "+c_neg);
  System.out.println("no of even numbers "+c_even);
  System.out.println("no of odd numbers "+c_odd);
}}
// find the maximum and minimum element in ana array
class main17
{
 public static void main(String args[])
 {
  int[] a=new int[]{12,14,15,1,13,-1};
  int min=Integer.MAX_VALUE;
  int max=0;
  for(int x=0;x<a.length;x++)
  {
    if(a[x]<min)//a[0]<214=12<214//12<14//
     min=a[x];//12
    if(a[x]>max)//12>0//14>12
     max=a[x];//12//14
  }
  System.out.println("min " +min);
  System.out.println("max " +max);
}
}

// right rotate the array for 5 times
class main18
{
 public static void main(String args[])
 {
  int[] a=new int[]{12,14,15,1,13,6};
  int index=4;
  int x;
  for(x=index;x<=a.length-1;x++)
  {
   System.out.println(a[x]);
  }
  for(int y=0;y<=index-1;y++)
  {
     System.out.println(a[y]);
  }
}
}
//
 
class main19
{
 public static void main(String args[])
 {
  int[] a=new int[]{12,14,15,1,13,6};
  int[] b=new int[a.length];
  int y=0;
  int index=4;
 
  for(int x=index;x<a.length-1;x++)
  {
    b[y]=a[x];
    y++;
  }
  
  for(int temp:b)
  {
    System.out.print(temp+ " "); 
  }

}
} 
// sort the belostring 
class main20
{
 public static void main(String args[])
 {
  String[] s =new String[]{"hello","all","good","mrg","have"};
  String c=Arrays.sort(s);
  System.out.println(c);
}
} 


