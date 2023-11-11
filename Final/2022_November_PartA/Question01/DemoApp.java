package q1;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {
		
		ArrayList<PermanentEmp> PermanentEmpList = new ArrayList<>();
		
		PermanentEmp pe1 = new PermanentEmp(1,"Nimali",56000.00);
		PermanentEmp pe2 = new PermanentEmp(2,"Amal",74000.00);
		
		PermanentEmpList.add(pe1);
		PermanentEmpList.add(pe2);
		
		for(PermanentEmp pe : PermanentEmpList )
		{
			pe.calculateNetSalary();
			pe.display();
			System.out.println("");
		}
		
		System.out.println("");
		
ArrayList<TemporaryEmp> TemporaryEmpList = new ArrayList<>();
		
TemporaryEmp te1 = new TemporaryEmp(3,"Sunil",5,100);
TemporaryEmp te2 = new TemporaryEmp(4,"Piyal",10,100);
		
TemporaryEmpList.add(te1);
TemporaryEmpList.add(te2);

		for(TemporaryEmp te : TemporaryEmpList )
		{
			te.calculateNetSalary();
			te.display();
			System.out.println("");
		}
		
	}

}
