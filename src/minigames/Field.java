/*    */ package minigames;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Field
/*    */ {
/*    */   private String value;
/*    */   private String defaultValue;
/*    */   private int location;
/*    */   
/*    */   public Field(int location) {
/* 14 */     this.location = location;
/* 15 */     this.defaultValue = this.value = location + "";
/*    */   }
/*    */   
/*    */   public Field(int location, String defaultValue) {
/* 19 */     this.location = location;
/* 20 */     this.defaultValue = this.value = defaultValue;
/*    */   }
/*    */ 
/*    */   
/* 24 */   public String getValue() { return this.value; }
/*    */ 
/*    */   
/*    */   public boolean setValue(String playerPawn) {
/* 28 */     if (isSet()) return false; 
/* 29 */     this.value = playerPawn;
/* 30 */     return true;
/*    */   }
/*    */ 
/*    */   
/* 34 */   public boolean isSet() { return (this.value != this.defaultValue); }
/*    */ 
/*    */ 
/*    */   
/* 38 */   public String toString() { return this.value; }
/*    */ }


/* Location:              C:\Users\Esther PC\Documents\MiniGames.jar!\minigames\Field.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */