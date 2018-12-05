import javax.swing.JOptionPane;

public class Voting_Booth {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("How old are you?(years)");
	int age = Integer.parseInt(input);
	if(age>18) {
		JOptionPane.showInputDialog("Who do you think the next president should be?");
		JOptionPane.showMessageDialog(null, "Thanks for voting!");
	}
	else(age<18) {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	}
	
}
}
