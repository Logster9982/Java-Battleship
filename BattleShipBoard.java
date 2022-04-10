public class BattleShipBoard extends Board {

      
      
      
      
      
      
      public String toString(){
         return "1 2 3 4 5 6 7 8 9 10\n\n" + super.toString();
         } 
         

public String help() {
        
        return "help";
        }
        
        
        
        public void placeShip(Ship s, BattleShipBoard comBoard) {
         int random = (int)(Math.random()*2);
            if (random == 1) {
            int r = (int)(Math.random()*9);
            int c = (int)(Math.random()*(7-s.getLength()));
            for (int i = 0; i < s.getLength(); i++) {
            comBoard.setValue(r, c + i, s.getID());
            }
            }
            
            else if (random == 0) {
            int c = (int)(Math.random()*9);
            int r = (int)(Math.random()*(7-s.getLength()));
            for (int i = 0; i < s.getLength(); i++) {
            comBoard.setValue(r + i, c, s.getID());
            }
}
         
}
      
      }