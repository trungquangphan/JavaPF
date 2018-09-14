package condition;

import java.util.Scanner;

/**
 * create method
 * ---
 * if else format
 * algorithm optimization
 *
 */
public class ReadTheNumber {
    public static void main( String[ ] args){
        int number;
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = scanner.nextInt();
        if( number < 13)
            string = lessThan13(number);
        else if( number >= 13 && number < 20)
            string = lessThan20(number);
        else if( number >=20 && number <100)
            string = moreThan20(number);
        else if( number >= 100 && number <=999)
            string = moreThan99(number);
        else string = "out of ability";
        System.out.print("Read the number: " + string);
    }
    public static String lessThan13( int number){
        String string = "value";
        switch(number){
            case 1:
                string = "one";
                break;
            case 2:
                string = "two";
                break;
            case 3:
                string = "three";
                break;
            case 4:
                string = "four";
                break;
            case 5:
                string = "five";
                break;
            case 6:
                string = "six";
                break;
            case 7:
                string = "seven";
                break;
            case 8:
                string = "eight";
                break;
            case 9:
                string = "nine";
                break;
            case 10:
                string = "ten";
                break;
            case 11:
                string = "eleven";
                break;
            case 12:
                string = "twelve";
                break;
        }
        return string;

    }
    public static String lessThan20( int n){
        String string="value";
        n %= 10;
        switch(n){
            case 3:
                string = "thirteen";
                break;
            case 4:
                string = "fourteen";
                break;
            case 5:
                string = "fifteen";
                break;
            case 6:
                string = "sixteen";
                break;
            case 7:
                string = "seventeen";
                break;
            case 8:
                string = "eighteen";

            case 9:
                string = "nineteen";
                break;
        }
        return string;
    }
    public static String moreThan20( int number){
        String hangChuc = "value", hangDonVi = "value";
        int m = number;
        number %= 10;
        m /= 10-number;
        switch(m){
            case 2:
                hangChuc = "twenty";
                break;
            case 3:
                hangChuc = "thirty";
                break;
            case 4:
                hangChuc = "forty";
                break;
            case 5:
                hangChuc = "fifty";
                break;
            case 6:
                hangChuc = "sixty";
                break;
            case 7:
                hangChuc = "seventy";
                break;
            case 8:
                hangChuc = "eightty";
                break;
            case 9:
                hangChuc = "ninety";
                break;
        }
        switch(number){
            case 0:
                hangDonVi = " ";
                break;
            case 1:
                hangDonVi = "one";
                break;
            case 2:
                hangDonVi = "two";
                break;
            case 3:
                hangDonVi = "three";
                break;
            case 4:
                hangDonVi = "four";
                break;
            case 5:
                hangDonVi = "five";
                break;
            case 6:
                hangDonVi = "six";
                break;
            case 7:
                hangDonVi = "seven";
                break;
            case 8:
                hangDonVi = "eight";
                break;
            case 9:
                hangDonVi = "nine";
                break;
        }
        return hangChuc + hangDonVi;
    }
    public static String moreThan99(int n){
        String hangTram = "value", hangChuc = "value" , hangDonVi = "value", add = "and ";
        int ht, hc;
        ht = n;
        n %= 10;
        hc =( ht%100 - n)/10;
        ht = (ht - hc - n)/100;
        switch (ht){
            case 1:
                hangTram = "one hundred ";
                hangChuc = " ";
                hangDonVi = " ";
                break;
            case 2:
                hangTram = "two hundred";
                break;
            case 3:
                hangTram = "three hundred";
                break;
            case 4:
                hangTram = "four hundred";
                break;
            case 5:
                hangTram = "five hundred";
                break;
            case 6:
                hangTram = "six hundred";
                break;
            case 7:
                hangTram = "seven hundred";
                break;
            case 8:
                hangTram = "eight hundred";
                break;
            case 9:
                hangTram = "nine hundred";
                break;
        }
        switch (hc){
            case 1:
                switch(n){
                    case 1:
                        hangChuc = " and ten";
                        break;
                    case 2:
                        hangChuc = " and twenty";
                        break;
                    case 3:
                        hangChuc = " and thirteen";
                        break;
                    case 4:
                        hangChuc = " and fourteen";
                        break;
                    case 5:
                        hangChuc = " and fifteen";
                        break;
                    case 6:
                        hangChuc = " and sixteen";
                        break;
                    case 7:
                        hangChuc = " and seventeen";
                        break;
                    case 8:
                        hangChuc = " and eighteen";

                    case 9:
                        hangChuc = " and nineteen";
                        break;
                }
            case 2:
                hangChuc = "and twenty ";
                break;
            case 3:
                hangChuc = "and thirty ";
                break;
            case 4:
                hangChuc = "and forty ";
                break;
            case 5:
                hangChuc = "and fifty ";
                break;
            case 6:
                hangChuc = "and sixty ";
                break;
            case 7:
                hangChuc = "and seventy ";
                break;
            case 8:
                hangChuc = "and eightty ";
                break;
            case 9:
                hangChuc = "and ninety ";
                break;
            default:  break;
        }
        switch (n){
            case 1:
                hangDonVi = "one";
                break;
            case 2:
                hangDonVi = "two";
                break;
            case 3:
                hangDonVi = "three";
                break;
            case 4:
                hangDonVi = "four";
                break;
            case 5:
                hangDonVi = "five";
                break;
            case 6:
                hangDonVi = "six";
                break;
            case 7:
                hangDonVi = "seven";
                break;
            case 8:
                hangDonVi = "eight";
                break;
            case 9:
                hangDonVi = "nine";
                break;
            default:
                break;
        }
        if( hangTram == "one hundred " && hc == 0) hangDonVi = add + hangDonVi;
        return hangTram + hangChuc + hangDonVi;

    }
}