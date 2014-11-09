package RadioButtons;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtons extends JFrame {
	RadioButtons (){
	     JRadioButton Small = new JRadioButton("Small");
	     JRadioButton Medium = new JRadioButton("Medium");
	     JRadioButton Large = new JRadioButton("Large");
	     ButtonGroup bG = new ButtonGroup();
	     bG.add(Small);
	     bG.add(Medium);
	     bG.add(Large);
	     this.setSize(100,200);
	     this.setLayout( new FlowLayout());
	     this.add(Small);
	     this.add(Medium);
	     this.add(Large);
	     Small.setSelected(true);
	     this.setVisible(true);
	 }
	public static void main(String args[]){
	   RadioButtons j = new RadioButtons();
}
}
