//ex 1

//107323


public class Ex1{

    public static void main(String args[]) {

        if(args.length>3){
            System.err.println("Error!-1");
            System.exit(0);
        }
        
        for(int i=0;i<args[0].length();i++){
            if(!((args[0].charAt(i)>='0' && args[0].charAt(i)<='9') || args[0].charAt(i)=='.')){
                System.err.println("Error!1");
                System.exit(0);
            }
        }
        for(int i=0;i<args[2].length();i++){
            if(!((args[2].charAt(i)>='0' && args[2].charAt(i)<='9') || args[2].charAt(i)=='.')){
                System.err.println("Error!2");
                System.exit(0);
            }
        }

        double number1=Double.parseDouble(args[0]);
        double number2=Double.parseDouble(args[2]);
        double result=0;
        

        switch(args[1]){
            case "+":
                result=number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "*":
                result=number1*number2;
                break;
            case "/":
                result=number1/number2;
                break;
            default:
                System.err.println("Error!0");

        }

        System.out.print("\nO resultado é: "+ result + "\n\n");


    }
}