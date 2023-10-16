import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int number = scanner.nextInt();


        int spaces = number;
        int stars = 1;

        //------------------------------------------------even numbers
        if (number % 2 == 0) {
          for (int i = 0; i < number+1; i++) {

            // Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j <= stars; j++) {
                if (stars%2 ==0){
                System.out.print("* ");
                }
            }

            // Move to the next line
            if (stars%2==0){
            System.out.println();
            }

            //update spaces and stars for the next row
            if(i <= number / 2){
                spaces--;
                stars+=1;
            }
        }
      }else{
      //-------------------------------------------------odd numbers
          for (int i = 1; i <= number; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
            // Update spaces and stars for the next row
            if (i <= number / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
      }
      scanner.close();
    }
}
