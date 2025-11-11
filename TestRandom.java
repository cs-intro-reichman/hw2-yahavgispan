
public  class  TestRandom {
	public static void main(String[]  args) {
	   int n= Integer.parseInt(args[0]);
	   int greater= 0;
	   int lessOrEqual=0;
	   double random= 0;
	   for (int i=0; i<n; i++){
	    random= Math.random();
	    if (random>0.5){
			greater++;
		}
		else{
		lessOrEqual++;	
		}

	   }
	    double ratio=0;
		System.err.println("> 0.5: "+ greater+ "times");
		System.err.println("<= 0.5: "+ lessOrEqual+ "times");
		if (greater> lessOrEqual){
		 if(lessOrEqual!=0){
		 ratio= (double)lessOrEqual/greater;
		 System.out.println("Ratio:" + ratio);
	     }
    	}
	  if (greater<= lessOrEqual){
		 if(lessOrEqual!=0)
		 ratio= (double) greater/lessOrEqual;
		 System.out.println("Ratio:" + ratio);
	  }
	}
}
