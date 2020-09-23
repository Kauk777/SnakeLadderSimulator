public class SnakeLadder {
 public static final int START_POSITION=0;
 public static final int WIN_POSITION=100;
 public static final int NO_PLAY=1;
 public static final int LADDER_POS=2;
 public static final int SNAKE_POS=3;
 public static void main(String[] args) {
   int pos=0, flag=0, count=0;
   while(flag==0) {
   int dieRoll=(int)(Math.random()*6) + 1;
   System.out.println("Die Roll Number: "+dieRoll);
   int playerOption= (int)(Math.random()*3) + 1;
   System.out.println("Option: "+playerOption);
   if(playerOption == LADDER_POS)
     pos+=dieRoll;
   if(playerOption == SNAKE_POS)
     pos-=dieRoll;
   if(pos<0)
     pos=0;
   if(pos>100)
     pos-=dieRoll;
   System.out.println("Position: "+pos);
   if(pos==WIN_POSITION)
    {
       flag=1;
       System.out.println("PLAYER WON");
       break;
    }
    count++;
  }
   System.out.println("Player Won after: "+count+" Count");
 }
}