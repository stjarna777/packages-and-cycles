package ru.netology.sqr;

public class SqrtService {
    public int calcSqrt(int first, int second) {

        int result = 0;

        for (int i = 10; i < 100; i++) {
            if ((i * i >= first) && (i * i <= second)) {
                result = result + 1;
            }
        }
        return result;
    }

}
