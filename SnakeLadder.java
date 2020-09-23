public class SnakeLadder {
 public static final int START_POSITION=0;
 public static final int WIN_POSITION=100;
 public static final int NO_PLAY=1;
 public static final int LADDER_POS=2;
 public static final int SNAKE_POS=3;
 public static void main(String[] args) {
   int pos1=0, pos2=0, flag=0, count=0;
   while(flag==0) {
   int dieRollP1=(int)(Math.random()*6) + 1;
   System.out.println("Player1 Die Roll Number: "+dieRollP1);
   int player1Option= (int)(Math.random()*3) + 1;
   System.out.println("Player1 Option: "+player1Option);
   if(player1Option == LADDER_POS)
     pos1+=dieRollP1;
   if(player1Option == SNAKE_POS)
     pos1-=dieRollP1;
   if(pos1<0)
     pos1=0;
   if(pos1>100)
     pos1-=dieRollP1;
   System.out.println("Player1 Position: "+pos1);
   if(pos1==WIN_POSITION)
    {
       flag=1;
       System.out.println("PLAYER-1 WON");
       break;
    }
    if(player1Option == LADDER_POS)
      continue;
    else {
      int dieRollP2=(int)(Math.random()*6) + 1;
      System.out.println("Player2 Die Roll Number: "+dieRollP2);
      int player2Option= (int)(Math.random()*3) + 1;
      System.out.println("Player2 Option: "+player2Option);
      if(player2Option == LADDER_POS)
        pos2+=dieRollP2;
      if(player2Option == SNAKE_POS)
        pos2-=dieRollP2;
      if(pos2<0)
        pos2=0;
      if(pos2>100)
        pos2-=dieRollP2;
      System.out.println("Player2 Position: "+pos2);
      if(pos2==WIN_POSITION)
      {
         flag=1;
         System.out.println("PLAYER-2 WON");
         break;
      }
      if(player2Option == LADDER_POS)
      continue;
   }
    count++;
  }
   System.out.println("Player Won after: "+count+" Count");
 }
}