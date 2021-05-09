/*
 * By: Andrew Matos
 * Date: 5/9/21
 * Desc: This has access to the print method.
 */
public class Main {
	static Print _test2 = new Print("Assignment Completed.");
	public static void main(String[] args) {
		System.out.println("Hello World.");
		System.out.println(_test2.SayHey() + _test2.SayClass());
		System.out.println("Finished Program");
	}
}
