import java.util.Scanner; 

//JAVAAAAAAAA
public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 

        System.out.println("What comes after Hello?");

        String a = scanner.nextLine();

        /* Got to love putting everything in a class!!!! APCSA in a nutshell */
        if (a.equals("World!")){
            System.out.println("Correct!");
            System.out.println("Hello " + a);
        }else{
            System.out.println("Wrong try again!!");
        }


        scanner.close(); 
    }

}