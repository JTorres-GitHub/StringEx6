import java.util.Scanner;

public class StringEx6 {
	public static String firstTwo(String str){
		String first;
		first = str.substring(0, 2);
		
		return first;
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String inputStr;
		
		System.out.println("Enter a string: ");
		inputStr = input.nextLine();
		
		System.out.println(firstTwo(inputStr));
		
		input.close();
	}
}
