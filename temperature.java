import java.util.Scanner;

public class temperature {

  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    String originScale = "";
    String destinationScale = "";
    boolean Oscale = false;
    boolean Dscale = false;
    double answer = 0;


      do {
      System.out.print("\nEnter an origin scale: ");
      originScale = in.nextLine();
      originScale = originScale.toLowerCase();
      if (originScale.equals("f") || originScale.equals("c") || originScale.equals("k")) {
        Oscale = true;
      }
    } while (!Oscale);

    do {
    System.out.print("\nEnter a destination scale: ");
    destinationScale = in.nextLine();
    destinationScale = destinationScale.toLowerCase();
    if (destinationScale.equals("f") || destinationScale.equals("c") || destinationScale.equals("k")) {
      Dscale = true;
    }
  } while (!Dscale);

  System.out.print("\nEnter a temperature: ");
  Double temp = in.nextDouble();

  if (originScale.equals("c") && destinationScale.equals("f")){
    answer = (temp * 1.8) + 32;
  } else if (originScale.equals("c") && destinationScale.equals("k")) {
    answer = temp + 273.15;
  } else if (originScale.equals("f") && destinationScale.equals("c")) {
    answer = (temp-32)*1.8;
  } else if (originScale.equals("f") && destinationScale.equals("k")) {
    answer = ((temp-32)*1.8)+273.15;
  } else if (originScale.equals("k") && destinationScale.equals("c")) {
    answer = temp - 273.15;
  } else if (originScale.equals("k") && destinationScale.equals("f")) {
    answer = ((temp -273.15)*1.8)+32;
  }

  System.out.printf("\n%.1f.", answer);
  }
}
