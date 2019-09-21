package PractiseExercise2;

import java.util.*;

public class StudentDataSpecs
    {
        public void studentDatSpecsFunction(int numberOfStudents)
            {
                Scanner scanner=new Scanner(System.in);
                int i,j,sum=0,value;
                int[] grades=new int[numberOfStudents];
                for(i=0;i<numberOfStudents;i++)
                    {
                        System.out.println("\n Enter the grade of Student "+(i+1)+"\n");
                        value=scanner.nextInt();
                        while(value>100||value<0)
                            {
                                System.out.println("\n Please enter grade again as values should be between 0-100 \n");
                                value=scanner.nextInt();
                            }
                        grades[i]=value;
                        sum+=value;
                    }
                ArrayList<Integer> arr1=new ArrayList<Integer>();
                for (i=0;i<numberOfStudents;i++)
                    {
                        arr1.add(grades[i]);
                    }
                Collections.sort(arr1);
                System.out.println("\n Average of all this "+numberOfStudents+" students is = "+(sum/numberOfStudents));
                System.out.println("\n Minimum mark among all "+numberOfStudents+" students is = "+arr1.get(0));
                System.out.println("\n Maximum mark among all "+numberOfStudents+" students is = "+arr1.get(arr1.size()-1));
            }
    }
