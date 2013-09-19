public class multi {
	public static void main(String[] args) {
		int[][] a = { {1, 2, 3, 4, 5},
					  {6, 7, 8, 9, 10},
					  {11, 12, 13, 14, 15} };

		int[] b = {1, 2, 3, 4, 5, 6};
		//sumRow(a, 2);
		//sumColumn(a, 3);
		//sumTotal(a);
		//reverseRow(a, 1);
		//reverseColumn(a, 3);
		//print(snakeDraft(10, 3));
		print(rectangularize(b, 2, 3));

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
		for (int i = 0, j = a[x].length - 1; i < a[x].length / 2 ; i++, j--) {
			int yolo = a[x][j];
			a[x][j] = a[x][i];
			a[x][i] = yolo;
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
	public static int[][] snakeDraft(int players, int rounds) {
		int[][] n = new int[rounds][players];
		for (int r = 0 ; r < n.length ; r++) {
			for (int c = 0 ; c < n[r].length ; c++) {
				n[r][c] = (r * 10) + (c + 1);
			}
		}

		for (int r = 0 ; r < n.length ; r++) {
			if (r % 2 != 0) {
				
				n = reverseRow(n, r);
			}
		}

		return n;
	}
	public static int[][] rectangularize(int[] a, int rows, int columns) {
		int[][] x = new int[rows][columns];

		for (int i = 0, r = 0, c = 0; i < a.length ; i++) {
			x[r][c] = a[i];

			if (c < columns - 1) {
				c++;
			} else {
				c = 0;
				r++;
			}
		}
		return x;
	}

}