
import java.awt.*;
import javax.swing.*;


public class test extends JFrame {
    
  public int GRID[][][] = new int[8][8][2];
  
    
  public static void main(String[] arguments) {
    buttons buttons[] = new buttons[64];
  //  MyPanel panel = new MyPanel();
    //panel.setSize(500,520);
    // create a basic JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Checkers");
    frame.setSize(500,520);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   // panel.setLayout(new GridLayout(8,8));
    
  //  frame.add(panel);
 
    frame.setVisible(true);
    
    int GRID[][][] = new int[8][8][2];
    
    // [1=whitebg 2=graybg] [1 = blackpiece 2 = redpeice]
    
    for (int rowcount = 0 ;rowcount<8; rowcount+=2){
            for (int columncount = 0; columncount<8; columncount++){
                int type = 0;
                if (columncount%2==0){
                     GRID[rowcount][columncount][0] = 1;
                }
                else {
                     GRID[rowcount][columncount][0] = 2;
                }
                
                if (columncount % 2 == 0 && rowcount<3){
                    GRID[rowcount][columncount][1] = 1;
                }
                else if (columncount % 2 == 0 && rowcount>4){
                    GRID[rowcount][columncount][1] = 2;
                }
            
            }
        
        
        }
        for (int rowcount = 1 ;rowcount<8; rowcount+=2){
            for (int columncount = 0; columncount<8; columncount++){
                if (columncount%2==0){
                    GRID[rowcount][columncount][0] = 2;
                }
                else {
                    GRID[rowcount][columncount][0] = 1;
                }
                if (columncount % 2 == 0 && rowcount<3){
                    GRID[rowcount][columncount][1] = 1;
                    
                }
                else if (columncount % 2 == 0 && rowcount>4){
                    GRID[rowcount][columncount][1] = 2;
                }
            }
        }
    
       
       GridLayout experimentLayout = new GridLayout(0,2);


       // compsToExperiment.setLayout(experimentLayout);

        //compsToExperiment.add(new JButton("Button 1"));
        //compsToExperiment.add(new JButton("Button 2"));
       // compsToExperiment.add(new JButton("Button 3"));
       // compsToExperiment.add(new JButton("Long-Named Button 4"));
        //compsToExperiment.add(new JButton("5"));

 
  }
}
 

/*class MyPanel extends JPanel {
   public void paint(Graphics g) {
       for (int row = 0; row<8; row++){     
        for (int col = 0; col<8;col++){      
            
            
            
            g.setColor(Color.BLACK);
            g.fillOval(15, 15, 30, 30);
            g.drawOval(15, 15, 30, 30);
                
            g.setColor(Color.RED);
            g.fillOval(15, 15, 30, 30);
            g.drawOval(15, 15, 30, 30);
      
        
        }
       }
      
       
       
       for (int i = 0; i<4; i++){     
        for (int j = 0; j<2;j++){    
            g.setColor(Color.white);
            g.fillRect(10,120*i+10,60,60);

            g.fillRect(130,120*i+10,60,60);

            g.fillRect(250,120*i+10,60,60);

            g.fillRect(370,120*i+10,60,60);

            g.setColor(Color.lightGray);
            g.fillRect(70,120*i+10,60,60);

            g.fillRect(190,120*i+10,60,60);

            g.fillRect(310,120*i+10,60,60);

            g.fillRect(430,120*i+10,60,60);

            g.setColor(Color.lightGray);
            g.fillRect(10,120*i+70,60,60);

            g.fillRect(130,120*i+70,60,60);

            g.fillRect(250,120*i+70,60,60);

            g.fillRect(370,120*i+70,60,60);

            g.setColor(Color.white);
            g.fillRect(70,120*i+70,60,60);

            g.fillRect(190,120*i+70,60,60);

            g.fillRect(310,120*i+70,60,60);

            g.fillRect(430,120*i+70,60,60);
            
        }
    }
        g.setColor(Color.BLACK);
       g.fillOval(17, 17, 45, 45);
      
   }
}

class Data{
    //this has pretty much the code for the matrix version;
    private int[][] GRID;
    
    public void CheckersData() {
      GRID = new int[8][8];
      setUpGame();
   }
    
    public void setUpGame(){

    }

}*/
/* if (row%2==col%2){
                 g.setColor(Color.white);   
            }
            else {
                g.setColor(Color.lightGray);
            }
            
            switch (board.pieceAt(row,col)) {
                case CheckersData.RED:
                   g.setColor(Color.red);
                   g.fillOval(4 + col*20, 4 + row*20, 16, 16);
                   break;
                case CheckersData.BLACK:
                   g.setColor(Color.black);
                   g.fillOval(4 + col*20, 4 + row*20, 16, 16);
                   break;
                case CheckersData.RED_KING:
                   g.setColor(Color.red);
                   g.fillOval(4 + col*20, 4 + row*20, 16, 16);
                   g.setColor(Color.white);
                   g.drawString("K", 7 + col*20, 16 + row*20);
                   break;
                case CheckersData.BLACK_KING:
                   g.setColor(Color.black);
                   g.fillOval(4 + col*20, 4 + row*20, 16, 16);
                   g.setColor(Color.white);
                   g.drawString("K", 7 + col*20, 16 + row*20);
                   break;
             }
            
            
            */