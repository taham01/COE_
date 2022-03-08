import java.util.Scanner;
public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    
    public Calculator(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        num1 = scan.nextInt();
        System.out.print("Input the second number: ");
        num2 = scan.nextInt();
        System.out.print("Input the first number: ");
        operator =scan.nextLine();
        scan.close();
        switch (operator){
                case "+":
                    add (num1, num2);
                    break;
                  
                case "-":
                    subtract(num1, num2);
                    break;
                case "x":
                    multiplication(num1,num2);
                    break;
                case "/":
                    division(num1, num2);
                    break;
                        
        }
        
        }
        
    public String add(int a, int b) { 

        int result = num1+num2;
        return result+"";
        
}
    public String subtract(int a, int b) { 

        int result = num1-num2;
        return result+"";
        
    }
    public String multiplication(int a, int b) { 

        int result = num1*num2;
       
        return result+"";
    }
    public String division(int a, int b) { 

        int result = num1/num2;
        return result+"";
    }    

}
    