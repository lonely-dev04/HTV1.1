import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.LabelUI;
class DemoButton extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btsm,btsb,btml,btdi,bteq;
	Label l1;
	DemoButton()
	{
				
	}
	DemoLabel()
	{
		l1 = new  Label("Calcutor 2.0");
		l1.setBounds(2,100,50,60);
	}
	public static void main(String args[]){
		DemoButton D1 = new DemoButton();
	}




}
