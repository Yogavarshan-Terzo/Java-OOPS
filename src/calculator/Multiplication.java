package calculator;

public class Multiplication implements Operate{
    public double getResult(double... numbers){
        double res = 1.0;
        for(double number : numbers){
            res *= number;
        }
        return res;
    }
}
