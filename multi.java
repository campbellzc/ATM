public class multi {
	public static void main(String[] args) {
		int[][] a = { {1, 2, 3, 4, 5},
					  {6, 7, 8, 9, 10},
					  {11, 12, 13, 14, 15} };
		//sumRow(a, 2);
		//sumColumn(a, 3);
		//sumTotal(a);
		//reverseRow(a, 1);
		//reverseColumn(a, 3);
		//print(snakeDraft(10,3));

	}
	public static void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}
	public static int sumRow(int[][] a, int x) {
		int sum = 0;
		for (int r=0; r<a[x].length; r++) {
			sum +=a[x][r];
		}
		System.out.println(sum);
		return sum;
	}
	public static int sumColumn(int[][] a, int x) {
		int sum = 0;
		for (int r=0; r<a.length; r++) {
			sum += a[r][x];
		}
		System.out.print(sum);
		System.out.println();
		return sum;
	}
	public static int sumTotal(int[][] a) {
		int sum = 0;
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				sum += a[r][c];
			}
		}
		System.out.print(sum);
		System.out.println();
		return sum;
	}
	public static int[][] reverseRow(int[][] a, int x) {
		for (int i=a.length+1; i>=0; i--) {
			System.out.print(a[x][i] + " ");
		}
		return a;
	}
	public static int[][] reverseColumn(int[][] a, int x) {
		for (int i=a.length+1; i>=0; i--) {
			System.out.print(a[i][x]);
			System.out.println();
		}
		return a;
	}

}