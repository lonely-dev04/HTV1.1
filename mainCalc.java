import java.awt.*;
import java.awt.event.*;
import java.time.format.TextStyle;

import javax.swing.text.StyledEditorKit.FontSizeAction;
class DemoButton extends Frame implements ActionListener,MouseListener,MouseMotionListener,WindowListener
{
	TextField txans;
	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btsm,btsb,btml,btdi,bteq,btdt,btac,pothu;
	Color globalColor = new Color(222, 222, 222);
	Label l1;
	DemoButton()
	{
		super("HTV Calc 2.0");
		txans=new TextField();
		txans.setBounds(20,50,215,55);
		add(txans);
		txans.addActionListener(this);
		txans.addMouseListener(this);
		txans.addMouseMotionListener(this);

bt1=new Button("1");
		bt1.setBounds(20,165,50,50);
		add(bt1);
		bt1.addActionListener(this);
		bt1.addMouseListener(this);
		bt1.addMouseMotionListener(this);

		bt2=new Button("2");
		bt2.setBounds(75,165,50,50);
		add(bt2);
		bt2.addActionListener(this);
		bt2.addMouseListener(this);
		bt2.addMouseMotionListener(this);

		bt3=new Button("3");
		bt3.setBounds(130,165,50,50);
		add(bt3);
		bt3.addActionListener(this);
		bt3.addMouseListener(this);
		bt3.addMouseMotionListener(this);

		bt4=new Button("4");
		bt4.setBounds(20,220,50,50);
		add(bt4);
		bt4.addActionListener(this);
		bt4.addMouseListener(this);
		bt4.addMouseMotionListener(this);

		bt5=new Button("5");
		bt5.setBounds(75,220,50,50);
		add(bt5);
		bt5.addActionListener(this);
		bt5.addMouseListener(this);
		bt5.addMouseMotionListener(this);

		bt6=new Button("6");
		bt6.setBounds(130,220,50,50);
		add(bt6);
		bt6.addActionListener(this);
		bt6.addMouseListener(this);
		bt6.addMouseMotionListener(this);

		bt7=new Button("7");
		bt7.setBounds(20,275,50,50);
		add(bt7);
		bt7.addActionListener(this);
		bt7.addMouseListener(this);
		bt7.addMouseMotionListener(this);

		bt8=new Button("8");
		bt8.setBounds(75,275,50,50);
		add(bt8);
		bt8.addActionListener(this);
		bt8.addMouseListener(this);
		bt8.addMouseMotionListener(this);

		bt9=new Button("9");
		bt9.setBounds(130,275,50,50);
		add(bt9);
		bt9.addActionListener(this);
		bt9.addMouseListener(this);
		bt9.addMouseMotionListener(this);

		bt0=new Button("0");
		bt0.setBounds(20,330,50,50);
		add(bt0);
		bt0.addActionListener(this);
		bt0.addMouseListener(this);
		bt0.addMouseMotionListener(this);

		btsm=new Button("+");
		btsm.setBounds(185,165,50,50);
		add(btsm);
		btsm.addActionListener(this);
		btsm.addMouseListener(this);
		btsm.addMouseMotionListener(this);

		btsb=new Button("-");
		btsb.setBounds(185,220,50,50);
		add(btsb);
		btsb.addActionListener(this);
		btsb.addMouseListener(this);
		btsb.addMouseMotionListener(this);

		btml=new Button("x");
		btml.setBounds(185,275,50,50);
		add(btml);
		btml.addActionListener(this);
		btml.addMouseListener(this);
		btml.addMouseMotionListener(this);

		btdi=new Button("/");
		btdi.setBounds(185,330,50,50);
		add(btdi);
		btdi.addActionListener(this);
		btdi.addMouseListener(this);
		btdi.addMouseMotionListener(this);

		bteq=new Button("=");
		bteq.setBounds(130,330,50,50);
		add(bteq);
		bteq.addActionListener(this);
		bteq.addMouseListener(this);
		bteq.addMouseMotionListener(this);

		btop=new Button("(");
		btop.setBounds(20,110,50,50);
		add(btop);
		btop.addActionListener(this);
		btop.addMouseListener(this);
		btop.addMouseMotionListener(this);

		btcp=new Button(")");
		btcp.setBounds(75,110,50,50);
		add(btcp);
		btcp.addActionListener(this);
		btcp.addMouseListener(this);
		btcp.addMouseMotionListener(this);

		btc=new Button("C");
		btc.setBounds(130,110,50,50);
		add(btc);
		btc.addActionListener(this);
		btc.addMouseListener(this);
		btc.addMouseMotionListener(this);

		btac=new Button("AC");
		btac.setBounds(185,110,50,50);
		add(btac);
		btac.addActionListener(this);
		btac.addMouseListener(this);
		btac.addMouseMotionListener(this);

		btdt=new Button(".");
		btdt.setBounds(75,330,50,50);
		add(btdt);
		btdt.addActionListener(this);
		btdt.addMouseListener(this);
		btdt.addMouseMotionListener(this);

		bt1.setBackground(globalColor);
		bt2.setBackground(globalColor);
		bt3.setBackground(globalColor);
		bt4.setBackground(globalColor);
		bt5.setBackground(globalColor);
		bt6.setBackground(globalColor);
		bt7.setBackground(globalColor);
		bt8.setBackground(globalColor);
		bt9.setBackground(globalColor);
		bt0.setBackground(globalColor);
		btsm.setBackground(globalColor);
		btsb.setBackground(globalColor);
		btml.setBackground(globalColor);
		btdi.setBackground(globalColor);
		btdt.setBackground(globalColor);
		btac.setBackground(globalColor);
		bteq.setBackground(globalColor);
		btc.setBackground(globalColor);
		btcp.setBackground(globalColor);
		btop.setBackground(globalColor);
		bteq.setForeground(Color.BLACK);
		
		addWindowListener(this);
		setBackground(Color.DARK_GRAY);
		setSize(255,400);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		String query;
		if(e.getSource()==bt1)
		{
			query=txans.getText();
			txans.setText(query+"1");
		}
		if(e.getSource()==bt2)
		{
			query=txans.getText();
			txans.setText(query+"2");
		}
		if(e.getSource()==bt3)
		{
			query=txans.getText();
			txans.setText(query+"3");
		}
		if(e.getSource()==bt4)
		{
			query=txans.getText();
			txans.setText(query+"4");
		}
		if(e.getSource()==bt5)
		{
			query=txans.getText();
			txans.setText(query+"5");
		}
		if(e.getSource()==bt6)
		{
			query=txans.getText();
			txans.setText(query+"6");
		}
		if(e.getSource()==bt7)
		{
			query=txans.getText();
			txans.setText(query+"7");
		}
		if(e.getSource()==bt8)
		{
			query=txans.getText();
			txans.setText(query+"8");
		}
		if(e.getSource()==bt9)
		{
			query=txans.getText();
			txans.setText(query+"9");
		}
		if(e.getSource()==bt0)
		{
			query=txans.getText();
			txans.setText(query+"0");
		}
		if(e.getSource()==btsm)
		{
			query=txans.getText();
			txans.setText(query+"+");
		}
		if(e.getSource()==btsb)
		{
			query=txans.getText();
			txans.setText(query+"-");
		}
		if(e.getSource()==btml)
		{
			query=txans.getText();
			txans.setText(query+"*");
		}
		if(e.getSource()==btdi)
		{
			query=txans.getText();
			txans.setText(query+"/");
		}
		if(e.getSource()==btdt)
		{
			query=txans.getText();
			txans.setText(query+".");
		}
		if(e.getSource()==btop)
		{
			query=txans.getText();
			txans.setText(query+"(");
		}
		if(e.getSource()==btcp)
		{
			query=txans.getText();
			txans.setText(query+")");
		}
		if(e.getSource()==btac)
		{
			query=txans.getText();
			txans.setText("");
		}
		if(e.getSource()==bteq)
		{
			query=txans.getText();
			//ans=postfix(query);
			txans.setText(query);
		}
		
	}
	public void mouseMoved(MouseEvent e){
		if(e.getSource() == bt1){bt1.setBackground(Color.white);}
		else if(e.getSource() == bt2){bt2.setBackground(Color.white);}
		else if(e.getSource() == bt2){bt2.setBackground(Color.white);}
		else if(e.getSource() == bt3){bt3.setBackground(Color.white);}
		else if(e.getSource() == bt4){bt4.setBackground(Color.white);}
		else if(e.getSource() == bt5){bt5.setBackground(Color.white);}
		else if(e.getSource() == bt6){bt6.setBackground(Color.white);}
		else if(e.getSource() == bt7){bt7.setBackground(Color.white);}
		else if(e.getSource() == bt8){bt8.setBackground(Color.white);}
		else if(e.getSource() == bt9){bt9.setBackground(Color.white);}
		else if(e.getSource() == bt0){bt0.setBackground(Color.white);}
		else if(e.getSource() == btsm){btsm.setBackground(Color.green);}
		else if(e.getSource() == btsb){btsb.setBackground(Color.red);}
		else if(e.getSource() == btml){btml.setBackground(Color.orange);}
		else if(e.getSource() == btdi){btdi.setBackground(Color.blue);}
		else if(e.getSource() == btdt){btdt.setBackground(Color.white);}
		else if(e.getSource() == btac){btac.setBackground(Color.magenta);}
		else if(e.getSource() == bteq){bteq.setBackground(Color.black);bteq.setForeground(Color.white);}
		


	}
	public void mouseDragged(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e)
	{
		bt1.setBackground(globalColor);
		bt2.setBackground(globalColor);
		bt3.setBackground(globalColor);
		bt4.setBackground(globalColor);
		bt5.setBackground(globalColor);
		bt6.setBackground(globalColor);
		bt7.setBackground(globalColor);
		bt8.setBackground(globalColor);
		bt9.setBackground(globalColor);
		bt0.setBackground(globalColor);
		btsm.setBackground(globalColor);
		btsb.setBackground(globalColor);
		btml.setBackground(globalColor);
		btdi.setBackground(globalColor);
		btdt.setBackground(globalColor);
		btac.setBackground(globalColor);
		bteq.setBackground(globalColor);
		bteq.setForeground(Color.BLACK);
	}
	public void mouseReleased(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void windowActivated(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowClosing(WindowEvent we){
		System.exit(ABORT);
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}

	public static void main(String args[]){
		new DemoButton();
	}




}
