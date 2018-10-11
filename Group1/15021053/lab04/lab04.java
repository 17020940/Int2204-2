package lab04;

public class lab04{
	public static int max(int a, int b){
		if(a > b) return a;
		else return b;
	}
	
	public static int min(int []a) {
		int n = a.length, min = a[0];
		for(int i = 1; i<n;i++) {
			if(a[i] < min) min = a[i];
		}
		return min;
	}
	
	public static String BMI (double weigh, double high) {
		double BMI = weigh/Math.pow(high, 2);
		BMI = Math.round(BMI*100)/100;
		if(BMI < 18.5) {
			return "Thieu can";
		}
		else if(BMI >=18.5 && BMI < 22.99) {
			return "Binh thuong";
		}
		else if(BMI >=23 && BMI < 24.99) {
			return "Thua can";
		}
		else {
			return "Beo phi";
		}
	}
}
