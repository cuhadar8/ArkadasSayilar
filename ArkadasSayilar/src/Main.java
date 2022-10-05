
public class Main {
	
	public static void main(String[] args) {
		
		int a = 220;
		int b = 284;
		int aninBolenleriToplami = 0;
		int bninBolenleriToplami = 0;
		for(int i = 1; i < a; i++) {
			
			if(a % i == 0) {
				aninBolenleriToplami += i;				
			}
		}
		
		for(int i = 1; i < b ; i++) {
			if(b % i == 0) {
				bninBolenleriToplami += i;
			}
		}
		
		System.out.println(aninBolenleriToplami);
		System.out.println(bninBolenleriToplami);
		
		if(aninBolenleriToplami == b && bninBolenleriToplami == a) {
			System.out.println(a + " ve " + b + " sayıları arkadaş sayılardır.");
		}
		else {
			System.out.println("Arkadaş sayı değillerdir.");
		}
		
	
		
	}

}
