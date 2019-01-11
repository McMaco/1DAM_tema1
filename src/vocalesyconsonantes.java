
public class vocalesyconsonantes {
	
	public static void main(String [] args) {
		
		int i;
		for (i=0; i<10; i++) {
		char letra= (char)(Math.random()*26 + 'a');
		
		System.out.println("La letra " + letra + " es: ");
		
		switch (letra) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': 
			System.out.println("vocal");
			break;
			
		default:
			System.out.println("consonante");
		}
		
	}
	}
}
