package ru.book_test_8_12;

public class Factorial {
    //Это рекурсивный метод
    int fact(int n){
        int result;

        if (n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }

}
