package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Error");
        error.printInfo();
    }
    public Error(boolean active, int status, String message){
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public Error(){
    }

    public void printInfo() {
        System.out.println("Status: " + status);
        System.out.println("Active: " + active);
        System.out.println("Message: " + message);
    }
}
