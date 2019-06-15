/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package culm;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

/**
 *
 * @author bro
 */

public class test6 extends JFrame implements ActionListener{
    JButton buttons[][]=new JButton[8][8]; // this creates an empty array of buttons
    
    
    public BufferedImage BLUE = new BufferedImage(55, 55, BufferedImage.TYPE_INT_ARGB); //this allows for the drawing on the buttons and draws Blue piece later
    public Graphics2D g2 = BLUE.createGraphics(); //creates new graphic g2 which can now allow drawing on the button
           
    public BufferedImage ORANGE = new BufferedImage(55, 55, BufferedImage.TYPE_INT_ARGB);//this allows for the drawing on the buttons and draws Orange piece later
    public Graphics2D g = ORANGE.createGraphics(); //creates new graphic g which can now allow drawing on the button
         
    public BufferedImage BLUEKING = new BufferedImage(55, 55, BufferedImage.TYPE_INT_ARGB);//this allows for the drawing on the buttons and draws BlueKing piece later
    public Graphics2D g3 = BLUEKING.createGraphics(); //creates new graphic g3 which can now allow drawing on the button
    
    public BufferedImage ORANGEKING = new BufferedImage(55, 55, BufferedImage.TYPE_INT_ARGB);//this allows for the drawing on the buttons and draws OrangeKing piece later
    public Graphics2D g4 = ORANGEKING.createGraphics(); //creates new graphic g4 which can now allow drawing on the button
    
    boolean win = false; //boolean that will be true if either Blue or Orange Wins
    int clickedfirstX = -1, clickedfirstY = -1; //sets the og clicked variables to their original state
    int countB; //counts blue pieces
    int countO; //counts Orange pieces
    boolean turn = false; //boolean that determines turn: TRUE->BLUE FALSE->ORANGE
    boolean pt[][][] = new boolean[8][8][4]; //this is the main array, true= piece there
    //floor 0 = both Blue and Orng pieces |floor 1 = blue pieces |floor 2 = orng pieces |floor 3 = kings on both
    //imagine looking at the array from the top, where each floor is a new layer 
    
    public test6(String name) { //new method to make title on the screen that pops up
        super(name); //puts the name you want on the top : Checkers
        setResizable(false); //doesnt let you resize
    }
    
    
    
