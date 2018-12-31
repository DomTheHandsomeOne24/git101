import java.util.*;
public class Salcedo {

    
    public static void main(String[] args) {
     Scanner sn = new Scanner (System.in);
     
     System.out.println("This program is able to display 3 numbers in ascending order.");
     
     System.out.println("Enter 1st number: ");
     int a = sn.nextInt();
     System.out.println("Enter 2nd number: ");
     int b = sn.nextInt();
     System.out.println("Enter 3rd number: ");
     int c = sn.nextInt();
     
        if (a<b && a<c)
        {
            System.out.println(a);
        }
        else if (b<a && b<c)
        {
            System.out.println(b);
        }
        else if (c<a && c<b)
        {
            System.out.println(c);
        }
        if (a>b && a>c)
        {
            System.out.println(a);
        }
        else if (b>a && b>c)
        {
            System.out.println(b);
        }
        else if (c>a && c>b)
        {
            System.out.println(c);
        }
     
        
    
    }
 }
   
    
     

         
   
     
 


