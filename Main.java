import java.io.Serializable;
import java.util.Scanner;

public class Main{

    public static int[][] PlatsID =  {
        {1,2,0,0},{5,0,0,8},{0,10,0,12},{13,0,15,0},{0,0,19,20}
    };
    
    public static void PrintPeople(){
        for (int i = 0; i < PlatsID.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| "+ PlatsID[i][j]+"|");
            }
            System.out.println("");
        }
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
        boolean b = true;
        while (b) {
            System.out.println("hej");
            PrintStartMenu();
            int answer2 = Integer.parseInt(t.nextLine());

            if (answer2 == 1) 
            {
                
            }
            if (answer2 == 2) 
            {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("| "+ PlatsID[i][j]+"|");
                    }
                    System.out.println("");
                }
            }
            if (answer2 == 3) 
            {
                
            }
            if (answer2 == 4) 
            {
                b = false;
            }
            
        }    
    t.close();
    }
}