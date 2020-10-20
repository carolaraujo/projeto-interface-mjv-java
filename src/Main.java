import java.util.List;

public class Main {

	public static void main (String[] args) {
		
		Empresa emp1 = new Empresa();
		Empresa emp2 = new Empresa();
		Empresa emp3 = new Empresa();
		emp3.setNome("Empresa 3");
		
		Empresa emp4 = new Empresa();
		Empresa emp5 = new Empresa();
		
		List<Empresa> empresas = new ArrayList<>();
		
		empresas.add(emp1);		
		empresas.add(emp2);
		empresas.add(emp3);
		empresas.add(emp4);
		empresas.add(emp5);
		
		int count = 0;
		
		while(empresas.size() < count) {
			Empresa emp = empresas.get(count);
			
			if("Empresa 3".equals(emp.getNome())) {
				System.out.println(emp.getNome());
				break;
			}
			
			count++;
         
		}

}
}
