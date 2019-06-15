/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culm;

import java.awt.geom.Rectangle2D;




/**
 *
 * @author bro
 */
public class test5 {
  

    
public static int[][] map = {
    {0, 0, 1, 0, 0},
    {0, 0, 1, 0, 0},
    {0, 0, 1, 0, 0},
    {0, 0, 1, 0, 0},
    {0, 0, 1, 0, 0},
    {0, 2, 1, 0, 0}
};

public static Rectangle2D[][] board = new Rectangle2D[8][8];

  public static void setBoard()
  {
       Rectangle2D.Double tile;
       for (int i = 0; i < 8; i++)
       {
             for (int j = 0; j < 8; j++)
             {
                 tile = new Rectangle2D.Double(10, 10, 10, 10);//how will you determine x and y here
                 board[i][j] = tile;
             }
       }
 }



public static int rows = 6;
public static int columns = 5;
public static int[][] next = new int[rows][columns];

public static void main(String[] args)
{
for(int i = 0; i < map.length; i++)
{
    for(int j = 0; j < map[i].length; j++)
    {
    System.out.print(map[i][j] + " ");
    }
    System.out.println();
}

}
}