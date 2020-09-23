public class SnakeLadder {
 public static final int START_POSITION=0;
 public static final int NO_PLAY=1;
 public static final int LADDER_POS=2;
 public static final int SNAKE_POS=3;
 public static void main(String[] args) {
   int pos=0;
   int dieRoll=(int)(Math.random()*6) + 1;
   System.out.println("Die Roll Number: "+dieRoll);
   int playerOption= (int)(Math.random()*3) + 1;
   System.out.println("Option: "+playerOption);
   if(playerOption == LADDER_POS)
     pos+=dieRoll;
   if(playerOption == SNAKE_POS)
     pos-=dieRoll;
   System.out.println("Position: "+pos);
 }
}