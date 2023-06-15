package calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public static void main(String[] args) {
        final String inpExp = GetInput.read();

        Queue<String> numbers;
        Queue<String> operations;

        String numbersArr[] = inpExp.split("[-+*/]");
        String operArr[] = inpExp.split("[0-9]+");
        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operations = new LinkedList<String>(Arrays.asList(operArr));

        Double res = Double.parseDouble(numbers.poll());
        while(!numbers.isEmpty()){
            String opr = operations.poll();
            Operate operate;
            switch (opr){
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Sub();
                    break;
                case "*":
                    operate = new Multiplication();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;
            }
            Double number = Double.parseDouble(numbers.poll());
            res = operate.getResult(res,number);
        }
        System.out.println(res);
    }
}
