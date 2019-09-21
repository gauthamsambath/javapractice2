package PractiseExercise2;

import java.util.Scanner;

public class MemberVariable
    {
        private int age,salary;
        private String name;
        public Member member=new Member();
        public void getValuesOfMember()
            {
                Scanner scanner=new Scanner(System.in);
                System.out.println("\n Enter the name of member \n");
                name=scanner.next();
                member.setName(name);
                System.out.println("\n Enter the age \n");
                age=scanner.nextInt();
                member.setAge(age);
                System.out.println("\n Enter the salary \n");
                salary=scanner.nextInt();
                member.setSalary(salary);
            }
    }
