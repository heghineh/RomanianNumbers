package com.company;

public class Number {
    //region Properties
    private long number;
    int counter = 0;
    //endregion

    //region Constructors
    public Number() {
    }

    public Number(long number) {
        this.number = number;
    }
    //endregion

    //region Public Methods
    public int counter(long number) {
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }

    public long counter1(long number) {
        long miavor = number % 10;
        return miavor;
    }

    public long counter2(long number) {
        long tasnavor = number / 10 % 10 * 10;
        return tasnavor;
    }

    public long counter3(long number) {
        long haryuravor = number / 100 % 10 * 100;
        return haryuravor;
    }
    public long counter4(long number) {
        long hazaravor = number / 1000 % 10 * 1000;
        return hazaravor;
    }
    //endregion

    //region Getters and Setters
    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //endregion
}