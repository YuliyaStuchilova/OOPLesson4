package ru.gb.lesson4.hw;

public class IsPositive <T> implements IsGood<T>{
    @Override
    public boolean isGood(T item) {
        if((int)item>0){
            return true;
        };
        return false;
    }
}
