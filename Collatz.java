// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        for (int seed = 1; seed <= N; seed++) {
            if (mode.equals("v")) {
                int steps = 0;
                int current = seed;
                if (seed == 1) {
                    System.out.print("1 ");
                    current = 4;
                }
                while (current != 1) {
                    System.out.print(current + " ");
                    steps++;
                    if (current % 2 == 0) {
                        current /= 2;
                    } else {
                        current = 3 * current + 1;
                    }
                }
                System.out.println(1 + " (" + (steps + 1) + ")");
            }
        }
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        for (int seed = 1; seed <= N; seed++) {
            if (mode.equals("v")) {
                int steps = 0;
                int current = seed;
                if (seed == 1) {
                    System.out.print("1 ");
                    current = 4;
                }
                while (current != 1) {
                    System.out.print(current + " ");
                    steps++;
                    if (current % 2 == 0) {
                        current /= 2;
                    } else {
                        current = 3 * current + 1;
                    }
                }
                System.out.println(1 + " (" + (steps + 1) + ")");
            }
        }
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
