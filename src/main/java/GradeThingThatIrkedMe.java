import java.util.Scanner;

public class GradeThingThatIrkedMe {
    public static void main(String[] args) {
        Scanner nameAndGrade = new Scanner(System.in);
        System.out.println("Please enter a Name");
        String name = nameAndGrade.nextLine();
        System.out.println("Please enter their score");
        float score = nameAndGrade.nextFloat();

        if (score >= 90) {
            System.out.println(name + " achieved a score of " + score + " which is equivalent to an A*");
        } else if (score >= 70) {
            System.out.println(name + " achieved a score of " + score + " which is equivalent to an A");
        } else if (score >= 60) {
            System.out.println(name + " achieved a score of " + score + " which is equivalent to a B");
        } else if (score >= 50) {
            System.out.println(name + " achieved a score of " + score + " which is equivalent to a C");
        } else {
            System.out.println(name + " achieved a score of " + score + " which means they failed the test!");
        }
    }
}
