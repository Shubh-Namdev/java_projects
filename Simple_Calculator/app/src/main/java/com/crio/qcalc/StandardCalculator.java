package com.crio.qcalc;

public class StandardCalculator {
    protected double result=0;

    public double getResult() {
        return this.result;
    }

    public void setResult(double res) {
        //some validation
        this.result = res;
    }

    public void clearResult() {
        this.result = 0;
    }

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public final void add(int num1, int num2) {
        int sum = num1+num2;
        setResult(sum);
    }

    public final void add(double num1, double num2) {
        double sum = num1 + num2;
        if (sum == Double.MAX_VALUE || sum == Double.POSITIVE_INFINITY) 
            throw new ArithmeticException("Double Overflow");

        setResult(sum);
    }

    public final void subtract(int num1, int num2) {
        int sub = num1-num2;
        setResult(sub);
    }

    public final void subtract(double num1, double num2) {
        double sub = num1-num2;
        if (sub == -Double.MAX_VALUE || sub == Double.NEGATIVE_INFINITY)
           throw new ArithmeticException("Double underflow");

        setResult(sub);
    }

    public final void multiply(int num1, int num2) {
        int mul =  num1*num2;
        setResult(mul);
    }

    public final void multiply(double num1, double num2) {
        double mul =  num1*num2;
        if(mul == Double.MAX_VALUE || mul == Double.POSITIVE_INFINITY || mul == Double.NEGATIVE_INFINITY)
          throw new ArithmeticException("Double overflow");
        setResult(mul);
    }

    public final void divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divide By Zero Error");
        }
        double div = num1/num2;
        setResult(div);
    }

    public final void divide(double num1, double num2) {
        if (num2 == 0.0) {
            throw new ArithmeticException("Divide By Zero Error");
        }
        double div = num1/num2;
        setResult(div);
    }

    public void printResult() {
        System.out.println("Standard calculator result :"+this.result);
    }
}
