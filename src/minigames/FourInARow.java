/*     */ package minigames;
/*     */ 
/*     */ public class FourInARow
/*     */   extends Game
/*     */ {
/*     */   public int lastFieldSet;
/*     */   
/*     */   public FourInARow(Player player1, Player player2) {
/*   9 */     super(player1, player2);
/*     */     
/*  11 */     this.board = new Field[42];
/*  12 */     for (int i = 0; i < 42; i++) {
/*  13 */       this.board[i] = new Field(i + 1, ".");
/*     */     }
/*     */   }
/*     */   
/*     */   public void Play() {
/*  18 */     while (!isFinished()) {
/*     */       
/*  20 */       PrintBoard();
/*  21 */       System.out.println("Current player is: " + this.currentPlayer.getName());
/*  22 */       System.out.println("Choose a row:");
/*     */       
/*  24 */       int column = Game.INPUT.nextInt() - 1;
/*     */       
/*  26 */       if (column < 0 || column > 7) {
/*  27 */         System.out.println("There is no column at position " + (column + 1));
/*     */       }
/*  29 */       else if (AddToColumn(column)) {
/*  30 */         if (isWon()) {
/*  31 */           this.currentPlayer.Win();
/*     */           break;
/*     */         } 
/*  34 */         SwitchPlayer();
/*     */       } else {
/*     */         
/*  37 */         System.out.println("Field already taken, choose anothor one");
/*     */       } 
/*  39 */       System.out.println();
/*     */     } 
/*     */     
/*  42 */     System.out.println();
/*  43 */     PrintBoard();
/*  44 */     PrintPlayers();
/*     */   }
/*     */   
/*     */   private boolean AddToColumn(int column) {
/*  48 */     boolean result = false;
/*  49 */     for (int i = 5; i >= 0; i--) {
/*  50 */       if (this.board[column + 7 * i].setValue(this.currentPlayer.getPawn())) {
/*  51 */         this.lastFieldSet = column + 7 * i;
/*  52 */         result = true;
/*     */         break;
/*     */       } 
/*     */     } 
/*  56 */     return result;
/*     */   }
/*     */   
/*     */   private void PrintBoard() {
/*  60 */     for (int i = 0; i < 6; i++) {
/*  61 */       for (int j = 0; j < 7; j++) {
/*  62 */         System.out.print(this.board[i * 7 + j].toString() + " ");
/*     */       }
/*  64 */       System.out.println("");
/*     */     } 
/*  66 */     System.out.println("1 2 3 4 5 6 7");
/*  67 */     System.out.println();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isWon() {
/*  72 */     gameWon = (evaluateLeftFields() || evaluateRightFields());
/*  73 */     gameWon |= ((evaluateLeftDownFields() || evaluateRightDownFields()));
/*  74 */     return evaluateBottomFields();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean evaluateRightFields() {
/*  80 */     boolean result = false;
/*  81 */     if (this.lastFieldSet % 7 < 4) {
/*  82 */       result = true;
/*  83 */       for (int i = 0; i < 4; i++) {
/*  84 */         if (!this.board[this.lastFieldSet + i].getValue().equals(this.currentPlayer.getPawn())) {
/*  85 */           result = false;
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  90 */     return result;
/*     */   }
/*     */   
/*     */   private boolean evaluateLeftFields() {
/*  94 */     boolean result = false;
/*  95 */     if (this.lastFieldSet % 7 >= 3) {
/*  96 */       result = true;
/*  97 */       for (int i = 0; i < 4; i++) {
/*  98 */         if (!this.board[this.lastFieldSet - i].getValue().equals(this.currentPlayer.getPawn())) {
/*  99 */           result = false;
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 104 */     return result;
/*     */   }
/*     */   
/*     */   private boolean evaluateBottomFields() {
/* 108 */     boolean result = false;
/* 109 */     if (this.lastFieldSet / 7 < 3) {
/* 110 */       result = true;
/* 111 */       for (int i = 0; i < 4; i++) {
/* 112 */         if (!this.board[this.lastFieldSet + i * 7].getValue().equals(this.currentPlayer.getPawn())) {
/* 113 */           result = false;
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 118 */     return result;
/*     */   }
/*     */   
/*     */   private boolean evaluateLeftDownFields() {
/* 122 */     boolean result = false;
/* 123 */     if (this.lastFieldSet % 7 >= 3 && this.lastFieldSet / 7 < 3) {
/* 124 */       result = true;
/* 125 */       for (int i = 0; i < 4; i++) {
/* 126 */         if (!this.board[this.lastFieldSet + i * 6].getValue().equals(this.currentPlayer.getPawn())) {
/* 127 */           result = false;
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 132 */     return result;
/*     */   }
/*     */   
/*     */   private boolean evaluateRightDownFields() {
/* 136 */     boolean result = false;
/* 137 */     if (this.lastFieldSet % 7 < 4 && this.lastFieldSet / 7 < 3) {
/* 138 */       result = true;
/* 139 */       for (int i = 0; i < 4; i++) {
/* 140 */         if (!this.board[this.lastFieldSet + i * 8].getValue().equals(this.currentPlayer.getPawn())) {
/* 141 */           result = false;
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 146 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\Esther PC\Documents\MiniGames.jar!\minigames\FourInARow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */