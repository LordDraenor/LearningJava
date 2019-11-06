package interviewTasks;

public class MatrixSpiral {
	public static void main(String[] args) {
		int[][] matrix = {		{1,	 2,	  3,  4,  5},
								{6,	 7,	  8,  9, 10},
								{11, 12, 13, 14, 15},
								{16, 17, 18, 19, 20},
								{21, 22, 23, 24, 25}};
		
		printSpiral(matrix);
		
		
	}
	
	static void printSpiral(int[][] x){
		 int i, k = 0, l = 0; 
		 int n = x[0].length;
		 int m = n;
	        /*  k - starting row index 
	        m - ending row index 
	        l - starting column index 
	        n - ending column index 
	        i - iterator 
	        */
	  
	        while (k < m && l < n) { 
	            // Print the first row from the remaining rows 
	            for (i = l; i < n; ++i) { 
	                System.out.print(x[k][i] + " "); 
	            } 
	            k++; 
	  
	            // Print the last column from the remaining columns 
	            for (i = k; i < m; ++i) { 
	                System.out.print(x[i][n - 1] + " "); 
	            } 
	            n--; 
	  
	            // Print the last row from the remaining rows */ 
	            if (k < m) { 
	                for (i = n - 1; i >= l; --i) { 
	                    System.out.print(x[m - 1][i] + " "); 
	                } 
	                m--; 
	            } 
	  
	            // Print the first column from the remaining columns */ 
	            if (l < n) { 
	                for (i = m - 1; i >= k; --i) { 
	                    System.out.print(x[i][l] + " "); 
	                } 
	                l++; 
	            } 
	        } 
		
	}

}
