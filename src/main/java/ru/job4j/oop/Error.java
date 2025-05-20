package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }
    public Error(boolean active,int status,String message) {
        this.active=active;
        this.status=status;
        this.message=message;
    }
    public void popochka(){
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Ошибка: " + message);
    }

    public static void main(String[] args) {
        Error popa=new Error();
        Error popa1= new Error(true,10,"нет ошибки");
        Error popa2=new Error(false,17,"ошибочка");
        popa.popochka();
        popa1.popochka();
        popa2.popochka();
    }

}
