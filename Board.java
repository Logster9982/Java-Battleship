public class Board{

 private int[][] board = new int [10][10];
  
  
  public int getValue (int r, int c){
   return board [r][c];
   }
  
  public void setValue (int r, int c, int value){
   board[r][c] = value;
   }
     
  public String toString(){
   String s = "";//edit this to make it work
   for (int r = 0; r < board.length; r++){
      for (int c = 0; c < board[0].length; c++){
         s+= board[r][c] + " ";
         }
         if (r == 0) {
            s+= " A \n"; }
         else if (r == 1) {
            s+= " B \n"; }
         else if (r == 2) {
            s+= " C \n"; }
         else if (r == 3) {
            s+= " D \n"; }
         else if (r == 4) {
            s+= " E \n"; }
         else if (r == 5) {
            s+= " F \n"; }
         else if (r == 6) {
            s+= " G \n"; }
         else if (r == 7) {
            s+= " H \n"; }
         else if (r == 8) {
            s+= " I \n"; }
         else if (r == 9) {
            s+= " J \n"; }
      }
   return s;
   }
   
                       
   
   public int[][] getBoard() {
      return board;
      
      
      
   }
}