    public void addComponentsToPane(final Container pane) {//this is another method that adds stuff to the frame
       
        JPanel controls = new JPanel(); //makes new panel that allows us to but buttons
        controls.setLayout(new GridLayout(8,8)); //makes the panel seperated into 64 buttons
        
        
       
         
        
        
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //sets final stage for the buttons BLUE
         g2.setColor(Color.BLUE); //sets color blue
         g2.fillOval(12, 12, 30, 30); //draws blue oval
         g2.setColor(Color.BLACK); //sets color black
         g2.drawOval(12, 12, 30, 30); //draws black outline
         g2.dispose(); //frees up space and makes the graphic part of the button
         
         
         g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  //sets final stage for the buttons ORANGE
         g.setColor(Color.ORANGE); //sets color to orange
         g.fillOval(12, 12, 30, 30); //draws orange oval
         g.setColor(Color.BLACK); // sets color to black
         g.drawOval(12, 12, 30, 30); //draws outline in black
         g.dispose(); //frees up space and makes the graphic part of the button
         
         g3.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  //sets final stage for the buttons BLUEKing
         g3.setColor(Color.black); //sets color to black 
         g3.fillOval(12, 12, 30, 30); //draws black oval
         g3.setColor(Color.cyan); //sets color cyan
         g3.drawOval(12, 12, 30, 30); //draws cyan border
         g3.dispose(); //frees up space and makes the graphic part of the button
                
         g4.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  //sets final stage for the buttons ORANGEKing
    
         g4.setColor(Color.red); //sets color red
         g4.fillOval(12, 12, 30, 30); //draws red oval 
         g4.setColor(Color.ORANGE); //sets color orange
         g4.drawOval(12, 12, 30, 30); //draws orange border
         g4.dispose(); //frees up space and makes the graphic part of the button
    
                
         
         
        for (int y= 0; y< 8; y++) { //starts a for loop that goes across and corresponds to y coordinate
            for (int x = 0; x<8;x++){ //starts a for loop that goes across and corresponds to x coordinate
                
                buttons[y][x] = new JButton(""); //creates and labels a button at [y][x] blank 
                
               
                buttons[y][x].setPreferredSize(new Dimension(60, 60)); //sets size of the squares
                
                if (y%2 == x%2){ //gets all the right squares in the checkers pattern 
                   
                    buttons[y][x].setVisible(true); //sets the button to be seen (default color is white)
                    buttons[y][x].addActionListener(this); //adds a thing that listens for a click on the buttons
                    if (y<=2){ //if its in the top 3 rows
                        
                        
                        buttons[y][x].setIcon(new ImageIcon(BLUE)); //sets buttons at [y][x] to be the new graphic we just made
                        pt[y][x][0]=true; // says there is a piece there
                        pt[y][x][1]=true; // its a blue piece
                        pt[y][x][2]=false; // not orange
                        pt[y][x][3]=false; // not king yet
                    }
                    else if (y>=5 && y<8){ //bottom three rows
                        
        
                        
                        buttons[y][x].setIcon(new ImageIcon(ORANGE)); //sets buttons[y][x] to be the new Orange graphic
                        pt[y][x][0]=true; //there is a piece there
                        pt[y][x][1]=false; //not blue
                        pt[y][x][2]=true; //is orange
                        pt[y][x][3]=false; //not king yet
                    }
                    
                    else{
                        pt[y][x][0]=false; //no piece there
                        pt[y][x][1]=false; //not blue
                        pt[y][x][2]=false; //not orange
                        pt[y][x][3]=false; //not king
                    }
                    
     
                }
                
                else { //all other squares
                    buttons[y][x].setBackground(Color.lightGray); //sets the color to invisible
                    buttons[y][x].setOpaque(true); //sets invisible
                    buttons[y][x].setBorderPainted(false); //sets no border
                    
                    
                }
               controls.add(buttons[y][x]); //finally adds the button
              
            } 
        }
        
        
       
        
        
       
        pane.add(controls, BorderLayout.SOUTH); //adds the buttons and a border on the bottom of the screen
    }
    
