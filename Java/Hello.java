import java.util.Scanner;
public class hello {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String myname=in.next();
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World \n Grettings from "+myname);
    }

}
