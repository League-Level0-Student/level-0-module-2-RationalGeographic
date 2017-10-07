import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
	String yep = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(yep);{
		if(age > 17) {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
		}
		else{
			JOptionPane.showInputDialog("Who do you think should be the next president?");
			JOptionPane.showMessageDialog(null, "No one cares what you think");
		}
		}
	}
	

}