    int[] diff = new int[2]; //makes an actually useful array that is the yx coordinate of the difference of the clicked buttons (right is one square over = -1 etc)
    @Override //alllows it to be done at any time
    public void actionPerformed(ActionEvent ae){ //special method for button clicked
        countB = 0; //sets 0 Blue peice
        countO = 0; //sets 0 Orange 
        for (int y =0; y<8; y++){ //this for loop sets up the y 
            for (int x  = 0; x < 8;x++){ //thid for loop sets up the x
                if (pt[y][x][1] || pt[y][x][2]||pt[y][x][3]){ //checks for blue piece or orange piece or king at specific square
                    if (pt[y][x][1]||(pt[y][x][1]&&pt[y][x][3])){ //checks  for blue piece or blue king
                        countB ++; //it it is then count b count up
                    }
                    else if (pt[y][x][2]||(pt[y][x][2]&&pt[y][x][3])){ //checks for orange piece or king
                        countO ++; //adds count to orange if yes
                    }
                }
            }
        }
        
        if (countB == 0){//if there are no blue pieces
            System.out.println("ORANGE WINS"); //orange wins
        }
        if (countO==0){ //if there are no orange pieces
            System.out.println("BLUE WINS"); //blue wins
        }
        
        for (int y =0; y<8; y++){ //sets up y coordinate for loop
            for (int x =0; x<8; x++){ //sets up x coordinate in the while
                if (clickedfirstX==-1&&clickedfirstY==-1&&buttons[y][x].equals(ae.getSource())){ //if the clicked first is in original position and the button is the yx coordinate
                    if (canmove(y, x)){ //checks if they can move
                        //sets og coordinate to what they actully just clicked
                        clickedfirstX = x;                        
                        clickedfirstY = y;
                        
                     }
                    if (pt[y][x][3]&&pt[y][x][1]){ //if the piece clickedwas a blue king then it does this
                                    buttons[y][x].setIcon(null); //removes blue piece picture
                                    buttons[y][x].setIcon(new ImageIcon(BLUEKING)); //sets to a picture of a king piece
                                    pt[y][x][3] = true;  //sets king there true
                                    
                    }
                    if (pt[y][x][3]&&pt[y][x][2]){ // if the piece clicked was orange king then it does this
                                    buttons[y][x].setIcon(null); // removes orange
                                    buttons[(y)][(x)].setIcon(new ImageIcon(ORANGEKING)); // adds orange king
                                    pt[y][x][3] = true; //sets king there true
                                    
                    }
                }
            }    
        }    
        for (int y =0; y<8; y++){ //sets for loop up for y
            for (int x =0; x<8; x++){ //sets for loop up for x
                
                if (clickedfirstX!=-1&&clickedfirstY!=-1&&buttons[y][x].equals(ae.getSource())){ // if this is the second button clicked and responds to the correct button
                    if (clickedfirstX==x){ //if you clicked the same button
                        break; //exits loop
                    }
                    diff[0] = y - clickedfirstY; // find difference in y coord and stores it
                    diff[1] = x - clickedfirstX; // find difference in x coord and stores it
                    
                    if ((diff[0]==1||diff[0]==-1)&&(diff[1]==1||diff[1]==-1)&&canmove(clickedfirstY,clickedfirstX)){ //if the difference is +-1 for x and y and it was allowed to move
                        if ((pt[clickedfirstY][clickedfirstX][1]||pt[clickedfirstY][clickedfirstX][3])&&!pt[y][x][0]){    //check if the piece is blue or orange king and if there is already a piece there
                            if (diff[0]>0){ //if they are moving backward
                                if (pt[clickedfirstY][clickedfirstX][3]&&pt[clickedfirstY][clickedfirstX][1]&&turn){ //checks for king and blue and its blue turn
                                    buttons[clickedfirstY][clickedfirstX].setIcon(null); //sets icon blank
                                    pt[clickedfirstY][clickedfirstX][0] = false; //says no  piece at original coordinates
                                    pt[y][x][0] = true; //says there is a piece at curent coordinates
                                    buttons[y][x].setIcon(null); //removes any icon on the current
                                    buttons[(y)][(x)].setIcon(new ImageIcon(BLUEKING)); //replaces the icon with blueking
                                    pt[clickedfirstY][clickedfirstX][1] = false; //sets original position false for blue
                                    pt[y][x][1] = true; //sets new coordinate true blue
                                    pt[clickedfirstY][clickedfirstX][3] = false; //sets king there false
                                    pt[y][x][3] = true; //sets king coordinate true for king
                                    turn = false; //sets orange turn
                                }
                                else if (pt[clickedfirstY][clickedfirstX][3]&&pt[clickedfirstY][clickedfirstX][2]&&!turn){ //if its orange turn and there was orange king there
                                    buttons[clickedfirstY][clickedfirstX].setIcon(null); //sets icon blank
                                    pt[clickedfirstY][clickedfirstX][0] = false; //sets peice there false
                                    pt[y][x][0] = true; //sets piece there at new coordinates
                                    buttons[y][x].setIcon(null); //sets icon at new coord false
                                    buttons[(y)][(x)].setIcon(new ImageIcon(ORANGEKING)); //sets icon at new coord orange king
                                    pt[clickedfirstY][clickedfirstX][2] = false; //sets orange peice at old coord false
                                    pt[y][x][2] = true; //sets current coord orange true
                                    pt[clickedfirstY][clickedfirstX][3] = false; //sets old coord king val false
                                    pt[y][x][3] = true; // set new coord value true for king
                                    turn = true; //sets blue turn
                                }
                                else if (turn&&!pt[clickedfirstY][clickedfirstX][3]){ //if its blues turn and not king
                                    buttons[clickedfirstY][clickedfirstX].setIcon(null); //sets clicked first icon null
                                    pt[clickedfirstY][clickedfirstX][0] = false; //sets clicked first coordinates false
                                    pt[y][x][0] = true; //sets new coordinates true
                                    buttons[y][x].setIcon(null); //sets new coord icon null
                                    buttons[(y)][(x)].setIcon(new ImageIcon(BLUE)); //sets new coord icon blue
                                    pt[y][x][1] = true; //sets new coord blue true
                                    pt[clickedfirstY][clickedfirstX][1] = false; //sets old coord blue false
                                    turn = false; //sets orange turn
                                }
                                repaint(); //repaints the graphics
                                
                                
                            }
                            
                        }
                        
                            
                            
                        if ((pt[clickedfirstY][clickedfirstX][2]||pt[clickedfirstY][clickedfirstX][3])&&!pt[y][x][0]){ //if its orng or king and there isnt a piece in the next position
                            if (diff[0]<0){ // if its going forwards
                                
                                
                                if (pt[clickedfirstY][clickedfirstX][3]&&pt[clickedfirstY][clickedfirstX][1] && turn){ //if its a blue piece and its a king and its blue turns
                                    //replaces the icons to the new coord
                                    //replaces the information in the array with the new coordinates
                                    //sets turn to orange
                                    buttons[clickedfirstY][clickedfirstX].setIcon(null); 
                                    pt[clickedfirstY][clickedfirstX][0] = false;
                                    pt[y][x][0] = true;
                                    buttons[y][x].setIcon(null);
                                    buttons[(y)][(x)].setIcon(new ImageIcon(BLUEKING));
                                    pt[clickedfirstY][clickedfirstX][3] = false;
                                    pt[y][x][3] = true;
                                    pt[clickedfirstY][clickedfirstX][1] = false;
                                    pt[y][x][1] = true;
                                    turn = false;
                                    
                                }
                                else  if (pt[clickedfirstY][clickedfirstX][3]&&pt[clickedfirstY][clickedfirstX][2]&&!turn){ //if its orange king
                                    //replaces the icons to the new coord
                                    //replaces the information in the array with the new coordinates
                                    //sets turn to blue
                                    buttons[clickedfirstY][clickedfirstX].setIcon(null);
                                    pt[clickedfirstY][clickedfirstX][0] = false;
                                    pt[y][x][0] = true;
                                    buttons[y][x].setIcon(null);
                                    buttons[(y)][(x)].setIcon(new ImageIcon(ORANGEKING));
                                    pt[clickedfirstY][clickedfirstX][3] = false;
                                    pt[y][x][3] = true;
                                    pt[clickedfirstY][clickedfirstX][2] = false;
                                    pt[y][x][2] = true;
                                    turn = true;
                                }
                                else if (!turn&&!pt[clickedfirstY][clickedfirstX][3]){ //orange piece and orange turn
                                    //replaces the icons to the new coord
                                    //replaces the information in the array with the new coordinates
                                    //sets turn to blue
                                    buttons[clickedfirstY][clickedfirstX].setIcon(null);
                                    pt[clickedfirstY][clickedfirstX][0] = false;
                                    pt[y][x][0] = true;
                                    buttons[y][x].setIcon(null);
                                    buttons[(y)][(x)].setIcon(new ImageIcon(ORANGE));
                                    pt[clickedfirstY][clickedfirstX][2] = false;
                                    pt[y][x][2] = true;
                                    turn = true;
                                }
                                repaint(); //repaints the graphics
                            }
                            
                                
                        }
                    }
                    else if ((diff[0] == 2 || diff[0]==-2)&&(diff[1]==2||diff[1]==-2)&&canmove(clickedfirstY,clickedfirstX)){ //if piece clicked is +-2 away(jump)
                        if (pt[clickedfirstY][clickedfirstX][1]){ //is blue
                            if (capture && !pt[clickedfirstY][clickedfirstX][3]&&turn){ //if it can capture and its blue and not a king
                                //replaces the icons to the new coord
                                //replaces the information in the array with the new coordinates
                                //lets capture if can go again
                                buttons[clickedfirstY][clickedfirstX].setIcon(null);
                                buttons[y-diff[0]/2][x-diff[1]/2].setIcon(null);
                                pt[y-diff[0]/2][x-diff[1]/2][0] = false; 
                                pt[y-diff[0]/2][x-diff[1]/2][2] = false;
                                pt[y][x][0] = true;
                                pt[clickedfirstY][clickedfirstX][0] = false;
                                pt[clickedfirstY][clickedfirstX][1] = false;
                                pt[y][x][1] = true;
                                buttons[y][x].setIcon(null);
                                buttons[(y)][(x)].setIcon(new ImageIcon(BLUE));
                              
                                repaint(); // repaints the graphics
                                    if (canmove(y,x)){ // checks capture again
                                        if (capture){ 
                                            turn = true;
                                        }
                                        else if(!capture){
                                            turn = false;
                                        }
                                    }
                                capture = false;
                                }
                            else if (pt[clickedfirstY][clickedfirstX][3]&&turn){ //if king and blue
                                    //replaces the icons to the new coord
                                    //replaces the information in the array with the new coordinates
                                    //lets capture again if it can
                                    buttons[clickedfirstY][clickedfirstX].setIcon(null);
                                    buttons[y-diff[0]/2][x-diff[1]/2].setIcon(null);
                                    pt[y-diff[0]/2][x-diff[1]/2][0] = false;
                                    pt[y-diff[0]/2][x-diff[1]/2][2] = false;
                                    pt[y][x][0] = true;
                                    pt[clickedfirstY][clickedfirstX][0] = false;
                                    pt[clickedfirstY][clickedfirstX][1] = false;
                                    pt[y][x][1] = true;
                                    buttons[(y)][(x)].setIcon(new ImageIcon(BLUEKING));
                                    pt[clickedfirstY][clickedfirstX][3] = false;
                                    pt[y][x][3] = true;
                                    repaint();
                                    turn = false;
                                    if (canmove(y,x)){ //checks can move again
                                        if (capture){ 
                                            turn = true;
                                        }
                                        else if(!capture){
                                            turn = false;
                                        }
                                    }
                                capture = false;
                                
                                    
                                }
                        }
                        if (pt[clickedfirstY][clickedfirstX][2]){ //if old coordinate is an orange peice
                            if (capture && !pt[clickedfirstY][clickedfirstX][3]&&!turn){ //orange turn and can capture and not king
                                //replaces the icons to the new coord
                                //replaces the information in the array with the new coordinates
                                //sets turn to orange
                                buttons[clickedfirstY][clickedfirstX].setIcon(null);
                                buttons[y-diff[0]/2][x-diff[1]/2].setIcon(null);
                                pt[y-diff[0]/2][x-diff[1]/2][0] = false;
                                pt[y-diff[0]/2][x-diff[1]/2][1] = false;
                                pt[clickedfirstY][clickedfirstX][0] = false;
                                pt[y][x][0] = true;
                                pt[clickedfirstY][clickedfirstX][2] = false;
                                pt[y][x][2] = true;
                                buttons[y][x].setIcon(null);
                                buttons[(y)][(x)].setIcon(new ImageIcon(ORANGE));
                               
                                repaint();
                                if (canmove(y,x)){ //checks can move
                                        if (capture){ 
                                            turn = false;
                                        }
                                        else if(!capture){
                                            turn = true;
                                        }
                                }
                                capture = false;
                            }
                            else if (pt[clickedfirstY][clickedfirstX][3]&&!turn){ //if its king and orange turn
                                //replaces the icons to the new coord
                                //replaces the information in the array with the new coordinates
                                //sets turn to orange
                                buttons[clickedfirstY][clickedfirstX].setIcon(null);
                                buttons[y-diff[0]/2][x-diff[1]/2].setIcon(null);
                                pt[y-diff[0]/2][x-diff[1]/2][0] = false;
                                pt[y-diff[0]/2][x-diff[1]/2][1] = false;
                                pt[clickedfirstY][clickedfirstX][0] = false;
                                pt[y][x][0] = true;
                                pt[clickedfirstY][clickedfirstX][2] = false;
                                pt[y][x][2] = true;
                                buttons[(y)][(x)].setIcon(new ImageIcon(ORANGEKING));
                                pt[clickedfirstY][clickedfirstX][3] = false;
                                pt[y][x][3] = true;
                                repaint();
                               
                                if (canmove(y,x)){ //checks can move again
                                        if (capture){ 
                                            turn = false;
                                        }
                                        else if(!capture){
                                            turn = true;
                                        }
                                    }
                                capture = false;
                                
                            }
                        }
                    }
                        clickedfirstX = -1; //sets the clicked first variable back to -1 X
                        clickedfirstY = -1; //sets the clicked first variable back to -1 Y
                }
            }
            
            }
        
                                 
    }
    
