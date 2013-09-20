public class Stats {
	public static void main(String[] args) {
		int[] a = {1, 2, 6, 4, 5, 6, 7};

		//max(a);
		//min(a);
		//mean(a);
		//print(median(a));
		//print(quartileOne(a));
		//print(quartileThree(a)); Not Finished!!
		mode(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	public static int max(int[] a) {
		int largest = 0;

		for (int i=0; i<a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		System.out.println(largest);
		return largest;
	}
	public static int min(int[] a) {
		int min = a[0];
		for (int i=1; i<a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
		return min;
	}
	public static double mean(int[] a) {
		double mean = 0.0;
		int sum = 0;
		int j = 0;
		for (int i = 0; i<a.length; i++) {
			sum += a[i];
			j++;
		}
		mean = sum/j;
		System.out.println(mean);
		return mean;
	}
	public static double median(int[] a) {
		double median = 0.0;
		int length = 0;
		for (int i = 0; i<a.length; i++) {
			length++;
			
			
		}
		if (length % 2 == 0) {
			median = (length /2.0) + 0.5;
		} else {
			median = a[length / 2];
		}
		
		return median;
	}
	public static double quartileOne(int[] a) {
		double median = a[0];
		int length = 0;
		for (int i = 0; i<a.length; i++) {
			length++;
		}
		if (length % 2 == 0) {
			median = (double)a[length-1] / 4 + 0.25;
		} else {
			median = a[(length - 1) / 4];
		}
		
		return median;
	}
	public static double quartileThree(int[] a) {
		double median = a[0];
		int length = 0;
		for (int i = 0; i<a.length; i++) {
			length++;
		}
		if (length % 2 == 0) {
			median = (((double)a[length-1] / 4) * 3) + 0.5;
		} else {
			median = (double)a[((a.length - 1) / 4) * 3];
		}
		
		return median;
	}
	public static int mode(int[] a) {
		int length = 0;
		for (int j=0; j<a.length; j++) {
			length++;
		}
		
		int num = 0;
		int occurance = 0;
		
		for (int i=0, most = (length-1); i<=a.length-1; i++, most--) {
			if (a[i] == a[most]) {
				num = i;
				occurance++;
			}
		}
		System.out.println("The mode is: " + num);
		System.out.println("It occurs " + occurance + " time(s).");
		return num;
	}
}