import java.util.Scanner;
public class Exercise06_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time (in millis):");
		long totalMillis = input.nextLong();
		System.out.println(convertMillis(totalMillis));
		input.close();
	}
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		long seconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long minutes = totalMinutes % 60;
		long hours = totalMinutes / 60;
		return hours + ":" + minutes + ":" + seconds;
	}
}
