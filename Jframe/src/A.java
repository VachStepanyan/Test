import javax.swing.JFrame;


public class A {
	public static void main(String args[]) {
		Reader r = new Reader("GFG");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(950,200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
}
}