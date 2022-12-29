package ru.gb.lesson4.hw;

//Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
//        boolean isGood (T item);
//        Создайте следующие детские классы:
//        IsEven — ему дают целое число, он одобряет его, если оно чётное
//        IsPositive — ему дают целое число, он одобряет его, если оно положительное
//        BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
//        BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет,
//        что она начинается с того, что он запомнил
//        Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа,
//        и одобрятель IsGood.
//        Функция возвращает новую коллекцию, куда входят только одобренные элементы из
//        коллекции.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IsEven<Integer> integerIsEven = new IsEven<>();
        System.out.println(integerIsEven.isGood(6));

        IsPositive<Integer> integerIsPositive = new IsPositive<>();
        System.out.println(integerIsPositive.isGood(-2));

        BeginsWithA<String> stringBeginsWithA = new BeginsWithA<>();
        System.out.println(stringBeginsWithA.isGood("apple"));

        BeginsWith<String> stringBeginsWith = new BeginsWith<>();
        System.out.println(stringBeginsWith.isGood("Hello, Ivan!"));

        Main main = new Main();
        List<Integer> result = Arrays.asList(2, -4, 5, 6, 1, 56, -78, 55);
        System.out.println(main.filter(result, integerIsPositive));

        List<Integer> result1 = Arrays.asList(2, 4, 5, 6, 1, 56, 78, 55);
        System.out.println(main.filter(result1, integerIsEven));

    }


    public <T> List<T> filter(List<T> list, IsGood<T> isGood) {
        List<T> result = new ArrayList<>();
        for (T param : list) {
            if (isGood.isGood(param)) {
                result.add(param);
            }
        }
        return result;
    }
}