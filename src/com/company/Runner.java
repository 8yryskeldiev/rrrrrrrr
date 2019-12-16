package com.company;

public class Runner extends  Thread {
    private int number = 1;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(getName() + " берет палочку");
        if (getNumber() - 1 == 5) {
            System.out.println("Runner 5 бежит к финишу");
        } else if (getNumber() == 1) {
            System.out.println(getName() + " бежит к Runner " + getNumber());
            System.out.println("Runner " + getNumber() + " берет палочку");
        } else {
            System.out.println(getName() + "  бежит к Runner  " + getNumber());
        }
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
