import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int number;
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a Number");
    number = scan.nextInt();

    for (int row=0; row<number; row++ ){
      for (int col=0;col<=row;++col){
        System.out.print("X ");
      }
      System.out.print("X ")
      System.out.println();

    }
    scan.close();
  }
}
