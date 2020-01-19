import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	JButton b1, b2;
	JLabel l1, l2, l3, l4, l5, l6, l7;
	JTextField t1, t2, t3, t4, t5;
	int i, j,  l, p;
	double k;
	String a,b;
	eHandler handler = new eHandler();
	
	public Reader(String s) {
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Clear");
		b2 = new JButton("Count");
		l1 = new JLabel("First Number");
		l2 = new JLabel("Happy Days");
		l3 = new JLabel("KPI");
		l4 = new JLabel("Overtime");
		l5 = new JLabel("Working Days");
		l6 = new JLabel("");
		l7 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t4 = new JTextField(10);
		t5 = new JTextField(10);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(b1);
		add(b2);
		b2.addActionListener(handler);
		b1.addActionListener(handler);
		add(l6);
	}
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		if (e.getSource()== b2){
			 i= Integer.parseInt(t1.getText());
			 j= Integer.parseInt(t2.getText());
			 k= Integer.parseInt(t3.getText());
			 l= Integer.parseInt(t4.getText());
			 p= Integer.parseInt(t5.getText());
			 double m, n, q, w;
			 k = i * k/100;
			 j = j * i/p;
			 l = l * i/(4*p);
			 m = i + j + k + l;
			 n = m - m*0.23 - m*0.025 - 1000;
			 a = "Now Your Number is" + n;
			 l6.setText(a);
		}
		if (e.getSource()==b1){
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
			l6.setText(null);
		}
		
		}
		
	}
}
 