/*
	Test string manipulation
*/
import java.util.Scanner; //import for user input	
public class TestInput{
	
	//main method
	public static void main(String[] args) {

	//INSTANTIATE SCANNER OBJECT TO GET USER input
	Scanner input = new Scanner(System.in);
		String userName = "";
		int letterCount = 0;
		int numberCount = 0;

		//prompt the user for userName

	System.out.println("Create a username");
	System.out.println ("Username must be atleast 4 letters long \n"
					  + " with at least 3 letters and 1 number");
while(true){
	//get the user response
	userName = input.next();
	//give feedback on what user gave as input
	System.out.println("You chose the username: " + userName);
	


	//Check userinput is atleast 1 characgers
	if(userName.length() >= 4 ){
	System.out.println("Hi. " + userName);
		}
		else{
			System.out.println("Username needs to be atleast 4 characters long.");

		}
	//check each character in username for a number
		for(int i = 0; i < userName.length(); i++ ){
			//check if the current character is a digit
			if(Character.isDigit(userName.charAt(i))){
				numberCount++;

			}
			if(Character.isLetter(userName.charAt(i))){
				letterCount++;
			}
		}

		if(numberCount > 0 && letterCount > 2){
			System.out.println("Your username passes validation.");
			break;
		}
else{
	System.out.println("Username needs at least 3 letters and at least 1 number");
}

	}//end of while loop

	}//end of main

} //end of class