package calculator;

public class Add implements Operate {

    @Override
    public double getResult(double... numbers) {
        double res = 0.0;
        for(double number : numbers ){
            res += number;
        }
        return res;
    }
}
