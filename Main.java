
import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable{

    //plats array
    public static int[][] PlatsID =  {
        {1,2,0,0},{5,0,0,8},{0,10,0,12},{13,0,15,0},{0,0,19,20}
    };

    //printar ut alla platser
    public static void PrintPeople(){
        for (int i = 0; i < PlatsID.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| "+ PlatsID[i][j]+" |");
            }
            System.out.println("");
        }
    }

    //skriver ut startmeny
    public static void PrintStartMenu(){
        System.out.println
        ("""
                Boka Tid[1]
            Se Lediga Platser[2]
               Avboka tid[3]      
                  Exit[4]
        """);
        
    }

    //main tråden
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        boolean b = true;
        //meny-loopen
        while (b) {
            PrintStartMenu();

            //val 1
            System.out.print(">");
            int answer = Integer.parseInt(t.nextLine());
            switch (answer) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    //skriver ut platserna
                    PrintPeople();
                    System.out.print(">");
                    t.nextLine();
                    //clearar consolen
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    break;
                case 3:
                    
                    break;
                case 4:
                    //stänger av programet
                    b = false;
                    break;
                default:
                    break;
            }
        }    
    t.close();
    }
}