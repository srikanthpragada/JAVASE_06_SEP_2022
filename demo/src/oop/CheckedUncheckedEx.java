package oop;

public class CheckedUncheckedEx {

	public static void main(String[] args)   {
		int v = Integer.parseInt("11");
		System.out.println(v * v);
		
		try {
			Thread.sleep(100);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception ex) {
			
		}
		
		
	}

}
