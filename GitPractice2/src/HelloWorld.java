/**
 * 
 */

/**
 * @author zaclopez-ibanez
 *
 */
import java.util.*;
public class HelloWorld {

	/**
	 * @param args
	 * @return 
	 */
	public void println(String x) {
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Hello Zac how are you?");
		String b = scan.nextLine();
		String h = (" \n Are you sure you are " + b +" ? Enter Y or N");
		System.out.println(h);
		if(scan.hasNext("Y")) {
			String g = "Great!";
			System.out.println(g);
		} else {
			System.out.println("I'm sorry to hear that");
			System.out.println("what would make you feel better?");
			
		}
		scan.close();
		
		System.out.println("This is a Test change");
		
	}

}
