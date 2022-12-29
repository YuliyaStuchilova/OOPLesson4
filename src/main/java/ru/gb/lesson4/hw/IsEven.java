package ru.gb.lesson4.hw;

public class IsEven <T> implements IsGood<T>{
    @Override
    public boolean isGood(T item) {
        return ((int) item) % 2 == 0;
    }
}
