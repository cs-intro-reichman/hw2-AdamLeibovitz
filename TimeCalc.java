public class TimeCalc {
    public static void main(String[] args) {
        String timeString = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        String[] timeParts = timeString.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        int totalMinutes = hours * 60 + minutes;
        totalMinutes += minutesToAdd;

        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        String leadHours = "";
        String leadMinutes = "";
        if (newHours < 10) {
            leadHours = "0";
        }
        if (newMinutes < 10) {
            leadMinutes = "0";
        }
        System.out.println(leadHours+newHours+":"+leadMinutes+newMinutes);;
    }
}
