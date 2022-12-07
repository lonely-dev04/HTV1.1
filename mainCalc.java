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
		txans=new TextField("Enter numbers");
		txans.setBounds(10,50,215,55);
		add(txans);
		txans.addMouseListener(this);

		bt1=new Button("1");
		bt1.setBounds(10,110,50,50);
		add(bt1);

		bt2=new Button("2");
		bt2.setBounds(65,110,50,50);
		add(bt2);

		bt3=new Button("3");
		bt3.setBounds(120,110,50,50);
		add(bt3);

		bt4=new Button("4");
		bt4.setBounds(10,165,50,50);
		add(bt4);

		bt5=new Button("5");
		bt5.setBounds(65,165,50,50);
		add(bt5);

		bt6=new Button("6");
		bt6.setBounds(120,165,50,50);
		add(bt6);

		bt7=new Button("7");
		bt7.setBounds(10,220,50,50);
		add(bt7);

		bt8=new Button("8");
		bt8.setBounds(65,220,50,50);
		add(bt8);

		bt9=new Button("9");
		bt9.setBounds(120,220,50,50);
		add(bt9);

		bt0=new Button("0");
		bt0.setBounds(10,275,50,50);
		add(bt0);

		btsm=new Button("+");
		btsm.setBounds(175,110,50,50);
		add(btsm);

		btsb=new Button("-");
		btsb.setBounds(175,165,50,50);
		add(btsb);

		btml=new Button("x");
		btml.setBounds(175,220,50,50);
		add(btml);

		btdi=new Button("/");
		btdi.setBounds(175,275,50,50);
		add(btdi);

		bteq=new Button("=");
		bteq.setBounds(120,275,50,50);
		add(bteq);

		btac=new Button("AC");
		btac.setBounds(10,330,50,50);
		add(btac);

		btdt=new Button(".");
		btdt.setBounds(65,275,50,50);
		add(btdt);

		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==txans)
			txans.setText("");
	}
	public void mouseEntered(MouseEvent e)
	{
		//hjvgdvf
	}
	public void mouseExited(MouseEvent e)
	{
		//yusdgf
	}
	public void mouseReleased(MouseEvent e)
	{
		//yugsd
	}
	public void mousePressed(MouseEvent e)
	{
		//hyugsdyu
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
