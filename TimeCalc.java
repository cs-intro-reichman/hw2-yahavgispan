public class TimeCalc {
    public static void main(String[] args) {

        int OriginalHour= Integer.parseInt("" + args[0].charAt(0 ) + args[0].charAt(1 ));
        int OriginalMinutes= Integer.parseInt("" + args[0].charAt(3 ) + args[0].charAt(4 ));
        int MinutesToAdd= Integer.parseInt(args[1]);
        int TotalMinutes= OriginalHour * 60 + OriginalMinutes + MinutesToAdd;
        int TotalHours= TotalMinutes /60;
        int NewHours= (TotalHours % 24);
        int NewMinutes= TotalMinutes - (TotalHours*60);
        String BeforeHours="";
        String BeforeMinutes="";
        
        if (NewHours<10){ 
            BeforeHours="0";
        }
         if (NewMinutes<10){ 
            BeforeMinutes="0";
        }
        System.err.println(BeforeHours+ NewHours + ":" + BeforeMinutes+ NewMinutes);



      
    }
}
