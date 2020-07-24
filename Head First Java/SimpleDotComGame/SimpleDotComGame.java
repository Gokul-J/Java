package game;

public class SimpleDotComGame {
	public static void main(String[] args) {
		int numOfGuess = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomnum = (int) (Math.random() *5);
		int[] locations = {randomnum, randomnum+1, randomnum+2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		while(isAlive == true) {
			 String guess = helper.getUserInput("Enter the number :");
			 String result = theDotCom.checkYourself(guess);
			 numOfGuess++;
			 if(result.equals("kill")) {
				 isAlive = false;
				 System.out.println("You took " + numOfGuess + " guesses");
			 }
		}
 	}
}