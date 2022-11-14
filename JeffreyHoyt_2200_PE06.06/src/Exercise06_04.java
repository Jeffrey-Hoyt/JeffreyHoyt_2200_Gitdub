/* Jeffrey Hoyt
 * [M]11/14/2022
 */
import java.util.Scanner;
public class Exercise06_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("The number in reverse order is ");
		reverse(number);
	}
	public static void reverse(int num) {
		while (num != 0) {
			int remainder = num % 10;
			System.out.print(remainder);
			num = num / 10;
		}
	}
}
