package PractiseExercise2;

import java.util.Scanner;

public class PractiseExerciseMainClass
    {
        public static void main(String[] args)
            {   Scanner  scanner=new Scanner(System.in);
                int choice;
                char decision;
                String word,answer;

                do
                    {
                        System.out.println("\n Enter a choice from the menu \n");
                        System.out.println("1. Check if a number/string is pallindrome \n");
                        System.out.println("2. Check if a number is a power of 4 \n");
                        System.out.println("3. Demonstrate classes \n");
                        System.out.println("4. To check if a number is Even \n");
                        System.out.println("5. Enter number of students and find measures of their grades \n");
                        System.out.println("6. List all the factorials to max INT value \n");
                        System.out.println("7. List all the factorials to max LONG value \n");
                        System.out.println("8. To show Encapsulation of a class \n");
                        choice=scanner.nextInt();
                        switch (choice)
                        {
                            case 1:
                                System.out.println("\n Give the String you want to check ");
                                word=scanner.next();
                                ReverseAndPallindromeCheck reverseAndPallindromeCheck=new ReverseAndPallindromeCheck();
                                answer=reverseAndPallindromeCheck.reverseAndPallindromeCheckFunction(word);
                                System.out.println("\n"+answer+"\n");
                                break;
                            case 2:
                                System.out.println("\n Give the number you want to check \n");
                                long number;
                                number=scanner.nextInt();
                                PowerOfFour powerOfFour=new PowerOfFour();
                                System.out.println("\n the number "+number+ powerOfFour.powerOfFour(number));
                                break;
                            case 3:
                                MemberVariable memberVariable=new MemberVariable();
                                System.out.println("\n Taking in values of member class through member variable class \n");
                                memberVariable.getValuesOfMember();
                                System.out.println("\n Name of member = "+memberVariable.member.getName()+"\n");
                                System.out.println("\n age of member = "+memberVariable.member.getAge()+"\n");
                                System.out.println("\n salary of member = "+memberVariable.member.getSalary()+"\n");
                                break;
                            case 4:
                                System.out.println("\n Give the number you want to check for Even \n");
                                number=scanner.nextLong();
                                EvenNumTest evenNumTest=new EvenNumTest();;
                                boolean value=evenNumTest.isEven(number);
                                System.out.println("\n The number "+number+" is Even "+value+"\n");
                                break;
                            case 5:
                                System.out.println("\n Enter the number of students to check grade \n");
                                int number2=scanner.nextInt();
                                StudentDataSpecs studentDataSpecs=new StudentDataSpecs();
                                studentDataSpecs.studentDatSpecsFunction(number2);
                                break;
                            case 6:
                                PrintAllIntFactorial printAllIntFactorial =new PrintAllIntFactorial();
                                printAllIntFactorial.printAllIntFactorialFunction();
                                break;
                            case 7:
                                PrintAllLongFactorial printAllLongFactorial=new PrintAllLongFactorial();
                                printAllLongFactorial.printAllLongFactorialFunction();
                                break;
                            case 8:
                                User user=new User();
                                System.out.println("\n Enter the first name of User \n");
                                user.setFirstname(scanner.next());
                                System.out.println("\n Enter the Last name of User \n");
                                user.setLastname(scanner.next());
                                System.out.println("\n Enter the age of user \n");
                                int age=scanner.nextInt();
                                if(user.isValid(age)==true)
                                {
                                    user.setAge(age);
                                }
                                else
                                {
                                    while (user.isValid(age)==false)
                                    {
                                        System.out.println("\n Please Type a valid age between 0-100 \n");
                                        age=scanner.nextInt();
                                    }
                                    user.setAge(age);
                                }
                                System.out.println("\n Enter the salary of User \n");
                                user.setSalary(scanner.nextInt());
                                System.out.println("\n Firstname of User = "+user.getFirstname()+"\n");
                                System.out.println("\n Lastname of User = "+user.getLastname()+"\n");
                                System.out.println("\n Fullanme of User ="+user.getFullName()+"\n");
                                System.out.println("\n Age of User ="+user.getAge()+"\n");
                                System.out.println("\n Salary of User = "+user.getSalary()+"\n");
                                break;
                            default:
                                System.out.println("\n Invalid case \n");
                        }
                        System.out.println("\n Press 'y' to continue and 'any key' to exit \n");
                        decision=scanner.next().charAt(0);
                    }while(decision=='y');


            }
    }

