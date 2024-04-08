import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable{

    public static int[][] PlatsID =  {
        {1,2,0,0},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}
    };
    
    public static void setPeople(){
        
    }

    public static void PrintStartMenu(){
        // Skriver ut Start Menyn
        System.out.println
        ("""
                Boka Tid[1]
            Se Lediga Platser[2]
               Avboka tid[3]      
                  Exit[4]
        """);
        
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        while (true) {
            PrintStartMenu();
            String answer = t.nextLine();

            if (answer == "1") 
            {
                while (true) 
                {
                    
                }
            }
            if (answer == "2") 
            {
                while (true) 
                {
                    
                }
            }
            if (answer == "3") 
            {
                while (true) 
                {
                    
                }
            }
            if (answer == "4") 
            {
                break;
            }
        }
        
        t.close();
    }
}