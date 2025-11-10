// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 


		int times= Integer.parseInt(args[0]);
		double sum= 0;
		double up=0;
		double down=0;


		for (int i = 0; i < times; i++) {
		
		up= Math.pow(-1, i);
		down= 2*i +1;
		sum=sum+ up/ down;
			
		}

		double pi = sum * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:    " + pi);




	}
}
