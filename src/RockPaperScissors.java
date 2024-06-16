import java.util.Random;
import javax.swing.JOptionPane;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		while(true) {
		String[]options = {"r", "p", "s"};
		String computerChoice = options[new Random().nextInt(options.length)];
		

		String playerChoice;
		while(true) {
			playerChoice = JOptionPane.showInputDialog(null, "Write 'r' for rock, 'p' for paper or 's' for scissors");
			if(playerChoice.equals("r") || playerChoice.equals("p") || playerChoice.equals("s")){
				break;
			}
			JOptionPane.showMessageDialog(null, playerChoice + " is not valid");
		
		}
		if(playerChoice.equals(computerChoice)) {
			JOptionPane.showMessageDialog(null, "You got a draw!");
				
		}else if (playerChoice.equals("r")) {
			if(computerChoice.equals("p")) {
				JOptionPane.showMessageDialog(null, "You have los this round, sorry!");	
			}else if(computerChoice.equals("s")){
				JOptionPane.showMessageDialog(null, "You have won this round! Good job!");
			}
		}
		else if (playerChoice.equals("s")){
			if(computerChoice.equals("p")) {
				JOptionPane.showMessageDialog(null, "You have won this round! Good job!");
			}else if (computerChoice.equals("r")){
				JOptionPane.showMessageDialog(null, "You have lost this round, sorry!");
			}
		}
		else {
			if(computerChoice.equals("s")) {
				JOptionPane.showMessageDialog(null, "You have lost this round, sorry!");
			}else if(computerChoice.equals("r"))
				JOptionPane.showMessageDialog(null, "You have won this round! Good job!");
		}
		String answere = JOptionPane.showInputDialog(null, "Do you want to play again? Type 'y' for yes and 'n' for no");
		
		if(!answere.equals("y")) {
			JOptionPane.showMessageDialog(null, "Thanks for playing! :)");
			break;
		}
		
		}
		
		
	}

}
