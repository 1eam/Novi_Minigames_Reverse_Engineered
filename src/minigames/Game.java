/*    */ package minigames;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public abstract class Game
/*    */ {
/*  7 */   public static Scanner INPUT = new Scanner(System.in);
/*    */   
/*    */   private Player player1;
/*    */   
/*    */   private Player player2;
/*    */   
/*    */   protected Player currentPlayer;
/*    */   protected Field[] board;
/*    */   
/*    */   public Game(Player player1, Player player2) {
/* 17 */     this.player1 = player1;
/* 18 */     this.player2 = player2;
/* 19 */     this.currentPlayer = player1;
/*    */   }
/*    */ 
/*    */   
/*    */   public abstract void Play();
/*    */   
/* 25 */   protected void SwitchPlayer() { this.currentPlayer = (this.currentPlayer == this.player1) ? this.player2 : this.player1; }
/*    */ 
/*    */   
/*    */   protected boolean isFinished() {
/* 29 */     boolean finished = true;
/* 30 */     for (Field field : this.board) {
/* 31 */       if (!field.isSet()) {
/* 32 */         finished = false;
/*    */         break;
/*    */       } 
/*    */     } 
/* 36 */     return finished;
/*    */   }
/*    */   
/*    */   protected void PrintPlayers() {
/* 40 */     System.out.println(this.player1.toString());
/* 41 */     System.out.println(this.player2.toString());
/*    */   }
/*    */   
/*    */   protected abstract boolean isWon();
/*    */ }


/* Location:              C:\Users\Esther PC\Documents\MiniGames.jar!\minigames\Game.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */