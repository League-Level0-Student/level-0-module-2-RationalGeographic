import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		 String rt = JOptionPane.showInputDialog("How tall are you in inches?");
		 int hi = Integer.parseInt(rt);
		 if(hi > 48) {
			 JOptionPane.showMessageDialog(null, "You can go on. Have fun.");
		 }
		 else{
			JOptionPane.showMessageDialog(null, "You need to grow more first.");
		 }
		   
		  
		
	}

}
