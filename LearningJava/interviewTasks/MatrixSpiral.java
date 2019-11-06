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
	      
	  
	        while (k < m && l < n) { 
	           
	            for (i = l; i < n; ++i) { 
	                System.out.print(x[k][i] + " "); 
	            } 
	            k++; 
	  
	            
	            for (i = k; i < m; ++i) { 
	                System.out.print(x[i][n - 1] + " "); 
	            } 
	            n--; 
	  
	            
	            if (k < m) { 
	                for (i = n - 1; i >= l; --i) { 
	                    System.out.print(x[m - 1][i] + " "); 
	                } 
	                m--; 
	            } 
	  
	         
	            if (l < n) { 
	                for (i = m - 1; i >= k; --i) { 
	                    System.out.print(x[i][l] + " "); 
	                } 
	                l++; 
	            } 
	        } 
		
	}

}
