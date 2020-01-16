import java.util.regex.*;
import java.util.Scanner; 
class mobilevailid
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile number");
		 long  s = sc.nextLong();
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m = p.matcher(s);
		if(m.matches())
		{
			System.out.println("valid number");
		}
		else
		{
			System.out.println("not vailid number");
		}
	}
}