// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner; // Import Scanner for reading input

public class Question2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter weight: ");
    double weight = scanner.nextDouble();
    System.out.println("Weight entered: " + weight + "Kg");
    System.out.print("Enter Height: ");
    double height = scanner.nextDouble();
    System.out.println("Height Entered" + height + " cm");
    double BMI = weight / ((height/100) * (height/100));
    System.out.println("BMI is "+ BMI);
  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}