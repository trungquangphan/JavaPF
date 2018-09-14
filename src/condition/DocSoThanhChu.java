package condition;

import java.util.Scanner;

public class DocSoThanhChu {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n, hundreds, tens, ones;
            String s, s1, s2;
            System.out.println("Input a number: ");
            n = scanner.nextInt();
            if (n / 1000 > 0) {
                System.out.println("out of ability");
            } else {
                ones = n % 10;
                tens = (n / 10) % 10;
                hundreds = n / 100;
                if (hundreds == 0){
                    s1 = "";
                } else {
                    s1 = toString(hundreds) + " hundred and ";
                }
                if (tens * 10 + ones < 20) {
                    s2 = toString(tens*10+ones);
                } else {
                    s2 = toString2(tens) + " " + toString(ones);
                }
                s = s1 + s2;
                System.out.printf(s);
            }
        }
        static String toString(int x) {
            String string;
            switch (x) {
                case 1: string = "one"; break;
                case 2: string =  "two";break;
                case 3: string =  "three";break;
                case 4: string =  "four";break;
                case 5: string =  "five";break;
                case 6: string =  "six";break;
                case 7: string =  "seven";break;
                case 8: string =  "eight";break;
                case 9: string =  "nine";break;
                case 10: string = "ten";break;
                case 11: string = "eleven";break;
                case 12: string = "twelve";break;
                case 13: string = "thirteen";break;
                case 14: string = "fourteen";break;
                case 15: string = "fifteen";break;
                case 16: string = "sixteen";break;
                case 17: string = "seventeen";break;
                case 18: string = "eighteen";break;
                case 19: string = "nineteen";break;
                default: string = "";
            }
            return string;
        }
        static String toString2(int x) {
            String string;
            switch (x) {
                case 2: string =  "twenty";break;
                case 3: string =  "thirty";break;
                case 4: string =  "forty";break;
                case 5: string =  "fifty";break;
                case 6: string =  "sixty";break;
                case 7: string =  "seventy";break;
                case 8: string =  "eighty";break;
                case 9: string =  "ninety";break;
                default: string = "";
            }
            return string;
        }


}
