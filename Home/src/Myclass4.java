
public class Myclass4 {
		void m() throws Exception {
			throw new java.io.IOException("Error");
		}
		void n()
		{
		try {
			m();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		void p()
		{
			try {
				n();
			}
			catch(Exception e) {
				System.out.println(e); }  }
		public static void main(String args[]) {
			Myclass4 obj = new Myclass4();
			obj.p();
			System.out.println("Normal Flow");
			
			}
    }


