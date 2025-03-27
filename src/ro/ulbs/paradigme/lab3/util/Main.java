package ro.ulbs.paradigme.lab3.util;

public class Main {
    public static void main(String[] args)
    {
        PasswordMaker pm1 = PasswordMaker.getInstance();
        PasswordMaker pm2 = PasswordMaker.getInstance();
        PasswordMaker pm3 = PasswordMaker.getInstance();

        System.out.println("Parola generată: " + pm1.getPassword());
        System.out.println("getInstance() called: " + PasswordMaker.getInstanceCounter()+"times");
}

}
