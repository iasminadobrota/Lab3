package ro.ulbs.paradigme.lab3.util;

import java.util.Random;

public class PasswordMaker {
    private static final PasswordMaker instance;

    private final String magicString;
    private final String name;
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5;
    private static int instanceCounter = 0;

    static { // Bloc static pentru inițializare
        instance = new PasswordMaker("DefaultUser");
    }

    private PasswordMaker(String name) { // Constructor privat
        this.name = name;
        this.magicString = StringRandomizer.generateRandomString(20);
    }

    public static PasswordMaker getInstance() {
        instanceCounter++;
        return instance;
    }
    public static int getInstanceCounter()
    {
        return instanceCounter;
    }
    public String getPassword() {

        Random random = new Random();

        String randomPart = StringRandomizer.generateRandomString(MAGIC_NUMBER);
        StringBuilder magicPart = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(magicString.length());

        }

        String nameLength = String.valueOf(name.length());
        int randomInt = random.nextInt(51);

        return randomPart + magicPart + nameLength + randomInt;
    }
}
