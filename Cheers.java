// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String teamName = args[0].toUpperCase();
            int reps = Integer.parseInt(args[1]);
    
            String specialLetters = "AEFHI LMNORSX";

            for (int i = 0; i < teamName.length(); i++) {
                char letter = teamName.charAt(i);
                String prefix = "a ";
                if (specialLetters.indexOf(letter) != -1) {
                        prefix = "an";
                }
                System.out.println("Give me " + prefix + " " + letter + ": " + letter + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < reps; i++) {
                System.out.println(teamName + "!!!");
            }
        }
}
