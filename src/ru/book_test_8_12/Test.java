package ru.book_test_8_12;

public class Test {
    //Возврат объекта
    int a;
    Test(int i){
        a = i;
    }
    Test incrByTen(){
        Test temp = new Test(a+10);
        return temp;
    }
}
