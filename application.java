class Main {
    public static void main(String[] args) {
        
        String s="Restuarent Name";
        String s1="Amma womens pg",s2="Hyderabad";
        String s3="7865435678";
        String s4="item";
        String s5="price";
        String s6="quantity";
        String s7="total";
        String item="biriyani";
        int price=399;
        int quantity=4;
        int total=1596;
        String item1="chicken65";
        int price1=300;
        int quantity1=2;
        int total1=600;
        String item2="fish";
        int price2=499;
        int quantity2=3;
        int total2=1497;
        String item3="water bottle";
        int price3=50;
        int quantity3=2;
        int total3=100;
        String item4="pepsi";
        int price4=99;
        int quantity4=10;
        int total4=990;
        String item5="ice cream";
        int price5=100;
        int quantity5=20;
        int total5=2000;
        double final_total=total1+total2+total3+total4+total5;
        double cgst=(19/final_total)*100;
        double sgst=(9/final_total)*100;
        double tax=(18/final_total)*100;
        double bill=final_total+cgst+sgst+tax;
        double discount=(15/bill)*100;
        double finalbill=bill+discount;
        String ss="THANK YOU FOR VISITING";
        String ss1="VISIT AGAIN";
        System.out.println("                  "+s);
        System.out.println(s1+" "+s2);
        System.out.println(s3);
        System.out.println("-------------------------------------------------");
        System.out.println(s4+"         "+s5+"         "+s6+"        "+s7);
        System.out.println(item+"       "+price+"         "+ quantity+"                "+ total);
        System.out.println(item1+"      "+price1+"         "+quantity1+"                 "+total1);
        System.out.println(item2+"           "+price2+"         "+quantity2+"                 "+total2);
        System.out.println(item3+"    "+price3+"         "+quantity3+"                  "+total3);
        System.out.println(item4+"           "+price4+"         "+quantity4+"                 "+total4);
        System.out.println(item5+"       "+price5+"         "+quantity5+"               "+total5);
        System.out.println("----------------------------------------------------");
        System.out.println("finaltotal                                    "+final_total);
    
        System.out.println("cgst(19%)                                    "+cgst);
        System.out.println("sgst(9%)                                     "+sgst);
        System.out.println("tax(18%)                                     "+tax);
        System.out.println("-------------------------------------------------------");
        System.out.println("bill                                          "+bill);
        System.out.println("discount                                      "+discount);
        System.out.println("-----------------------------------------------------");
        System.out.println("finalbill                                     "+finalbill);
        System.out.println("----------------------------------------------------");
         int final_bill=10000;
         String paymentmode="online";
         String method="upi";
         String app="phonepay";
             
         if(paymentmode=="online")
         {
            if(method=="upi")
              {
                if(app=="phonepay")
                  System.out.println(" discount 25");
                 else if (app=="gpay")
                 System.out.println(" discount 20");
                 else if (app=="paytm")
                 System.out.println(" discount 18");
                 else
                 System.out.println(" discount 16");}
               else if(method =="card")
                 { 
                   if(app=="debit")   
                    System.out.println("discount 15");
                   else if(app=="credit")
                    System.out.println("discount 10");}
           }
          else if (app=="offline")
          {
          System.out.println("discount 0");}
                                  
        System.out.println("               "+ss);
        System.out.println("                  "+ss1);
    }}
