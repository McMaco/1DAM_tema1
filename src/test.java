
public class test {
	
	public static char getLetras () {
		
		return (char) (Math.random()*26 + 'a');//Se multiplica por 26 porque son las letras del abecedario
	}
	public static void main(String[] args) {
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
		System.out.println(getLetras());
	}

}
