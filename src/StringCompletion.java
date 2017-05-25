import java.util.Scanner;
  
 public class StringCompletion
 {
     public static void main( String[] args )
    {
        String name;
        String breed;
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "Greetings. What is your pet's name? " );
        name = keyboard.nextLine();
 
        System.out.println( "What kind of animal is " + name + "? " );
        breed = keyboard.nextLine();
        
        System.out.println( "How old is " + name + "? ");
        age = keyboard.nextInt();
        
        System.out.println( name + " is your " + breed + " and it is " + age );
     }
 }