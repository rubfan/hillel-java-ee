package ua.pp.darknsoft.dto;

public class Result {

    private double value1;
    private double value2;
    private double result;
    private String operation;
    private String user_name;

    public Result(double value1, double value2, String operation, double result, String user_name) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = result;
        this.operation = operation;
        this.user_name = user_name;
    }

    public Result() {
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
