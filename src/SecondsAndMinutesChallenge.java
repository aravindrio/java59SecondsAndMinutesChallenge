public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        String result1 = getDurationString(176,15);
        System.out.println(result1);
        //System.out.println(getDurationString(176,15));
        //This also can be done!!!!!!!!!!

        String result2 = getDurationString(130);
        System.out.println(result2);
        //System.out.println(getDurationString(130));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <=59)){

            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s" ;


        } else{
            return "Invalid Value";
        }
    }

    public static  String getDurationString(int seconds){

        if(seconds >= 0){

            int minutes = seconds / 60;
            int secondsRemaining = seconds % 60;
            return getDurationString(minutes, secondsRemaining);
        } else{
            return "Invalid Value";
        }
    }
}
