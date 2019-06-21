import java.util.*;
class RollDice{

	public static void main(String args[]){
	
	Random r = new Random();
	for(int i = 0; i<20; i++){
		int result = r.nextInt(7); //nextInt does 0 - num exclusive
		try {
        	Thread.sleep(1000);
        } catch (InterruptedException ex) {}
		System.out.println("Dice rolled a " + result);
		}
	}

}