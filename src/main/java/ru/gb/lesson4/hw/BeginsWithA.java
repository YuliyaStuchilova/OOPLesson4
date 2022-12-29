package ru.gb.lesson4.hw;

public class BeginsWithA<T> implements IsGood<T>{
    @Override
    public boolean isGood(T item) {

        return ((String) item).startsWith("A", 0) ||
                ((String) item).startsWith("a", 0);
    }
}
