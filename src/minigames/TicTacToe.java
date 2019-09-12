/*    */ package minigames;
/*    */ 
/*    */ public class TicTacToe extends Game {
/*    */   private int[][] winStates;
/*    */   
/*    */   public TicTacToe(Player player1, Player player2) {
/*  7 */     super(player1, player2);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     this.winStates = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 }, { 1, 5, 9 }, { 3, 5, 7 } }; this.board = new Field[9]; for (int i = 0; i < 9; i++)
/*    */       this.board[i] = new Field(i + 1); 
/*    */   } public void Play() { while (!isFinished()) {
/*    */       PrintBoard(); System.out.println("Current player is: " + this.currentPlayer.getName()); System.out.println("Choose a field:"); int position = Game.INPUT.nextInt() - 1; if (position < 0 || position > 9) {
/*    */         System.out.println("There is no field at position " + (position + 1));
/*    */       } else if (this.board[position].setValue(this.currentPlayer.getPawn())) {
/*    */         if (isWon()) {
/*    */           this.currentPlayer.Win(); break;
/*    */         }  SwitchPlayer();
/*    */       } else {
/*    */         System.out.println("Field already taken, choose anothor one");
/*    */       }  System.out.println();
/*    */     }  System.out.println();
/*    */     PrintBoard();
/* 69 */     PrintPlayers(); } protected boolean isWon() { boolean gameWon = false;
/* 70 */     for (int[] winState : this.winStates) {
/* 71 */       if (EvaluateWinState(winState)) {
/* 72 */         gameWon = true;
/*    */         break;
/*    */       } 
/*    */     } 
/* 76 */     return gameWon; }
/*    */   private void PrintBoard() { for (int i = 0; i < 3; i++) {
/*    */       for (int j = 0; j < 3; j++)
/*    */         System.out.print(this.board[i * 3 + j].toString() + " ");  System.out.println("");
/* 80 */     }  System.out.println(); } private boolean EvaluateWinState(int[] winState) { boolean found = true;
/* 81 */     for (int field : winState) {
/* 82 */       if (!this.board[field - 1].getValue().equals(this.currentPlayer.getPawn())) {
/* 83 */         found = false;
/*    */         break;
/*    */       } 
/*    */     } 
/* 87 */     return found; }
/*    */ 
/*    */ }


/* Location:              C:\Users\Esther PC\Documents\MiniGames.jar!\minigames\TicTacToe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */