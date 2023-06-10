package Employee;
public class emp{
		public void empinfo(){
			int empid=1169;
			String empname="AD";
			int bsal=50000;
			int hra=10000;
			int da=5000;
			int gsal=bsal;
			int netsal=gsal+hra+da;
			System.out.println("Employee ID: "+empid);
			System.out.println("Gross Salary: "+gsal);
			System.out.println("Net Salary: "+netsal);

	}
}
