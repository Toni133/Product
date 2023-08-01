package ru.netology.javaqa.Product;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("Товар с id = " + id + "не найден");
    }
}
