//insert and display the array using compile time
import java.util.Arrays;
class main1
{
 public static void main (String args[])
{
   int array[]=new int[]{139,12,34,5,566,7};
   char ch[]=new char[]{'c','3','(','?'};
   String s[]=new String[]{"hello","all","good","morning"};
   boolean b[]=new boolean[]{true,false,true,false,true,true};
  for(int x=0;x<array.length;x++)
  {
    System.out.println(array[x]);
  }
  for(int y=0;y<ch.length;y++)
  {
    System.out.println(ch[y]);
  }
  for(int z=0;z<s.length;z++)
  {
    System.out.println(s[z]);
  }
  for(int j=0;j<b.length;j++)
  {
    System.out.println(b[j]);
  }
}}

//insert and display the array using run time
/*
class main2
{
 public static void main (String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("array of 7 integers");
   int array[]=new int[7];
   System.out.println("array of 4 characters");
   char ch[]=new char[4];
    System.out.println("array of 5strings");
   String s[]=new String[5];
    System.out.println("array of 6 boolean");
   boolean b[]=new boolean[6];
  for(int x=0;x<array.length;x++)
  {
    array[x]=sc.nextInt();
    System.out.println(array[x]);
  }
  for(int y=0;y<ch.length;y++)
  {
    ch[y]=sc.next().charAt(0);
    System.out.println(ch[y]);
  }
  for(int z=0;z<s.length;z++)
  {
    s[z]=sc.next();
    System.out.println(s[z]);
  }
  for(int j=0;j<b.length;j++)
  {
    b[j]=sc.nextBoolean();
    System.out.println(b[j]);
  }
}}/*
//find the length of all the arrays without using length propersty
/*
class main1
{
 public static void main (String args[])
{
   int array[]=new int[]{139,12,34,5,566,7};
   char ch[]=new char[]{'c','3','(','?'};
   String s[]=new String[]{"hello","all","good","morning"};
   boolean b[]=new boolean[]{true,false,true,false,true,true};
   */
// reverese the array
class main3
{
 public static void main (String args[])
{
  int[] array=new int[]{12,56,23,67,76,89,90,34};
  for (int x=array.length-1;x>=0;x--)
  {
    System.out.println(array[x]);
  }
}}
//divide the array into equal half
class main4
{
 public static void main (String args[])
{
  int[] array=new int[]{12,56,23,67,76,89,90,34};
  int r=array.length/2;
  System.out.println(r);
  
  System.out.println("first half");
  for(int x=r;x>=0;x--)
  {
      System.out.println(array[x]);
  }
  for(int x=r;x<array.length;x++)
  {
      System.out.println(array[x]);
  }
 
  System.out.println("second half");
  for(int y=array.length-1;y>=r;y--)
  {
      System.out.println(array[y]);
  }
  for(int y=0;y<r;y++)
  {
      System.out.println(array[y]);
  }

  
}}
//print only even indexed elements
class main5
{
 public static void main (String args[])
{
  int[] array=new int[]{12,56,23,67,76,89,90,34};
  for(int x=0;x<array.length;x++)
  {
     System.out.println("even index");
    if(x%2==0)
    {
      System.out.println( array[x]);
    }
   
    else{

      System.out.println("odd"+array[x]);
    }
  }
}}
//print the elements which are divissble by4
class main6
{
 public static void main (String args[])
{
  int[] array=new int[]{12,56,23,67,76,89,90,34};
  for(int x=0;x<array.length;x++)
  {
    if(array[x]%4==0)
    System.out.println(array[x]);
  }
}}
//print the elements indices which are divissble by4
class main7
{
 public static void main (String args[])
{
  int[] array=new int[]{12,56,23,67,76,89,90,34};
  for(int x=0;x<array.length;x++)
  {
    if(array[x]%3==0)
    System.out.println(x);
  }
}}
//character frequency
class main9
{
 public static void main (String args[])
{
  char arr[]=new char[]{'m','a','d','a','m'};
  int[] freq=new int[256];
   for(int i=0;i<arr.length;i++){
       char c=arr[i];
      freq[c]++;}
   
   for(int x=0;x<256;x++)
   {
     if(freq[x]>0)
    {
     System.out.println((char)x+": "+freq[x]);
    }
}
}}
// replace spaces
class main10
{
 public static void main (String args[])
{
  char arr[]=new char[]{'h','e','l','l','o',' ','w','o','r','l','d'};
   for (int x=0;x<arr.length;x++)
   {
    if(arr[x]==' '){
    arr[x]='-';}
    System.out.print(arr[x]);
   }
   
}}  
// Remove duplicates
class main11
{
 public static void main(String args[])
{
 char[] arr=new char[]{'b','a','n','a','n','a'};
 int[] freq=new int[256];
 for(int x=0;x<arr.length;x++)
 {
  freq[arr[x]]++;
 }
 for(int i=0;i<256;i++)
 {
  if(freq[i]==1)
  System.out.println((char)i);
}
}}
// anagram
class main12
{
 public static void main(String args[])
{
 char[] arr=new char[]{'b','a','n','a','n','a'};
 char[] arr1=new char[]{'a','b','a','b','n'};
 int count=0;
 for(int x=0;x<arr.length;x++)
 {
   for(int y=0;y<arr.length;y++)
   if(arr[x]==arr1[y])
   System.out.println("anagram");
   else
   System.out.println(" not anagram");
 }
}}
// swapping the adjacent elements
 class main13
 {
   public static void main(String args[])
   {
   int[] arr=new int[]{12,14,25,56};
   for(int x=0;x<arr.length-1;x=x+2)
    {
      int temp=arr[x];
           arr[x]=arr[x+1];
           arr[x+1]=temp;
    }
    for(int temp:arr)
     System.out.println(temp);

}
}
     
