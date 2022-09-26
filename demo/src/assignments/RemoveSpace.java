package assignments;

public class RemoveSpace {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Abc  Xyz   Pqr");
		
		 
		for(int pos = 0; pos < s.length() ; )
		{
			if (s.charAt(pos)  == ' ')
				s.deleteCharAt(pos);
			else
				pos++;
		}
		System.out.println(s);
	}
}
