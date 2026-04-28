import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username code(A/S/G): ");
         char code = sc.next().charAt(0);
         System.out.println("Enter the password:");
         int password = sc.nextInt();
        System.out.println("Enter the role id(1/2/3):");
        int roleId = sc.nextInt();
        if(code=='A' && password==1234 && roleId==1){
            System.out.println("Welcome Admin. Full access granted.");
        }
        else if(code=='S' && password==1111 && roleId==2){
            System.out.println("Welcome Student. Limited access granted.");
        }
        else if(code=='G'){
            System.out.println("Welcome Guest.View only access");
        }
        else{
            System.out.println("Invalid credentials");
        }
       
    }
    
}