// to check how many vowels and consonents  are there in string
import java.util.*;
import java.util.Arrays;

class main1
{
 public static void main(String args[])
 {
   String s=new String("hello");
   char[] ch=s.toCharArray();
   int count_vowels=0;
   int count_cons=0;
   for(int x=0;x<ch.length-1;x++)
   {
      if(ch[x]=='a'||ch[x]=='e'||ch[x]=='i'||ch[x]=='o'||ch[x]=='u')
      {
       count_vowels++;
      }
      else
        count_cons++;
  }
 System.out.println("no of vowels :"+count_vowels);
 System.out.println("no of consonents :"+count_cons);
}
}
//to check how many uppercase,lowecase,numbers,symbols
class main2
{
 public static void main(String args[])
 {
   String s=new String("Bhavani@123");
   char[] ch=s.toCharArray();
   int c_upper=0,c_lower=0,c_numbers=0,c_symbols=0;
   for(int x=0;x<ch.length;x++)
   {
       if(ch[x]>='A'&&ch[x]<='Z')
          c_upper++;
      else if(ch[x]>='a'&&ch[x]<='z')
          c_lower++;
      else if (ch[x]>='0'&&ch[x]<='9')
          c_numbers++;
      else
          c_symbols++;
   }
   System.out.println("no of uppercase :"+c_upper);
   System.out.println("no of lowercase :"+c_lower);
   System.out.println("no of numbers:"+c_numbers);
   System.out.println("no of symbols:"+c_symbols);
}
}
// to find the number of words in a string
class main3
{
 public static void main(String args[])
 {
  String s=new String("hello all good morning ");
  char[] ch=s.toCharArray();
  String copy="";
  int count=0;
  for( int x=0;x<ch.length;x++)
  {
    if(ch[x]==' ')
    count++;
    copy=copy+ch[x];
     
    
  }
   System.out.println("no of words "+count);
   System.out.println(copy);
 }
}
     
//to convert uppercase to lowercase  and lower case to uppercase

class main4
{
 public static void main(String args[])
 {
  String s=new String("HeLLo All ");
  char[] ch=s.toCharArray();
  String copy="";
  for(int x=0;x<ch.length;x++)
  {
    if (ch[x]>='A'&&ch[x]<='Z')
     {
       int c=ch[x]+32;
       copy+=(char)c;
     }
    else if (ch[x]>='a'&&ch[x]<='z')
     {
       int d=ch[x]-32;
       copy+=(char)d;
     }
  }
    System.out.println(copy);
}
}
//reverse a string
class main5
{
 public static void main(String args[])
 {
  String s=new String("hello all");
  char[] ch=s.toCharArray();
  String copy="";
  for(int x=ch.length-1;x>=0;x--)
  {
    copy+=ch[x];
  }
  System.out.println(copy);
}
}
// to  frequency of characters in a string
class main6
{
 public static void main(String args[])
 {
 
 String s=new String("Bhavani");
 char[] ch=s.toCharArray();
 boolean[] b=new boolean[ch.length];

 for(int x=0;x<ch.length;x++)
  {
    if(b[x]==true)
     continue;
  int count=1;
  for(int y=x+1;y<ch.length;y++)
  {
    if(ch[x]==ch[y]){
     count++;
     b[y]=true;}
  }
   System.out.println(ch[x]+" " +count);
}
}
}    
// to  duplicate character of  string
class main7
{
 public static void main(String args[])
 {
 
 String s=new String("Bhavani");
 char[] ch=s.toCharArray();
 boolean[] b=new boolean[ch.length];

 for(int x=0;x<ch.length;x++)
  {
    if(b[x]==true)
     continue;
  int count=1;
  for(int y=x+1;y<ch.length;y++)
  {
    if(ch[x]==ch[y]){
     count++;
     b[y]=true;}
  }
  if (count>1)
    System.out.println(ch[x]);
}
}
}    
// to  unique character of string
class main8
{
 public static void main(String args[])
 {
 
 String s=new String("Bhavani");
 char[] ch=s.toCharArray();
 boolean[] b=new boolean[ch.length];

 for(int x=0;x<ch.length;x++)
  {
      if(b[x]==true)
         continue;
  int count=1;
  for(int y=x+1;y<ch.length;y++)
  {
    if(ch[x]==ch[y]){
     count++;
     b[y]=true;}
  }
   if(count==1)
      System.out.println(ch[x]);
  } 
}
}    
//find the maximum&minimum accuring character in string
class main9
{
 public static void main(String args[])
 {
 
 String s=new String("Bhavani");
 char[] ch=s.toCharArray();
 int min=Integer.MAX_VALUE;
 int max=0;
 //System.out.println((int)ch[2]);

 for(int x=0;x<ch.length;x++)
  {
    if((int)ch[x]<min)
     min=ch[x];
    else if((int)ch[x]>max)
     max=ch[x];
  }
  System.out.println("min char "+(char)min);
  System.out.println("max char" +(char)max); 
}
}
//string is a plaindrome or not

class main10
{
 public static void main(String args[])
 {
 
 String s=new String("madam");
 char[] ch=s.toCharArray();
 String copy="";
 for(int x=ch.length-1;x>=0;x--)
 {
   copy+=ch[x];
 }
if(s.equals(copy))
 System.out.println("palindrome");
else
  System.out.println(" not apalindrome");
}
}
//find the ascending order and descending order in an string

