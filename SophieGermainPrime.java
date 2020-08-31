public class SophieGermainPrime {

	public static void main(String[] args) {
		
		int[] sayilar= {11,21,31,41,51,61,71,81,91};

		for(int i = 0; i < sayilar.length; i++) {
			System.out.println("sayi : "+sayilar[i]+" asal mi : " + asalMi(sayilar[i]) + " 2*p+1 sayisi : "+ (2*sayilar[i]+1) + " asal mi : "+ asalMi((2*sayilar[i]+1)));
			if(asalMi(sayilar[i]) && asalMi((2*sayilar[i]+1))) {
				System.out.println("Sarti saglayan sayi : "+sayilar[i]);
			}
		}
	}

	public static boolean asalMi(int sayi) { 
		for(int i = 2; i < sayi ; i++) {
			if(sayi % i == 0) {
				return false;
			}
		}
		return true;
	}
}