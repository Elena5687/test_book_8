package ru.book_test_8_1;

public class Test { // Объект передаются по ссылке на них
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    //передать объект
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
