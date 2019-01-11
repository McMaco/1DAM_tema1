
public class dinero {
	
	public static void main(String [] args) {
		
		int importe= 456;
		
		System.out.println("El importe "+ importe +" euros es igual a: ");
		
		System.out.println(importe/500 + " billetes de 500 ");
		
		importe%=500;
		
		System.out.println(importe/200 + " billetes de 200 ");
		
		importe%=200;
		
		System.out.println(importe/100 + " billetes de 100 ");
		
		importe%=100;
		
		System.out.println(importe/50 + " billetes de 50 ");
		
		importe%=50;
		
		System.out.println(importe/20 + " billetes de 20 ");
		
		importe%=20;
		
		System.out.println(importe/10 + " billetes de 10 ");
		
		importe%=10;
		
		System.out.println(importe/5 + " billetes de 5 ");
		
		importe%=5;
		
		System.out.println("y sobran " + importe + " euros");
				
		
		
				
	}

}
