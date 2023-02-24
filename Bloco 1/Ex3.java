import java.util.Scanner;
import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        Stack <Double>operandstack = new Stack <Double>();
		Scanner sc = new Scanner(System.in);
		double result=0;
		double n1,n2=0;
		String operator=null;
		while(sc.hasNextDouble()){
			operandstack.add(sc.nextDouble());
			System.out.println(operandstack.toString());
		}
		while(operandstack.size()>1 && sc.hasNext() ){
			n1=operandstack.pop();
			n2=operandstack.pop();
			operator=sc.next();
			switch(operator) {
				case "+":
					result=n1+n2;
					break;
				case "-":
					result=n1-n2;
					break;
				case "*":	
					result=n1*n2 ;
					break;
				case "/":
					if(n2==0){
						System.err.println("Error!Cannot divide by zero!");
						System.exit(0);
					result=n1/n2;
				}	
					break;
				default:
					System.err.println("Operator invalid!");
					System.exit(0);
			}
		operandstack.add(result);
		System.out.println(operandstack.toString());
    }
    
	}
}
