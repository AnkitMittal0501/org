package orgorg;

import org.junit.Test;

public class StringPract {

	@Test
	public void stringPract() {
		String str = "Hello   ";
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.concat("abc"));
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(2, 4));
		String strarray[] = str.split("l");
		for (String s : strarray) {
			System.out.println(s);
		}
		System.out.println(str.charAt(2));
	}
}