    public boolean capture = false; //makes capture varibale true or false
    
    public boolean canmove(int fy, int fx){ //method can move checks if you can move with specific coordinates
        if (fy == 0 || fy == 7){ //if its on the front or back rows
            if (pt[fy][fx][2]&&fy == 0){ //if its orange on the blue back line
                pt[fy][fx][3] = true; //its now king
                
            }
            if (pt[fy][fx][1]&&fy == 7){ //if its blue on the orange back line
                pt[fy][fx][3] = true; //its now king
                
            }
        }
        boolean val = false; //makes val
        capture = false; //makes capture false
        if (pt[fy][fx][1]||(pt[fy][fx][3]&&pt[fy][fx][2])){ //if its blue or orange king
           if (fx<7 && fy<7){ //if its less than the bottom right corner
            if (!pt[fy+1][fx+1][0]){ //if there is no piece there bottom right from it
               val = true; //sets value true
            } 
            else if (pt[fy+1][fx+1][2]||(pt[fy][fx][3]&&pt[fy][fx][2]&&pt[fy+1][fx+1][1])){ //if orange down right or its blue down right w/ orange king
                if (fx<6 && fy<6){ //if is not to far close to the edge
                    if (!pt[fy+2][fx+2][0]){ //if there isno piece there
                        //allows move and capture
                        capture = true;
                        val = true;
                    }
                }
            }
           }
           if (fx>0 && fy<7){ // says its not in bottom left
               if (!pt[fy+1][fx-1][0]){ //there is no piece there bottom left of the piece
                   //sets move true
                   val = true; 
                }
                else if (pt[fy+1][fx-1][2]||(pt[fy][fx][3]&&pt[fy][fx][2]&&pt[fy+1][fx-1][1])){ //if there is orange there, or its a blue and orange king
                   if (fx>1 && fy<6){ //makes sure its in bounds for jump
                       if(!pt[fy+2][fx-2][0]){ //if there is no piece thtere at the jump locale
                           //sets apture and val to true
                           capture = true;
                           val = true;
                       }
                   }
               }
           }
       }
       if(pt[fy][fx][2]||((pt[fy][fx][3]&&pt[fy][fx][1]))){ //is orange or blue king
           if (fx<7 && fy>0){ //in range
                if (!pt[fy-1][fx+1][0]){ //no piece at new spot
                    //sets val true
                    val = true;
                }
                else if (pt[fy-1][fx+1][1]||(pt[fy][fx][3]&&pt[fy][fx][1]&&pt[fy-1][fx+1][2])){ //if its a blue piece getting captured or an orange with a blue king
                    if (fx<6 && fy > 1){ //in rnage for jump
                        if (!pt[fy-2][fx+2][0]){ //no piece at jump
                            //sets capture and move true
                            capture = true;
                            val = true;
                        }
                    }
                }
           }
           if (fx>0 && fy>0){  //in range  
                if (!pt[fy-1][fx-1][0]){ //no piece in front
                    //lets move
                    val = true;
                }
                else if (pt[fy-1][fx-1][1]||(pt[fy][fx][3]&&pt[fy][fx][1]&&pt[fy-1][fx-1][2])){ //is blue getting caputred or is orange by a blue piece
                    if (fx>1&&fy>1){ //in range
                        if (!pt[fy-2][fx-2][0]){ //no piece there
                            //lets capture and move
                            capture = true;
                            val = true;
                        }
                }
           }
           }
                
       }
        
        return val; //returns for the method
    }
    
    
    private static void createAndShowGUI() { //method to show frame
        test6 frame = new test6("Hodge Checkers"); //title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets exit out
        frame.addComponentsToPane(frame.getContentPane()); //adds stuff to the panel
        frame.pack(); //shows frame
        frame.setVisible(true);// shows frame
    }

    
    public static void main(String[] args) { //main loop calls everything
        
        System.out.print("Welcome to Hodge Checkers, there are standard and non standard rules in this game: "
       + "\n1. ORANGE goes first then BLUE." + "\n2.You can get another turn if you capture twice in a row if you can capture again." + "\n3. It's a click and turn based game, play fair." + "\n4. Have Fun!\n\n");
        javax.swing.SwingUtilities.invokeLater(new Runnable() { //does this after everything is loaded
            public void run() {   //new method
                createAndShowGUI(); //calls method
            }
        });
    }
       
    

}
