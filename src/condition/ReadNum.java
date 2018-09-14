package condition;

import java.util.Scanner;

/**
 * Name of method
 * do not create method
 * algorithm optimization
 */
public class ReadNum {

    public static void main(String[] args) {
        docSoThanhChu();
    }

    public static void docSoThanhChu() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ( three digit) :  ");
        int numRead = scanner.nextInt();

        int hundreds = 0, dozens = 0, unit = 0;
        unit = (numRead % 100) % 10;
        System.out.println("Per unit is: " + unit);
        dozens = (numRead / 10) % 10;
        System.out.println("Dozens is: " + dozens);
        hundreds = (numRead) / 100;
        System.out.println("Hundreds is: " + hundreds);

        if (hundreds != 0) {
            switch (hundreds) {
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
        }

        if (dozens != 0) {
            if (dozens == 1) {
                switch (unit) {
                    case 0:
                        System.out.print(" ten");
                        return;
                    case 1:
                        System.out.print(" eleven");
                        return;
                    case 2:
                        System.out.print(" twelve");
                        return;
                    case 3:
                        System.out.print(" thirteen");
                        return;
                    case 4:
                        System.out.print(" fourteen");
                        return;
                    case 5:
                        System.out.print(" fifteen");
                        return;
                    case 6:
                        System.out.print(" sixteen");
                        return;
                    case 7:
                        System.out.print(" seventeen");
                        return;
                    case 8:
                        System.out.print(" eighteen");
                        return;
                    case 9:
                        System.out.print(" nineteen");
                        return;
                }
            } else  // dozens #0 #1
            {
                switch (dozens) {
                    case 2:
                        System.out.print(" twenty");
                        break;
                    case 3:
                        System.out.print(" thirty");
                        break;
                    case 4:
                        System.out.print(" fourty");
                        break;
                    case 5:
                        System.out.print(" fity");
                        break;
                    case 6:
                        System.out.print(" sixty");
                        break;
                    case 7:
                        System.out.print(" seventy");
                        break;
                    case 8:
                        System.out.print(" eighty");
                        break;
                    case 9:
                        System.out.print(" ninety");
                        break;
                }
            }
        }else {
            if( (hundreds == 0 && unit != 0 ) || unit == 0  ) System.out.println();
            else System.out.print(" zero");
        }
        if (unit != 0) {
            switch (unit) {
                case 1:
                    System.out.print(" one ");
                    break;
                case 2:
                    System.out.print(" two ");
                    break;
                case 3:
                    System.out.print(" three ");
                    break;
                case 4:
                    System.out.print(" four ");
                    break;
                case 5:
                    System.out.print(" five ");
                    break;
                case 6:
                    System.out.print(" six ");
                    break;
                case 7:
                    System.out.print(" seven ");
                    break;
                case 8:
                    System.out.print(" eight ");
                    break;
                case 9:
                    System.out.print(" nine ");
                    break;
            }
        }else{
            if(hundreds == 0){
                if(dozens == 0) System.out.print("zero");
            }
        }
    }
}
