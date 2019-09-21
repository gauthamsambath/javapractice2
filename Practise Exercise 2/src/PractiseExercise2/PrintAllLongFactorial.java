package PractiseExercise2;

public class PrintAllLongFactorial
    {
        public void printAllLongFactorialFunction() {
            long fact = 1, i = 1;
            long x = 2;
            long factnext = 1;
            int flag = 0;
            while (fact <= Long.MAX_VALUE && fact > 0) {
                if (flag == 0) {
                    System.out.println("The factorial of " + i + " = " + fact + "\n");
                } else {
                    System.out.printf("The factorial of " + i + " is beyond range of LONG \n");
                    break;
                }
                factnext = fact * x;
                if (factnext > fact) {
                    fact = fact * x;
                    x++;
                    i++;
                } else {
                    flag = 1;
                    i++;
                }

            }
        }

    }
