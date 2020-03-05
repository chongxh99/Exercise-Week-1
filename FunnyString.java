import java.util.Scanner;
public class FunnyString
{   
    public static void main (String [] args)
    {
      Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter your favourite colour\t:");
        String colour = scan.nextLine();
        
        System.out.print("Enter your favourite food\t:");
        String food = scan.nextLine();
        
        System.out.print("Enter youar favourite animal\t:");
        String animal = scan.nextLine();
        
        System.out.print("Enter your first name of frined\t:");
        String friend = scan.nextLine();
        
        System.out.println("I had a dream that " + friend + " ate a " + colour + " " + animal + " and said it tasted like " + food +"!");
    }
}