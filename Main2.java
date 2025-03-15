import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter the username:"); 
        String username = myobj.nextLine();
        System.out.println("The username is: " + username); 
        myobj.close(); 
    }
}