//copy of array
/*
class Main14
{
 public static void main(String args[])
{
 int[] arr=new int[]{10,20,30,40};
 Main main=new Main();
 int[] r=main.reverse(arr);
 for(int x=0;x<r.length;x++)
 System.out.println(r[x]);

}
  int[] reverse(int[] arr)
  {
   int x,y;
   int[] b=new int[arr.length];
   for(y=0,x=arr.length-1;x>=0;x--,y++)
   {
    b[y]=arr[x];
       }
    return b;
  }
}
*/
//using for each loop
class Main
{
 public static void main(String args[])
{
  int[] a=new int[]{7,21,63,12,97};
  Main main=new Main();
  main.checkPrime(a);


}
void checkPrime(int[] a)
{
 for(int temp:a)
 {
 int num=temp,count=0;
 for(int x=1;x<=num;x++)
 {
  if(num%x==0)
   count++;
 }
  
 if(count==2){
 System.out.println(num);}

}

}
}
// reverse the array
/*
class main14
{
public static void main(String args[])
{
int[] a=new int[]{10,20,30,40,50,60};
main14 main=new main14();
main.reverse(a);
}
void reverse(int[] a)
{ 
    int[] b=new int[a.length];
    int l=(a.length)/2;
    int y;
    for(int x=0;x<l;x++)
   {
      b[y]=a[x];
      y++;
   }
   for(y=l,x=(b.length-1)/2;x>=0;x--,y++)
   {
      b[y]=a[x];
   }
}
}*/
//even index store
class main15
{
public static void main(String args[])
{
 int[] arr=new int[]{14,19,20,40,60};
 int[] arr1=new int[(arr.length+1)/2];
int y=0;
 for(int x=0;x<arr.length;x++)
{
 if(x%2==0)
{
   arr1[y]=arr[x];
   y++;
}
}
for( y=0;y<arr1.length;y++)
{
System.out.println(arr1[y]);
}}
}
// LEFT rotation
class main16
{
public static void main(String args[])
{
 int[] arr=new int[]{14,19,20,40,60};
 int index=2;
 for(int x=index;x<=arr.length-1;x++)
 {
   System.out.println(arr[x]);
 }
 int i=0;
 for( i=0;i<=index-1;i++)
 {
   System.out.println(arr[i]);
 }
}}
//linear search first acurrance
class main17
{
public static void main(String args[])
{
 int[] arr=new int[]{12,11,13,11,11};
 int search=11,count=0,last=-1;
 for(int x=0;x<arr.length;x++)//0 to 4
 {
    if(search==arr[x])//11==12(f)//11==11(t)
    { 
       if(count==0)//0==0(t)
       System.out.println("first acuurance "+x);//2
       count++;//1
    }
       last=x;//2//3//4
 }
 if(last==0)
 {
    System.out.println("Not found");
 }
 else
 {
   System.out.println("last ocuurance"+last);
  }
}
}
//frequency of elements
class main18
{
public static void main(String args[])
{
 int[] arr=new int[]{11,12,13,11};
 int search=11,count=0;
 for(int x=0;x<arr.length;x++)
 {
  if(search==arr[x])
  {
   count++;
   }
 }
 System.out.println(count);
}
}
//
class main19
{
 public static void main(String args[])
{
 int[] arr=new int[]{11,10,19,20,15};
 main19 main=new main19();
 main.reverse(arr);
}

