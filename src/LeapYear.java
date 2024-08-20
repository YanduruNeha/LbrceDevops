
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2003;
		if(y%4==0 && y%100!=0 || y%400==0)
		{
			System.out.print("LeapYear");
		}
		else
		{
			System.out.print("Not a LeapYear");
		}
	}

}
