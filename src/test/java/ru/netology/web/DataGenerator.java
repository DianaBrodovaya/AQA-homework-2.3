package ru.netology.web;

import com.github.javafaker.Faker;
import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Data
public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));

    public static String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {
        String[] myCityList = new String[]{"Абакан", "Анадырь", "Архангельск", "Астрахань", "Барнаул", "Биробиджан",
                "Благовещенск", "Великий Новгород", "Владивосток", "Владикавказ", "Владимир", "Вологда",
                "Горно-Алтайск", "Йошкар-Ола", "Калининград", "Калуга", "Краснодар", "Магас", "Махачкала",
                "Москва", "Нарьян-Мар", "Ростов-на-Дону", "Рязань", "Салехард", "Самара", "Санкт-Петербург", "Саранск",
                "Саратов", "Симферополь", "Ульяновск", "Хабаровск", "Ханты-Мансийск", "Чебоксары", "Южно-Сахалинск"};
        int city = (int) Math.floor(Math.random() * myCityList.length);
        return myCityList[city];
    }

    public static String generateName() {
        return faker.name().firstName().replace("ё", "е") + " "
                + faker.name().lastName().replace("ё", "е");
    }

    public static String generatePhone() {
        return faker.phoneNumber().phoneNumber();
    }
}