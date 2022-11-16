/* Jeffrey Hoyt
 * [W]11/16/2022
 */
import java.util.Scanner;
public class Exercise06_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("The number in reverse order is ");
		reverse(number);
		input.close();
	}
	public static void reverse(int num) {
		if (num < 0){
			System.out.print("-");
			num = num * -1;
		}
		if (num == 0) {
			System.out.println("0");
		}else
		while (num != 0) {
			System.out.print(num % 10);
			num = num / 10;
		}
	}
}