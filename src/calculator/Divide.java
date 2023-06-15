package calculator;

public class Divide implements Operate{
    @Override
    public double getResult(double... numbers) {
        double res = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            res /= numbers[i];
        }
        return res;
    }
}
