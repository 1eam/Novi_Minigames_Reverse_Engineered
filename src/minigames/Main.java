/*    */ package minigames;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Main
/*    */ {
/*    */   public static void main(String[] args) {
/* 18 */     System.out.println("Player 1, what is your name?");
/* 19 */     String name = Game.INPUT.nextLine();
/* 20 */     Player player1 = new Player(name, "X");
/*    */     
/* 22 */     System.out.println("Player 2, what is your name?");
/* 23 */     name = Game.INPUT.nextLine();
/* 24 */     Player player2 = new Player(name, "O");
/*    */     
/* 26 */     System.out.println();
/*    */     
/* 28 */     Game game = new TicTacToe(player1, player2);
/*    */ 
/*    */     
/*    */     label17: while (true) {
/* 32 */       System.out.println("What would you like to play");
/* 33 */       System.out.println("1: Tic Tac Toe");
/* 34 */       System.out.println("2: Four In A Row");
/* 35 */       System.out.println("0: Exit");
/*    */       
/* 37 */       int choice = Game.INPUT.nextInt();
/*    */ 
/*    */       
/*    */       while (true) {
/* 41 */         if (choice == 1) {
/* 42 */           game = new TicTacToe(player1, player2);
/* 43 */         } else if (choice == 2) {
/* 44 */           game = new FourInARow(player1, player2);
/*    */         } else {
/* 46 */           System.exit(0);
/*    */         } 
/*    */         
/* 49 */         game.Play();
/*    */         
/* 51 */         System.out.println();
/* 52 */         System.out.println("rematch? (Y/N)");
/*    */         
/* 54 */         String input = Game.INPUT.next();
/* 55 */         if (!input.toUpperCase().equals("Y"))
/*    */           continue label17; 
/*    */       } 
/*    */       break;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Esther PC\Documents\MiniGames.jar!\minigames\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */