import java.util.Scanner;

public class darts {
    public static void main(String[] args) {
        // hangi bolgede kac tane dart oldugunu saymak icin
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int E = 0;
        int F = 0;
        int undecided = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("* * * * * * DARTS GAME * * * * * * *");
        System.out.println("-----------------------------------");
        System.out.print("Enter the number of darts to be thrown: ");
        int dartsThrown = input.nextInt();
        System.out.println("YOU HAVE " + dartsThrown + " DARTS !");

        // atilan dartlarin oranlarini hesaplamak icin
        double ratesForA;
        double ratesForB;
        double ratesForC;
        double ratesForD;
        double ratesForE;
        double ratesForF;
        double ratesForUndecided;
        do {
            System.out.println("-----------------------------");

            // Math.random() * (maximum - minimum) + minimum;
            double x = (int) (((Math.random() * (1.0 - (-1.1)) + -1.1)) * 10) / 10.0;
            double y = (int) (((Math.random() * (1.0 - (-1.1)) + -1.1)) * 10) / 10.0;

            System.out.println("x: " + (x + "\t"
                            + " y: " + y));

            // x = y

            if ((x == y && x < 0.0 && y < 0.0)){
                System.out.println("Undecided, the point is between region D and region E!! ");
                undecided++;
                System.out.println("undecided: " + undecided); // saymak için

                // x+y = 1
            }else if((x + y == 1.0 && x > 0.0 && y > 0.0)){
                System.out.println("Undecided, the point is between region A and region B!! ");
                undecided++;
                System.out.println("undecided: " + undecided); // saymak için

                // x is positive and y is negative
            } else if (x >= 0.0 && y < 0.0) {
                System.out.println("Dart hits the F");
                F++;
                System.out.println("F: " + F);  // saymak için

                // x is negative and y is positive
            } else if (y >= 0.0 && x < 0.0) {
                System.out.println("Dart hits the C");
                C++;
                System.out.println("C: " + C); // saymak için

                // x and y are both positive and
                // x+y is smaller than 1
            } else if (y >= 0.0 && x >= 0.0 && x + y < 1) {
                System.out.println("Dart hits the A");
                A++;
                System.out.println("A: " + A); // saymak için

                // x and y are both positive and
                // x+y is bigger than 1
            } else if (y >= 0.0 && x >= 0.0 && x + y > 1) {
                System.out.println("Dart hits the B");
                B++;
                System.out.println("B: " + B); // saymak için

                // x and y are both negative and
                // x is smaller than y
            } else if (y <= 0.0 && x <= 0.0 && x < y) {
                System.out.println("Dart hits the D");
                D++;
                System.out.println("D: " + D); // saymak için

                // x and y are both negative and
                // x is bigger than y
            } else if (y <= 0.0 && x <= 0.0 && y < x) {
                System.out.println("Dart hits the E");
                E++;
                System.out.println("E: " + E); // saymak için
            }
            System.out.println("You have " + (dartsThrown - 1) + " more dart ");//kalan dartları gormek icin
            System.out.println();
            dartsThrown--;
        } while (dartsThrown != 0);

        double sumOfDarts = A + B + C + D + E + F + undecided; //toplam atılan dartların sayısı

        System.out.println("REGION STATISTICS :");
        ratesForA = (A * 100) / (sumOfDarts);
        System.out.println("A: " + A + " darts" + " \t (" +(int) (ratesForA * 10) / 10.0 + " %)");

        ratesForB = (B * 100) / (sumOfDarts);
        System.out.println("B: " + B + " darts" + " \t (" +(int) (ratesForB * 10) / 10.0+ " %)");

        ratesForC = (C * 100) / (sumOfDarts);
        System.out.println("C: " + C + " darts" + " \t (" +(int) (ratesForC * 10) / 10.0+ " %)");

        ratesForD = (D * 100) / (sumOfDarts);
        System.out.println("D: " + D + " darts" + " \t (" + (int) (ratesForD * 10) / 10.0+ " %)");

        ratesForE = (E * 100) / (sumOfDarts);
        System.out.println("E: " + E + " darts" + " \t (" +(int) (ratesForE * 10) / 10.0+ " %)");

        ratesForF = (F * 100) / (sumOfDarts);
        System.out.println("F: " + F + " darts" + " \t (" +(int) (ratesForF * 10) / 10.0+ " %)");

        ratesForUndecided = (undecided * 100) / (sumOfDarts);
        System.out.println("Undecided: " + undecided + " darts" + " \t (" + (int) (ratesForUndecided * 10) / 10.0+ " %)");

        System.out.println();

    }
}
