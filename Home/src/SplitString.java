
public class SplitString {
public class Str{
		public static int length;
	}
	public static void str(char string) {
		
		if (Str.length>2) {
			char[] val = null;
			System.out.println();
			System.out.println(val);
		}
		
		else {
				throw new NullPointerException("val");
			
		}
	}
	
		public static String[] split(String string, int i) {
			return null;
		}

	public static void main(String[] args) {
		try {
		String Str = new String ("Happy/coding/java");
		for (String val: Str.split("/",3))
			System.out.println(val);
		}
		catch(NullPointerException ex){
			System.out.println(ex);
		}
		finally {
			System.out.println("Inside Finally Block");
		}

	}

}