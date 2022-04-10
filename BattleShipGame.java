import java.util.Scanner;
import java.util.ArrayList;
public class BattleShipGame {

   
   public static void main(String[] args) {
   System.out.println("Key:\n 1-5 = the ships, this is because of debug mode \n 8 = hit ship \n 6 = shot missed\n\n");
   String ship = "";
   int check = 0;
   String choice;
   Scanner in = new Scanner(System.in);
   int choice2;
   int ammunitions = 100;
   ArrayList<Ship> Navy = new ArrayList<Ship>();
   Navy.add(new Ship(5, "Aircraft Carrier", 1));
  Navy.add(new Ship(4, "Battleship", 2));
  Navy.add(new Ship(3, "Destroyer", 4));
  Navy.add(new Ship(3, "Submarine", 3));
  Navy.add(new Ship(2, "Patrolboat", 5));
  
   int value = 1;

 BattleShipBoard comBoard = new BattleShipBoard();
  
   BattleShipBoard playerBoard = new BattleShipBoard();
    while (check != 83) {
    check = 0;
    for (int r = 0; r < 10; r++){
      for (int c = 0; c < 10; c++){
      comBoard.setValue(r, c, 0);
      }
      }
       for (int i = 0; i < 5; i++) {
   comBoard.placeShip(Navy.get(i), comBoard);
   }
       for (int r = 0; r < 10; r++){
      for (int c = 0; c < 10; c++){
      int x = comBoard.getValue(r, c);
      if (x == 0) {
      check++;
      }
      }
      }
      }
      
              
   for (int i = ammunitions; i > 0; i--) { 
      int[][] player = new int[10][10];
      if (i % 2 == 0)
      System.out.println(comBoard);
      int x;
      System.out.print("Set Horizontal cordinates (A-J): \n");
      choice = in.nextLine();
   
      if (choice.equals("A") || choice.equals("a")){
        System.out.println("Cordinates set!");
        x = 0;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
            else {
            comBoard.setValue(x, choice2-1, 6);
            System.out.println("Volley did not connect\n");
            }
        
        
      } else if (choice.equals("B") || choice.equals("b")){
         System.out.println("Cordinates set!");
         x = 1;
         System.out.print("Set Vertical cordinates (1-10): ");
         choice2 = in.nextInt();
         player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
       
      } else if (choice.equals("C") || choice.equals("c")){
        System.out.println("Cordinates set!");
        x = 2;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
        
      } else if (choice.equals("D") || choice.equals("d")){
        System.out.println("Cordinates set!");
        x = 3;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
        
      } else if (choice.equals("E") || choice.equals("e")){
        System.out.println("Cordinates set!");
        x = 4;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
        
      } else if (choice.equals("F") || choice.equals("f")){
        System.out.println("Cordinates set!");
        x = 5;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
            
      } else if (choice.equals("G") || choice.equals("g")){
        System.out.println("Cordinates set!");
        x = 6;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
        
      } else if (choice.equals("H") || choice.equals("h")){
        System.out.println("Cordinates set!");
        x = 7;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
        
      } else if (choice.equals("I") || choice.equals("i")){
        System.out.println("Cordinates set!");
                 x = 8;
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
            
        
      } else if (choice.equals("J") || choice.equals("j")){
        System.out.println("Cordinates set!");
        x = 9;       
        System.out.print("Set Vertical cordinates (1-10): ");
        choice2 = in.nextInt();
        player[x][choice2-1] = 1;
         if (player[x][choice2-1] <= comBoard.getValue(x, choice2-1)) {
            System.out.println("Confirmed hit!");
            comBoard.setValue(x, choice2-1, 8); }
      }
      ammunitions--; 
      int carrierIntegrity = 0;
        int battleshipIntegrity = 0;
          int submarineIntegrity = 0;
            int destroyerIntegrity = 0;
              int patrolIntegrity = 0;
for (int r = 0; r < 10; r++){
      for (int c = 0; c < 10; c++){
      if (comBoard.getValue(r, c) == 1) {
      carrierIntegrity++;
      }
      if (comBoard.getValue(r, c) == 2) {
      battleshipIntegrity++;
      }
      if (comBoard.getValue(r, c) == 3) {
      submarineIntegrity++;
      }
      if (comBoard.getValue(r, c) == 4) {
      destroyerIntegrity++;
      }
      if (comBoard.getValue(r, c) == 5) {
      patrolIntegrity++;
      }
      }
      }
      if (ammunitions == 0)
      System.out.println("\nMission failure, enemy has naval superiority");
      if (carrierIntegrity == 0)
      System.out.println("Hostile Carrier Destroyed\n");
      if (battleshipIntegrity == 0)
      System.out.println("Hostile Battleship Destroyed\n");
      if (submarineIntegrity == 0)
      System.out.println("Hostile Submarine Destroyed\n");
      if (destroyerIntegrity == 0)
      System.out.println("Hostile Destroyer destroyed\n");
      if (patrolIntegrity == 0)
      System.out.println("Hostile Patrolboat Destroyed\n");
      if (carrierIntegrity == 0 && battleshipIntegrity == 0 && submarineIntegrity == 0 && destroyerIntegrity == 0 && patrolIntegrity == 0) {
      System.out.println("All enemy combatants destroyed. RTB");
      break;
      }
      }
      }
      
      }

