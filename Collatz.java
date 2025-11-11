
public class Collatz {
	public static void main(String args[]) {
	    
		int num = Integer.parseInt(args[0]);
		String mode = args[1];
		int current=1;
		int counter=0;

		if (mode.equals("v")) {
			for (int i = 1; i<=num; i++){
			current = i;
			do {
				System.out.print(current+ " ");
				counter++;
				if(current%2==0){
					current=current/2;
				}
				else{
					current=current*3+1;
				}
				if (current == 1) {
					System.out.print(current + " ");
					counter++;
					
				}
				
			}
			while (current!=1);
			
			System.out.print("(" + counter+ ")");
            System.out.println();
			counter=0;

	    	}

		    System.out.print("Every one of the first " + num + " hailstone sequences reached 1.");

		}
		else{
			System.out.print("Every one of the first " + num + " hailstone sequences reached 1.");
		}
	}
}