 void reverse(int[] arr)
 {
  int [] arr1=new int[arr.length];
  int y=0;
  
  for(int x=0;x<arr.length;x++)
  {
    if(x%2==0)
    {
     arr1[y]=arr[x];
     y++;
   
    }
  }
  for(int x=arr.length-1;x>=0;x--)
  {
   if(x%2!=0)
   {
    arr1[y]=arr[x];
    y++;

    }
  }
   for(y=0;y<arr1.length;y++)
  {
   System.out.println(arr1[y]);
  }
}
}
//right rotation
class main20
{
 public static void main(String args[])
{
 
 int[] a=new int[]{10,20,30,40,50,60,70,80,90,100};
 int r=4;

 for(int x=a.length-r;x<a.length;x++)//6 <10
 {
  int copy=a[a.length-1];//100
  for(int y=a.length-1;y>0;y--)//9>=0
 {
   a[y]=a[y-1];//a[9]=90,a[8]=80,70,60,50,40,30,20,10
  }

 a[0]=copy;
}
 for (int temp:a)
 System.out.println(temp);

}
}
//left rotation
class left
{
 public static void main(String args[])
 {
  int[] arr=new int[]{10,20,30,40,50,60,70,80,90};
  int r=2;
  for(int y=1;y<=r;y++)
  {
    int copy=arr[0];
    for(int x=0;x<arr.length-1;x++)
    {
       arr[x]=arr[x+1];
    }
    arr[arr.length-1]=copy;
  }
  for(int temp:arr)
    System.out.println(temp);
}}

//minimum element
/*
class main21
{
public static void main(String args[])
{
 int [] arr=new int[]{10,6,80,19};
 main21.obj=new main21();
 main.minimum(arr);
}
 void minimum(int[] arr)
{
  int min=0;
  for(int x=0;x<arr.length-1;x++)
  {
    if(arr[min]>arr[x])
    min=x;
  }
  temp=arr[min];
  arr[min]=arr[0];
  arr[0]=arr[min];
  for(int temp1:arr)
  System.out.println(temp1);
}
}*/
// remove element from 2nd index
class main22
{
public static void main(String args[])
{
 int [] a=new int[]{10,20,30,40,50};
 int r=2;
 for(int x=r;x<a.length-1;x++)
 {
  a[x]=a[x+1];//40//50
 }
 a[a.length-1]=0;
 for(int temp:a)
 System.out.println(temp);
}
}
//copy all the elements in a array into b array
class main23
{
public static void main(String args[])
{
 int [] a=new int[]{10,20,30,40,50};
 int [] b=new int[a.length];
 int y=0;
 for(int x=0;x<=a.length-1;x++)
 {
  b[y]=a[x];
  y++;
 }

for (int temp:b)
System.out.println(temp);

}
}
//copy all the elements in a array into b array in reverse oder

