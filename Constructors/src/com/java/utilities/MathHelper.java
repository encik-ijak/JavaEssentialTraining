package com.java.utilities;

public class MathHelper {

//    public static final int ADD = 1001;
//    public static final int SUBSTRACT = 1002;

    private int total = 50;

    public MathHelper() {
        System.out.println("Constructor called");
    }

    {
        System.out.println("In instance");
    }

    static {
        System.out.println("In static");
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int addNumber(String prompt, Operation operation) throws NumberFormatException {
        String input = InputHelper.getInput(prompt);
        int value = Integer.parseInt(input);
        switch (operation) {
            case ADD:
                total += value;
                break;
            case SUBSTRACT:
                total -= value;
                break;
        }

        return value;
    }

    public enum Operation {
        ADD, SUBSTRACT;
    }
}
