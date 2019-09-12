/*    */ package minigames;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Player
/*    */ {
/*    */   private String name;
/*    */   private String pawn;
/*    */   private int score;
/*    */   
/* 13 */   public int getScore() { return this.score; }
/*    */ 
/*    */ 
/*    */   
/* 17 */   public String getPawn() { return this.pawn; }
/*    */ 
/*    */ 
/*    */   
/* 21 */   public String getName() { return this.name; }
/*    */   
/*    */   public Player(String name, String pawn) {
/*    */     this.score = 0;
/* 25 */     this.name = name;
/* 26 */     this.pawn = pawn;
/*    */   }
/*    */   
/*    */   public void Win() {
/* 30 */     System.out.println(this.name + " has won!");
/* 31 */     this.score++;
/*    */   }
/*    */ 
/*    */   
/* 35 */   public String toString() { return this.name + " score : " + this.score; }
/*    */ }


/* Location:              C:\Users\Esther PC\Documents\MiniGames.jar!\minigames\Player.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */