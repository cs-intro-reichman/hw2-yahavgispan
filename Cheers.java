

public class Cheers {
        public static void main(String[] args) {
	    
        String word= args[0];
        String upperCaseWorld= word.toUpperCase();
        int times= Integer.parseInt(args[1]);
        char ch= 0;
        String an = "AEFHILMNORSX";

        for (int i=0; i<word.length(); i++) {  

        ch= upperCaseWorld.charAt(i);
        if ( an.indexOf (ch)==-1){
        System.out.println("Give me a " + ch + ": " + ch + "!");
        }
        else{
        System.out.println("Give me an " + ch + ": " + ch + "!");
        }
                
        }
        System.out.println("What does that spell?");
        for (int i=0; i<times; i++){
        
        System.out.println(upperCaseWorld+ "!!!");

        }

        }
}
