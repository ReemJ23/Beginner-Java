import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Logical operators
        //AND
        int temperature;
        Scanner scan =new Scanner(System.in);
        temperature=scan.nextInt();
        boolean isWarm = temperature>=20&&temperature<=30;
        System.out.println(isWarm);
        //OR
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCreminalRecords = false;
        boolean isEligible=(hasHighIncome||hasGoodCredit)&&!hasCreminalRecords;

        //if statements
        if(temperature>30){
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
        }//we use the curly brackets when we have more than one line
         //if code to be executed if condition is met
        else if(temperature>20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        //Ternary operator (simplified if statement)
        /*
            int income=120_000;
            String className;
            if(income> 100_000)
                className="First";
            else
                className="Economy";
         */
        int income=120_000;
        String className=income>100_000?"First":"Economy";
        //                  condition  ?if true: if false

        //Switch statements
        String role="admin";
        switch(role){
            case "admin":
                System.out.println("You are an Admin");
                break;
            case "moderator":
                System.out.println("You are a Moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
        //Fizz Buzz
        //if the number is divisible by 5 print Fizz
        //if the number is divisible by 3 print Buzz
        //if the number is divisible by 3 and 5 print Fizz Buzz
        //if the number is not divisible by 5 or 3 print the number

        //For loops
        for(int i=1;i<5;i++){
            System.out.println(i+" little monkeys jumping on the bed");
        }

        //while loop
        String input="";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input=scan.next().toLowerCase();
            if(input.equals("quit"))
                break;//this condition is same as while condition, so we can just write true
            if(input.equals("pass"))
                continue;
            System.out.println(input);
        }
//we can't use != to compare strings

        //do while
        //always gets executed at least once
        do{
            System.out.print("Input: ");
            input=scan.next().toLowerCase();
            System.out.println(input);
        }while(!input.equals("quit"));

        //for each
        String[] fruits={"Apple","Mango","Orange"};
        for(String fruit:fruits)
            System.out.println(fruit);
        //for each is forward only
        //you don't have access to the index of each variable
        
    }
}
