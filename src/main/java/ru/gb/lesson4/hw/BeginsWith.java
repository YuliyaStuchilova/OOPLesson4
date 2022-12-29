package ru.gb.lesson4.hw;

public class BeginsWith<T> implements IsGood<T> {
    @Override
    public boolean isGood(T item) {

        String test = "Hello";
        return ((String) item).startsWith("Hello");
    }


}
