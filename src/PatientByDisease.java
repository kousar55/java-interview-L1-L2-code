import java.util.Arrays;
import java.util.List;

public class PatientByDisease {

	public static void main(String[] args) {
		
		Patient p1=new Patient("p1",20,"Corona",18000);
		Patient p2=new Patient("p2",26,"fever",18000);
		Patient p3=new Patient("p3",29,"Corona",18000);
		Patient p4=new Patient("p4",30,"direa",18000);
		Patient p5=new Patient("p5",22,"Corona",18000);
		
		List<Patient> patients=Arrays.asList(p1,p2,p3,p4,p5);
		
		patients.stream().filter(p->p.getDisease().equals("Corona")).forEach(System.out::println);
		
		// TODO Auto-generated method stub

	}

}
