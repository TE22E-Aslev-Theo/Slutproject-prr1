import java.util.Random;
import java.util.Scanner;

public class Main{
    
    public static void clearconsole(){
        //fungerar bara i vs-code consolen :(
        //tar bort text som är över inmatnings-symbel(blinkande | )
        System.out.println("\033[H\033[2J");
        //ändrara inmatnings-symbolens position till längst up
        System.out.flush();
    }

    //plats array
    public static int[] PlatsID =  {
        1,2,0,0,5,0,0,8,0,10,0,12,13,0,15,0,0,0,19,20
    };
    //födelse datum array
    public static int[][] datum = {
        {2001, 6, 8},{ 2002, 1, 2},{0,0,0},{0,0,0},{2006, 8, 9},{0,0,0},{0,0,0},{2006 ,5,5},{0,0,0},{1999, 2, 29},{0,0,0},
        {2009, 3, 3},{1300,5,3},{0,0,0},{3000, 3, 2},{0,0,0},{0,0,0},{0,0,0},{2003, 13, 32},{0,12,24}
    };
    public static String[] namn = {
        "Sleepy joe", "Kapitolium conqurer", "", ""
        , "Stefan ingenlöften","",""
        ,"xhi ping pong","","pär bor-ute",""
        ,"Magdalena klanteson", "Ulf Vaderson",""
        ,"Häxa sternevi", "","","","Vladimir sjutin (Fegis)","The Åslev (King)"
    };
    //printar ut alla platser
    public static void PrintPeople(){
        for (int i = 0; i < PlatsID.length; i++) {
            if ((i)%4 == 0) {
                System.out.println("");
                System.out.print("| "+ PlatsID[i]+" |");
            }else{
                System.out.print("| "+ PlatsID[i]+" |");
            }
        }
        System.out.println("");
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
        //meny-loopen
        mainloop:
        while (true) {
            PrintStartMenu();
            //val 1
            Scanner t = new Scanner(System.in);
            String answer = t.nextLine();
            
            switch (answer) {
                case "1":
                    //bokning
                    try {
                    clearconsole();
                    System.out.print("antal vuxna (18 år eller över) >");
                    int vuxnaDatum[][] = new int[Integer.parseInt(t.nextLine())][3];
                    String vuxnaNamn[] = new String[vuxnaDatum.length];
                    System.out.println("");
                    clearconsole();
                    System.out.print("antal barn (under 18 år)>");
                    int barnDatum[][] = new int[Integer.parseInt(t.nextLine())][3];
                    String barnNamn[] = new String[barnDatum.length];
                    int pris = 0;
                    for (int i = 0; i < barnDatum.length; i++) {
                            System.out.println("Namn och datum på barn "+ (i + 1));
                            System.out.print("Namn >");
                            String namn = t.nextLine();
                            System.out.print("Datum [YYYY-MM-DD]>");
                            String Datum = t.nextLine();
                            
                            for(int k = 0; k < 3; k++){
                                barnDatum[i][k] = Integer.parseInt(Datum.split("-")[k]);
                            }
                            barnNamn[i] = namn;
                    }
                    pris += barnDatum.length * 80;
                    for (int i = 0; i < vuxnaDatum.length; i++) {
                        
                            System.out.println("Namn och datum på Vuxen "+ (i + 1));
                            System.out.print("Namn >");
                            String namn = t.nextLine();
                            System.out.print("Datum [YYYY-MM-DD]>");
                            String Datum = t.nextLine();
                            for(int k = 0; k < 3; k++){
                                vuxnaDatum[i][k] = Integer.parseInt(Datum.split("-")[k]);
                            }
                            vuxnaNamn[i] = namn; 
                    }
                    for (int i = 0; i < barnNamn.length; i++) {
                        
                        PrintPeople();
                        System.out.println("Plats för personen " + (i + 1));
                        System.out.print("> ");
                        int platsval;
                        
                            while (true) {
                                platsval = Integer.parseInt(t.nextLine());
                                if (platsval == PlatsID[platsval - 1]) {
                                    System.out.println("Redan tagen försök igen");
                                    System.out.print(">");
                                }else{
                                    break;
                                }
                            }
                            System.out.println(platsval);
                        PlatsID[platsval - 1] = platsval;
                        namn[platsval - 1] = barnNamn[i];
                        for (int j = 0; j < 3; j++) {
                            datum[platsval - 1][j] = barnDatum[i][j];
                        }

                        
                    }

                    for (int i = 0; i < vuxnaNamn.length; i++) {
                        
                        PrintPeople();
                        System.out.println("Plats för personen " + (i + 1));
                        System.out.print("> ");
                        int platsval;
                        
                            while (true) {
                                platsval = Integer.parseInt(t.nextLine());
                                if (platsval == PlatsID[platsval - 1]) {
                                    System.out.println("Redan tagen försök igen");
                                    System.out.print(">");
                                }else{
                                    break;
                                }
                            }
                            System.out.println(platsval);
                        PlatsID[platsval - 1] = platsval;
                        namn[platsval - 1] = vuxnaNamn[i];
                        for (int j = 0; j < 3; j++) {
                            datum[platsval - 1][j] = vuxnaDatum[i][j];
                        }
                        
                    }
                    pris += vuxnaDatum.length * 120;
                    
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
                    } catch (Exception e) {
                        continue mainloop;
                    }
                    break;
                case "2":
                    //visar platser som är upptagna
                    clearconsole();
                    PrintPeople();
                    System.out.println("Se mer[1] Gå tillbaka[2]");
                    int i = 0;
                    try {
                        i = Integer.parseInt(t.nextLine());
                    } catch (Exception e) {
                        continue mainloop;
                    }
                    
                    if (i == 1) {
                        for (int j = 0; j < PlatsID.length; j++) {
                            if (PlatsID[j] != 0) {
                                if (PlatsID[j] % 4 == 0) {
                                    System.out.println(
                                    "Plats ID: " + 
                                    (PlatsID[j]) + " Namn: " + 
                                    namn[PlatsID[j] - 1] + " FödelseDatum: " +
                                    datum[PlatsID[j] - 1][0] + "-" 
                                    + datum[PlatsID[j] - 1][1] + "-" 
                                    + datum[PlatsID[j] - 1][2] + " Fönsterplats"
                                    );   
                                }else{
                                    System.out.println(
                                    "Plats ID: " + 
                                    (PlatsID[j]) + " Namn: " + 
                                    namn[PlatsID[j] - 1] + " FödelseDatum: " +
                                    datum[PlatsID[j] - 1][0] + "-" 
                                    + datum[PlatsID[j] - 1][1] + "-" 
                                    + datum[PlatsID[j] - 1][2]
                                    );    
                                }
                                
                            }
                        }
                        clearconsole();
                        break;
                    }
                    if (i == 2) {
                        //clearar consolen
                        clearconsole(); 
                        break;
                    }
                    break;
                case "3":
                    System.out.println("Vilken plats vill du avboka");
                    System.out.println(">");
                    int plats;
                    try {
                        plats = Integer.parseInt(t.nextLine());
                    } catch (Exception e) {
                        continue mainloop;
                    }
                    PlatsID[plats - 1] = 0;
                    datum[plats - 1][0] = 0;
                    datum[plats - 1][1] = 0;
                    datum[plats - 1][2] = 0;
                    namn[plats - 1] = "";
                    break;
                case "4":
                    //stänger av programet
                    System.exit(1);
                    t.close();
                    break;
                default:
                    break;
            }
        }
            
    
    }
}