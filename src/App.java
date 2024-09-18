import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            inputThenPrintSumAndAverage();
        }

        private static void inputThenPrintSumAndAverage() {
            int sum = 0;
            int count = 0;
            Scanner input = new Scanner(System.in);

            while(true){
                System.out.print("Enter a number: ");
                try {
                    String line = input.nextLine();
                    int num = Integer.parseInt(line);
                    sum += num;
                    count++;
                } catch (Exception e){
                    break;
                }

            }

            int avg = 0;
            if(count == 0){
                avg = 0;
            } else {
                avg = sum / count;
            }

            System.out.print("SUM: " + sum + " AVG: " + avg);
        }

}
