public class DemoArray {
	
	public int[][] sumOfMatrices(int[][] matrix1,int[][] matrix2) {
		
		int[][] sum = new int[2][3];
		
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[0].length;j++)
			{
				sum[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		
		return sum;		
		
	}
	
	public void displayMatrix(int[][] Matrix) {
		for(int i=0;i<Matrix.length;i++) {
			for(int j=0;j<Matrix[0].length;j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();			
		
	}
	}

	public static void main(String[] args) {
		
		int[][] Matrix1 = {{1,1,1},{1,1,1}};
		int[][] Matrix2 = {{2,2,2},{2,2,2}};
		
		DemoArray demoArray = new DemoArray();
		System.out.println("Matrix 1");
		demoArray.displayMatrix(Matrix1);
		System.out.println();
		System.out.println("Matrix 2");
		demoArray.displayMatrix(Matrix2);
		System.out.println();
		
		int[][] sum = demoArray.sumOfMatrices(Matrix1,Matrix2);	
		System.out.println("Sum of Matrices");
		demoArray.displayMatrix(sum);	

	}

}
