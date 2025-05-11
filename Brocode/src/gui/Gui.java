package gui;
import javax.swing.JOptionPane;

public class Gui {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
		JOptionPane.showMessageDialog(null, "Your are  "+age+" Years old");

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height in CM"));
		JOptionPane.showMessageDialog(null, "Your are  "+height+" CM tall");
	}
	

}
