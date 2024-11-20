// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int repsNum = Integer.parseInt(args[0]);
        double piJava = Math.PI;
        System.out.println("pi according to Java: " + piJava);
        double piApprox = 0.0;
        for (int i = 0; i < repsNum; i++) {
            double denominator = 2 * i + 1;
            if (i % 2 == 0) {
                piApprox += 1.0 / denominator;
            } else {
                piApprox -= 1.0 / denominator;
            }
        }
        piApprox *= 4;
        System.out.println("pi, approximated: " + piApprox);
	}
}