class main24
{
public static void main(String args[])
{
 int [] a=new int[]{10,20,30,40,50};
 int [] b=new int[a.length];
 int y=0;
 for(int x=a.length-1;x>=0;x--)
 {
  b[y]=a[x];
  y++;
 }

for (int temp:b)
System.out.println(temp);

}
}
//selection sort ascending oder
class main25
{
public static void main(String args[])
{
  int[] a=new int[]{23,14,6,78,90};
  main25 main=new main25();
  main.selectionSort(a);
}
  void selectionSort(int[] a)
  {
   for(int y=0;y<a.length-1;y++)
   {
      int min=y;
      for(int x=y+1;x<a.length;x++)
      {
            if(a[min]<a[x])
            {
               min=x;
            }
      
      int temp=a[min];
      a[min]=a[x];
      a[x]=temp;
      }
  }
 for(int var:a)
 System.out.print(var+" ");
 }
}
//
//selection sort descending oder
class main26
{
public static void main(String args[])
{
  int[] a=new int[]{23,14,6,78,90};
  main26 main=new main26();
  main.selectionSort(a);
}
  void selectionSort(int[] a)
  {
   for(int y=0;y<a.length-1;y++)
   {
      int max=y;
      for(int x=y+1;x<a.length;x++)
      {
            if(a[max]<a[x])
            {
               max=x;
            }
      
      int temp=a[max];
      a[max]=a[y];
      a[y]=temp;
      }
  }
 for(int var:a)
 System.out.print(var+" ");
 }
}
// binary search
class main27
{
public static void main(String args[])
{
  int[] a=new int[]{10,20,30,40,50,90};
  int search=20;
  main27 main =new main27();
  int result =main.binarySearch(a,search);
  if(result!=-1)
  System.out.println("element  found "+result);
  else
  System.out.println("element not found");
 } 
 int binarySearch(int[] a,int search)
 {
   int low=0;
   int high=a.length-1;
      while(low<=high)
     {
        int mid=(low+high)/2;
        if(a[mid]==search)
        {
         return mid;
        }
        else if(a[mid]>search)
        {
         high=mid-1;
        }
        else
         low=mid+1;
      }
   
   return -1;
  }
} 
// first print the selecton sort ascending oder and binay search implement
class main28
{
 public static void main(String args[])
 {
 main28 main=new main28();
 int[] a=new int[]{23,14,6,78,90};
 int search=78;
 main.selectionSort(a);

 main.binarySearch(a,search);
 
}
 void selectionSort(int[] a)
 {
  for(int y=0;y<=a.length-1;y++)
  {
     int min=y;
     for(int x=y+1;x<a.length;x++)
     {
       if(a[min]>a[x])
       {
         min=x;
       }
     }
      int temp=a[min];
      a[min]=a[y];
      a[y]=temp;
  }  
  for(int var:a)
  System.out.println(var);
 
}
  void binarySearch(int[] a,int search)
  {
     int low=0;
     int high=a.length-1;
     boolean status=false;
     while(low<=high)
     {
       int mid=(low+high)/2;
       if(a[mid]==search)
       {
         System.out.println("element found "+mid+1);
         status=true;
         break;
         
       }
      else if(a[mid]>search)
        high=mid-1;
     else
       low=mid+1;
    }
   if(status==false)
   System.out.println("element not found");
 }
}
//take a array search the element if element is found delete the element else insert the element  
class main29
{
public static void main(String args[])
{
  int[] a=new int[]{23,16,44,55,18};
  main29 main=new main29();
  int result=main.search(a);
  if(result!=-1)
  System.out.println("index "+result);
  else
  System.out.println("not found");
  int k=90;
  System.out.println("after delete the element");
  main.delete(a,result);
  System.out.println("after insert the element");
  main.insert(a,result,k);
}


int search(int[] a)
 {
  int search=16;
  boolean status=false;
  int x;
  for( x=0;x<a.length-1;x++)
  {
    if (a[x]==search)
    {
        status=true;
        break;
    }
  }
  return x;
}
 
 void delete(int[] a,int result)
 {
   for(int y=result;y<a.length-1;y++)
   {
     a[y]=a[y+1];
   }
   a[a.length-1]=0;
   for(int temp:a)
   System.out.println(temp);
 }
 void insert(int[] a,int result,int k)
 {
  for(int i=a.length-1;i>result;i--)
  {
   a[i]=a[i-1];
  }
  a[result]=k;
  for(int temp1:a)
  System.out.println(temp1);
}
}

// check arrays are equal or not 
class main30
{
public static void main(String args[])
{
  int[] a=new int[]{10,20,30,40,50};
  int[] b=new int[]{10,40,30,40};
  if (a.length!=b.length)
  {
    boolean status=false;
    
  }
  boolean status=true;
    for(int y=0;y<=a.length-1;y++)
     {
        if(a[y]!=b[y])
         {
           status=false;
           break;
         }
     }
  
 if(status==true)
   System.out.println("equal"); 
 else
   System.out.println("arrays not equal");
}
}
//check the charcater array is anagram or not
class main31
{
public static void main(String args[])
{
  char[] a=new char[]{'c','a','t'};
  char[] b=new char[]{'t','a','c'};
  boolean status=true;
  for(int x=0;x<a.length;x++)
  {
    for(int y=0;y<b.length;y++)
    {
      if(a[x]==b[y])
      {
         status=true;
          break;
      }
    }
  }
  if(!status)
    System.out.println("anagram");
  else
     System.out.println(" not anagram");
 
}
}

