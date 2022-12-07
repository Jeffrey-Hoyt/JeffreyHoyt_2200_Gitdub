/* Jeffrey Hoyt
 * 11/30/2022 [W]
 */
import java.util.Scanner;
public class Exercise07_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numOfStudents = input.nextInt();
		double[] scores = new double[numOfStudents];
		double best = 0;
		System.out.print("Enter " + numOfStudents + " scores: ");
		for (int i = 0;i<numOfStudents; i++) {
			scores[i] = input.nextDouble();
			if (scores[i] > best) {
				best = scores[i];
			}
		}
		char letterGrade;
		for (int i = 0;i<numOfStudents;i++) {
			if (scores[i] >= best-10) {
				letterGrade = 'A';
			}else if (scores[i] >= best-20) {
				letterGrade = 'B';
			}else if (scores[i] >= best-30) {
				letterGrade = 'C';
			}else if (scores[i] >= best-40) {
				letterGrade = 'D';
			}else {
				letterGrade = 'F';
			}
			System.out.println("Student " + i + " scored " + scores[i]
					+ " with a letter grade of " + letterGrade);
		}
		input.close();
	}

}
