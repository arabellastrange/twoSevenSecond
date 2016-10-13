package bracket;

import java.util.Vector;
import java.util.*;

public class bracketRun {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		StackADT newStack = new StackStack<Character>();
		System.out.println("Please enter the string you would like checked: ");
		String input = s.nextLine().toString();
		for(int i = 0; i < input.length(); i++){
			if(input.isEmpty()){
				System.out.println("String matches!");
			}
			else{
				char first = input.charAt(i);
				switch(first){
				case '{':
				case '(':
				case '[': newStack.push(first);
						  break;
				case ')':
				case '}':
				case ']': 
					     if(newStack.isEmpty()) {
								System.out.println("String does not match.");
							}
						  else{
							  	char last = newStack.top().toString().charAt(0);
							    if(last == '{' && first == '}' || last == '[' && first == ']' || last == '(' && first == ')'){
							    	newStack.pop(); 
							    }
							    else{
							    	System.out.println("String does not match.");
							    }
						  }
						  break;
				}
			}
		}
		if(newStack.isEmpty()){
			System.out.println("String matches!");
		}
		else{
			System.out.println("String does not match.");
		}
	}
	
	

}
