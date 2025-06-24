import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1.Write a program that checks the role of the user


        // get input from user
        System.out.println("This program knows the role from the user");
        System.out.println("what is your role? ");
        String answer = input.nextLine();

        //check if the user equals admin , user , superuser and print the result
        if(answer.equals("admin"))
        {
            System.out.println("welcome admin");
        }
        else if(answer.equals("superuser"))
        {
            System.out.println("welcome superuser");
        }
        else if (answer.equals("user"))
            System.out.println("welcome user");
        else
            System.out.println("you are welcome");





        //2.Take three numbers from the user and print the greatest number.



        //get the input from user
        System.out.println("enter 3 number To know who is the greatest");
        System.out.println("what is the 1st number:");
        int num1 = input.nextInt();
        System.out.println("what is the 2st number:");
        int num2 = input.nextInt();
        System.out.println("what is the 3st number:");
        int num3 = input.nextInt();

        //check what number is greatest and printed
        if(num1>num2 && num1>num3)
        {
            System.out.println("the greatest number is: "+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("the greatest number is: "+num2);
        }
        else if(num3>num2 && num3>num1)
        {
            System.out.println("the greatest number is: "+num3);
        }


        //Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday.

        //get input from user
        System.out.println("Enter a number to find out what it equals per week: ");
        int number = input.nextInt();


        //switch statment to know what is Numbers that balance with the days of the week
        // and print the weekdays
        switch (number) {
            case 1: {
                System.out.println("Sunday");
                break;
            }
            case 2: {
                System.out.println("Monday");
                break;
            }
            case 3: {
                System.out.println("Tuesday");
                break;
            }
            case 4: {
                System.out.println("Wednesday");
                break;
            }
            case 5: {
                System.out.println("Thursday");
                break;
            }
            case 6: {
                System.out.println("Friday");
                break;
            }
            case 7: {
                System.out.println("Saturday");
                break;
            }
        }



            //4. Write a program that takes a numeric score as input and prints
            //the corresponding letter grade using the following grading scale:

            //get input from the user
            System.out.println("Enter your numeric score: ");
            int number_1 = input.nextInt();

            // if , else if , else To compare the numbers and then determine the grade and printed.
            if(number_1>=90 && number_1<=100)
            {
                System.out.println(" Your Letter Grade: "+ "A");
            }
            else if (number_1>=80 && number_1<=89)
            {
                System.out.println(" Your Letter Grade: "+ "B");
            }
            else if (number_1>=70 && number_1<=79)
            {
                System.out.println(" Your Letter Grade: "+ "C");
            }
            else if (number_1>= 60&& number_1<=69)
            {
                System.out.println(" Your Letter Grade: "+ "D");
            }
            else if (number_1<=59)
            {
                System.out.println(" Your Letter Grade: "+ "F");
            }
            else
                System.out.println("You have entered the wrong number.");




                //5. Write a Java program that takes a person's age as input and
    //categorizes them into one of three age categories: "Child,"
    //"Teenager," or "Adult" using an if statement.

        //get input from user
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        // Check the user's age by using the IF statement and print the result.
        if(age<13 )
        {
            System.out.println("you are Child.");

        }
        else if(age>13 && age<=19)
        {
            System.out.println("You are an Teenager.");
        }
       else if(age>=20)
        {
            System.out.println("You are an Adult.");
        }
       else if(age>=64 && age<=125)
        {
            System.out.println("You are old age.");
        }

        else
            System.out.println("you enter rong number.");
    }





        }


