package com.task_005_Address;

/**
 * Создать класс с именем Address. В теле класса требуется создать поля:
 * index, country, city, street, house, apartment.
 * Для каждого поля, создать метод с двумя методами доступа (get, set)
 * Создать экземпляр класса Address.
 * В поля экземпляра записать информацию о почтовом адресе.
 * Выведите на экран значения полей, описывающих адрес.
 */

public class Main {
    public static void main(String[] args) {

        Address address = new Address();

        address.setIndex(61121);
        address.setCountry("Ukraine");
        address.setCity("Kharkov");
        address.setStreet("Traktorobudivnykiv");
        address.setHouse(134);
        address.setApartment(124);

        System.out.printf("Index: %1$s\n", address.getIndex());

        System.out.printf("Country: %1$s\n", address.getCountry());

        System.out.printf("City: %1$s\n", address.getCity());

        System.out.printf("Street: %1$s\n", address.getStreet());

        System.out.printf("House: %1$s\n", address.getHouse());

        System.out.printf("Apartment: %1$s\n", address.getApartment());


    }
}
