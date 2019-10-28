import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
//		String s = "Neu huy huy la huy huy huy neu neu";
//		System.out.println(s.replaceAll("(.+?)\\1+", " REPEAT"));
//	
//	
	System.out.println("Input test String ");
	Scanner a = new Scanner(System.in);
	String b = a.nextLine();
	System.out.println(b.replaceAll("(.+?)\\1+", " REPEAT"));
	
}
}