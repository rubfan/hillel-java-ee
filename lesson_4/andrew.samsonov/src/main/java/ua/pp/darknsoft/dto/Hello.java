package ua.pp.darknsoft.dto;

public class Hello {
    private String message;

    public Hello() {
        this.message = "http://localhost:8080/calc/value1/add div mul sub/value2?user_name=Ruslan";
    }

    public Hello(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
