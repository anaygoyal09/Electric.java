import java.util.Scanner;
public class Electric
{
		private final double RperHour = 0.095;
		private final double CperHour = 0.083;
		private final double IperHourPeak = 0.109;
		private final double IperHourOffPeak = 0.047;
		private final double flatfeeR = 12.00;
		private final double flatfeeC = 120.00;
		private final double flatfeeIPeak = 152.00;
		private final double flatfeeIOffPeak = 108.00; 
		private String billtype;
		private double kiloHour;
		private double kilopeak;
		private double kiloHourOffPeak;
		
	public Electric()
	{
		billtype = new String("");
	}
	public static void main (String[] args)
	{
		Electric EC = new Electric();
		EC.computeIt();
	}
	
	public void computeIt()
	{
		getData();
		calculateCost();
		printInfo();
	}
	public void getData()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\n\n\n");
		System.out.print("Enter the type of electric bill, R for residential, C for commercial, I for industrial -> ");
		billtype = in.next();
		if (billtype.equalsIgnoreCase("I"))
		{
			System.out.print("Enter the number of kilowatt hours of electricity used during peak hours ->");
			kilopeak = in.nextDouble();
			System.out.print("\nEnter the number of kilowatt hours of electricity used during off-peak hours ->");
			kiloHourOffPeak = in.nextDouble();
		}
		else 
		{
		System.out.print("Enter the number of kilowatt hours of electricity used ->");
		kiloHour = in.nextDouble();
		}
		
		
	}
	public void calculateCost()
	{
		if (billtype.equalsIgnoreCase("R"))
		{
			flatfeeR + RperHour * kiloHour;
		}
		else if (billtype.equalsIgnoreCase("C"))
		{
			System.out.print("");
		}
		else if (billtype.equalsIgnoreCase("I"))
		{
			System.out.print("");
		}
		else
		{
			System.out.println("");
		}
		
	}
	public void printInfo()
	{
		System.out.print("\n\n\n");
		
	}
	
	
	
}
	
