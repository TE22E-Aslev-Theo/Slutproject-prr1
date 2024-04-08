import java.util.Scanner;

public class Main{


    public static void PrintStartMenu(){
        // Skriver ut Start Menyn
        System.out.println
        ("""
                Boka Tid[1]
            Se Lediga Platser[2]
               Avboka tid[3]      
        """);
        
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        while (true) {
            PrintStartMenu();
            if (t.nextLine() == "hej") {
                break;
            }
        }
        
        t.close();
    }
}