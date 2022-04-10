public class Ship {

   
      private int length;
      private String name;
      private int id;
   
      
      public Ship (int l, String n, int i) {
         length = l;
         name = n;
         id = i;
      }
      
      public int getLength() {
         return length;
      }
      
      public void setLength() {
         length--;
         }
      
      public String getName() {
         return name;
      }
      
     public int getID() {
         return id;
      }
      
      
      
      public String toString() {
         return name + "Ship can take no more than " + length + " hits.";
}
}