class main11
{
 public static void main(String args[])
 {
                      
 String s=new String("madam");
 char[] ch=s.toCharArray();       
  
 for(int x=0;x<ch.length;x++)//0<5
{
 int min=x;//0//1
 for(int y=x+1;y<ch.length;y++)//1<5//2<5//3<5//4<5//2<5
 {
   if(ch[min]>ch[y])//109<97//109<100//109<97//109<109//97<100
   {
      min=y;//2
   }
}
   char temp=ch[min];//97
     ch[min]=ch[x];//65//
     ch[x]=temp;//
  }
 
  for(char temp1:ch)
   System.out.println(temp1);

}
}

// anagram of two strings
class main13
{
 public static void main(String args[])
 {
  String s=new String("cat");
  String s1=new String("acc");
  if(s.length()==s1.length())
 {
      char[] ch=s.toCharArray();
      char[] ch1=s1.toCharArray();
      if(Arrays.equals(ch,ch1))
       {
        System.out.println("anagram");
       }
      else
         System.out.println(" not anagram");
   }
}
}
  
  
//find the smallest and second smallest

class main14
{
  public static void main(String args[])
  {
    String s=new String("bhavani");
    char[] ch=s.toCharArray();
    int firstmin=Character.MAX_VALUE;
    int secondmin=Character.MAX_VALUE;
    
    for(int x=0;x<ch.length;x++)
    {
       if(ch[x]<firstmin)
        {
           secondmin=firstmin;
           firstmin=ch[x];
         }
    if(ch[x]>firstmin&&ch[x]<secondmin)
       secondmin=ch[x];
    }
    System.out.println("first min  "+(char)firstmin);
    System.out.println("second min "+(char)secondmin);
 }
}
//find the largest and second largest

class main15
{
  public static void main(String args[])
  {
    String s=new String("bhavani");
    char[] ch=s.toCharArray();
    int firstmax=0;
    int secondmax=0;
    
    for(int x=0;x<ch.length;x++)
    {
       if(ch[x]>firstmax)
        {
           secondmax=firstmax;
           firstmax=ch[x];
         }
    else if(ch[x]>firstmax&&ch[x]<secondmax)
       secondmax=ch[x];
    }
    System.out.println("first max  "+(char)firstmax);
    System.out.println("second max "+(char)secondmax);
 }
}
// sort the array in descending order
class main16
{
 public static void main(String args[])
  {
    String s=new String("bhavani");
    char[] ch=s.toCharArray();
    for(int x=0;x<ch.length;x++)
    {
      int max=x;
      int y;
      for( y=x+1;y<ch.length;y++)
       {
         if(ch[max]<ch[y])
            max=y;
       }
          char temp=ch[max];
              ch[max]=ch[x];
              ch[x]=temp;
    }
    for(char temp:ch)
    {
      System.out.println(temp);
    }
}
}
//
class main17
{
 public static void main(String args[])
  {
    String s="hello";
    s.toUpperCase();
     System.out.println(System.identityHashCode(s));
     System.out.println(s);
     String s1=s.toUpperCase();
     System.out.println(System.identityHashCode(s1));
      System.out.println(s1);
  }
}
// print no of strings
class main18
{
  public static void main(String args[])
  {
    String s=new String("hello all good morning");
    String [] arr=s.split(" ");
     System.out.println(arr.length);
}
}
// print palindrome words
class main19
{
  public static void main(String args[])
  {
    String s=new String("hello all goog morning");
    String[] arr=s.split(" ");
 
    for(int x=0;x<arr.length;x++)
    {
       String s1=arr[x];
       StringBuffer sb=new StringBuffer(s1);
       String  rev=sb.reverse().toString();
     
       if(s1.equals(rev))
        System.out.println(s1);
     }
    
}}
//print largest word in a string

class main20
{
  public static void main(String args[])
  {
    String s=new String("hello all googggggggg morning");
    String[] arr=s.split(" ");
    String largest_word=" ";
    int max_length=0;
    for(int x=0;x<arr.length;x++)
    {
      String s1=arr[x];
      int word_count=s1.length();
      if(word_count>max_length)
        {
           max_length=word_count;
           largest_word=s1;
        }
    }
    System.out.println(largest_word);  
  }
}   
//print the smallest word in a string
class main21
{
 public static void main(String args[])
  {
    String s=new String("hello all ");
    String[] arr=s.split(" ");
    String smallest_word=" ";
    int min_length=Integer.MAX_VALUE;
    for(int x=0;x<arr.length;x++)
    {
       String s1=arr[x];
       int word_count=s1.length();
       if(word_count<min_length)
       {
        min_length=word_count;
        smallest_word=arr[x];
       }
   }
   System.out.println(smallest_word);
}
}
//print highest,smallest vowels word in a string

class main22
{
 public static void main(String args[])
  {

  
    String s=new String("heio all good morning");
    String[] arr=s.split(" ");
    int largest_vowel_count=0;
    
    int smallest_vowel_count=Integer.MAX_VALUE;
    String largest_vowels_word=" ";
    String smallest_vowels_word=" ";
    for(int x=0;x<arr.length;x++)
    {
     String s1=arr[x];
     char[] ch=s1.toCharArray();
     int vowels_count=0;
     for(int y=0;y<ch.length;y++)
     {
       if(ch[y]=='a'||ch[y]=='e'||ch[y]=='i'||ch[y]=='o'||ch[y]=='u')
        {
           vowels_count++;
         }
     }
     if(vowels_count>largest_vowel_count)
     {
      largest_vowel_count=vowels_count;
      largest_vowels_word=arr[x];
     }
     else if (vowels_count<smallest_vowel_count){
      smallest_vowel_count=vowels_count;
      smallest_vowels_word=arr[x];}
     
    }
    System.out.println(largest_vowels_word);
     System.out.println(smallest_vowels_word);
    
}
}










    


