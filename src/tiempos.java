
public class tiempos {
	
	public static void main(String [] args) {
		
		int t=23506;
		
		System.out.print("El tiempo "+ t +" segundos es igual a: ");
		
		System.out.print(t/3600 + " horas, ");
		
		t%=3600;
		
		System.out.print(t/60 + " minutos y ");
		
		t%=60;
				
		System.out.println(t + " segundos. ");
	}

}
