
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Main implements Serializable{

    public static void clearconsole(){
        //tar bort text som är över inmatnings-symbel(blinkande | )
        System.out.println("\033[H\033[2J");
        //ändrara inmatnings-symbolens position till längst up
        System.out.flush();
    }

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

        //meny-loopen
        while (true) {
            PrintStartMenu();

            //val 1
            System.out.print(">");
            int answer = Integer.parseInt(t.nextLine());
            switch (answer) {
                case 1:
                    clearconsole();
                    System.out.print("antal vuxna (18 år eller över) >");
                    int vuxna[] = new int[Integer.parseInt(t.nextLine())];
                    System.out.println("");
                    clearconsole();
                    System.out.print("antal barn (under 18 år)>");
                    int barn[] = new int[Integer.parseInt(t.nextLine())];
                    for (int i = 0; i < barn.length; i++) {
                        
                    }
                    int pris = vuxna[0]*120 + barn[0] * 80;
                    clearconsole();
                    System.out.println("Pris: " + pris + "kr");
                    System.out.println("Betalar du med swish[1] eller kort[2]?");
                    int val = t.nextInt();
                    if (val == 2) {
                        
                    }
                    if (val == 1){
                        Random r = new Random();
                        for (int i = 0; i < 15; i++) {
                            for (int j = 0; j < 35; j++) {
                                int randint = r.nextInt(0,2);
                                if (randint == 1) {
                                    System.out.print("*");
                                }else if (randint == 0){
                                    System.out.print(" ");
                                }
                            }
                            System.out.println("");
                        }
                    }else{
                        System.out.println("Ogiltigt svar");
                    }
                    
                    t.nextLine();
                    clearconsole();
                    break;
                case 2:
                    clearconsole();
                    //skriver ut platserna
                    PrintPeople();
                    System.out.print(">");
                    t.nextLine();
                    //clearar consolen
                    clearconsole();

                    break;
                case 3:
                    
                    break;
                case 4:
                    //stänger av programet
                    System.exit(answer);
                    t.close();
                    break;
                default:
                    break;
            }
        }    
    
    }
}