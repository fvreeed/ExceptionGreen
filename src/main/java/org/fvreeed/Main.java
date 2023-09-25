package org.fvreeed;

public class Main {
    public static void main(String[] args) throws OverflowException {
        GreenArray greenArray = new GreenArray(10);
        for (int i = 0; i < 11; i++) {
            try {
                greenArray.add(i, 101);
            } catch (OverflowException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
                System.out.println(e.getLocalizedMessage());
                System.out.println(e);
            }
        }
    }
}