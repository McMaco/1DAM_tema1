
public class muestra {
	
	public static void main(String[] args) {
		
	int num=5;
	num += num -1 *4 +1;
	// num = num + (num - (1 * 4) + 1 = num + (num-3) = 5 + 2 = 7
	System.out.println(num);
	num=4;
	num %= 7 * num % 3 *7 >> 1;
	//num = num % (7 * num % 3 * 7 >> 1) = 4 % ((28 % 21)>>1) = 4 % (7 >> 1) = 4 % 3 = 1
	System.out.println(num);
	}
}