//most repeated element  in an array
class main32
{
 public static void main (String args[])
 {                    
   int[] a=new int[]{10,20,10,23,10,34,12,23};
   boolean b[]=new boolean[a.length];
   int max_count=0;//3
    int most_repeated=0;
   for(int x=0;x<a.length;x++)//0 to 7//1 to 7
   {
      
      if(b[x]==true)
      {
         continue;
      }
    int count=1;
    for(int y=x+1;y<=a.length-1;y++)//1 to7//1<=7(t)//2<=7//1<=7
     { 
       
        if(a[x]==a[y])//10==20(f)//10==10(t)//10==23{f}//10==10//10==34//10==12//10==23//20==10//20==23//20==23//2==10//20==34//20==12//20==23
        {
          count++;//2//3//
          b[y]=true;//2nd true//3rd true
        }
     }
     // System.out.println(a[x]+"==>"+count);//10==3//20==1//
      if(max_count<count)//1>3//1=>1//1>2//1>
      {
        max_count=count;//1
        most_repeated=a[x];
      } 
     }
     System.out.println(most_repeated);   
     //System.out.println(max_count);   
    
   
}
}

//most repeated element  in an array
class main33
{
 public static void main (String args[])
 {                    
   int[] a=new int[]{10,20,10,23,10,34,12,23};
   boolean b[]=new boolean[a.length];
   int min_count=1;
    int least_repeated=0;
   // int largest=0;
   for(int x=0;x<a.length;x++)
   {
      
      if(b[x]==true)
      {
         continue;
      }
    int count=1;
    for(int y=x+1;y<=a.length-1;y++)
     { 
       
        if(a[x]==a[y])
        {
          count++;//2//3//
          b[y]=true;//2nd true//3rd true
        }
     }
     // System.out.println(a[x]+"==>"+count);
      if(min_count>=count)//1>3//1=>1//1>2//1>
      {
        min_count=count;//1
        least_repeated=a[x];
      } 
     }
     System.out.println(least_repeated);   
     //System.out.println(min_count);   
    
}
}

//print largest duplicate value
class main34
{
 public static void main (String args[])
 {                    
   int[] a=new int[]{23,34,56,72,56,23,16,72};
   boolean b[]=new boolean[a.length];
   int max_count=0;
   int largest_duplicate=0;
   int x;
   for(x=0;x<=a.length-1;x++)//0 to 5
   {
      if(b[x]==true)
      {
       continue;
      }
      int count=1;
      for(int y=x+1;y<=a.length-1;y++)//1<4//2<4//3<4//4<=4
      {
        if(a[x]==a[y])//23==34//23==56//23==72//23==56/23==23
        {
          count++;//2
          b[y]=true;
        }
      }
   
   if(count>1)
   {
    
    if(a[x]>largest_duplicate)//23>=0
    {
     largest_duplicate=a[x];//23
    }
   }
 }
    System.out.println(largest_duplicate);
}

}
//print smallest unique value 
   
class main35
{
 public static void main (String args[])
 {                    
   int[] a=new int[]{23,34,56,72,56,16,23,72};
   boolean b[]=new boolean[a.length];
   int smallest_unique=Integer.MAX_VALUE;
   int x;
   for(x=0;x<=a.length-1;x++)//0 to 5
   {
      if(b[x]==true)
      {
       continue;
      }
      int count=1;
      for(int y=x+1;y<=a.length-1;y++)//1<4//2<4//3<4//4<=4
      {
        if(a[x]==a[y])//23==34//23==56//23==72//23==56/23==23//
        {
          count++;//2
          b[y]=true;
        }
      }
   
   if(count==1)
   {
    
    if(a[x]<smallest_unique)//23>0
    {
     smallest_unique=a[x];//23
    }
   }
 }
    System.out.println(smallest_unique);
}

}
//






