/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class buttons extends JButton implements ActionListener{
	ImageIcon B,W;
	byte value=0;
	/*
	0:nothing
	1:Black
	2:White
	*/
	
	public buttons(){
		B=new ImageIcon(this.getClass().getResource("B.png"));
		W=new ImageIcon(this.getClass().getResource("W.png"));
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		value++;
		value%=3;
		switch(value){
			case 0:
				setIcon(null);
				break;
			case 1:
				setIcon(B);
				break;
			case 2:
				setIcon(W);
				break;
		}
	}
}