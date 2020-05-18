package com.example.demo.Exceptions;

public class ApplicationError {
    private int code;
    private String messege;
    private String details;

    public ApplicationError(){};
    public ApplicationError(int code, String messege) {
        this.code = code;
        this.messege = messege;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
