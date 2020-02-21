public class tester{
	public static void main(String[] args){

		//When running first argument is #increments
		//            second argument is lower range for table
		// 			   third argument is upper range for table

		double timeStart = System.nanoTime();

		System.out.print("      ");
		for(int i = 0; i< 10; i++){
			System.out.print("  +.");
			System.out.printf("%2d", i*5);
			System.out.print("   ");
		}
		System.out.print("     ");
		for(int i=0; i< 90; i++) System.out.print("_");
		System.out.print('\n');
		for(double i = Double.parseDouble(args[1]); i <= -1; i+=.5){
			System.out.print(i + " | ");
			for(double j = 0; j< .45; j+=.05){
				System.out.printf("%.5f",.5-gaussFunction.gsDist(i+j,0,Integer.parseInt(args[0])));
				System.out.print("  ");
			}
			System.out.print('\n');
		}
		for(double i = 0; i <= Double.parseDouble(args[2]); i+=.5){
			System.out.print(" " + i + " | ");
			for(double j = 0; j< .45; j+=.05){
				System.out.printf("%.5f",.5+gaussFunction.gsDist(0,i+j,Integer.parseInt(args[0])));
				System.out.print("  ");
			}
			System.out.print('\n');
		}

		double timeEnd = System.nanoTime();
		System.out.println("\nTable Display Time: " + (timeEnd-timeStart)/1000000 + " milliseconds");
	}
}