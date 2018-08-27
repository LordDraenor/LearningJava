package exercises;
public class First{
   public static void main(String[] args){
//	text();
//	numbs();
//	census(5);
//	average(24,1,40,35);	
	System.out.println(randomChar());
   }

   private static void text(){
		System.out.println("Am I famous yet?");
		System.out.println("    J     A     V     V    A ");
		System.out.println("    J    A A     V   V    A A");
		System.out.println("J   J   AAAAA     V V    AAAAA");
		System.out.println(" J J   A     A     V    A     A");
		for(int i=0;i<5;i++){
		System.out.println("Welcome to my nightmare!");		
		}
		}
   private static void numbs(){
		System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
		int i = 1,j = 0;
		while(i<=9){
		j+=i;	
		i++;
		}
		System.out.println(j);
		double q=1.0;
		j=0;
		for (i = 3;i<1325;i++) {
		if (j==0){
		  q=q-1.0/i;
		  j=1;
		}	
		else
		  {q=q+1.0/i;
		   j=0;
		  }	
		i++;			
		}
		System.out.println(4*q);
		}
   private static void census(int years){
	   double current = 312032486;
	   int q = 365*24*60*60;
	   for (int i = 1; i <= years; i++) {
		current=current+q/7.0-q/13.0+q/45.0;	
		System.out.println(current);
	}
   }	   
   private static void average(int miles, int hour, double minutes, double seconds){
	 double km = (1.6*miles)/(hour+minutes/60+seconds/3600);  
	 System.out.println(km+" kmh");  
	   
   }
   private static char randomChar() {	   
	   return (char)('a' + Math.random() * ('z' - 'a' + 1));
	   
   }
   
}