package PractiseExercise2;

public class PrintAllIntFactorial
    {
        public void printAllIntFactorialFunction()
            {
                int fact = 1,i=1;
                int x = 2;
                int factnext=1,flag=0;
                while (fact <= Integer.MAX_VALUE&&fact>0) {
                    if(flag==0)
                        {
                            System.out.println("The factorial of " + i + " = " + fact + "\n");
                        }
                    else
                        {
                            System.out.printf("The factorial of "+i+" is beyond range of int \n");
                            break;
                        }
                    factnext=fact*x;
                        if(factnext>fact)
                            {
                                fact=fact*x;
                                x++;
                                i++;
                            }
                        else
                            {
                                flag=1;
                                i++;
                            }

                }
            }
    }
