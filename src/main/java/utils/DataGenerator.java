package utils;

import com.github.javafaker.Faker;
import entities.RegistrationInfo;
import lombok.experimental.UtilityClass;

import java.util.Locale;

/**
 * Утилитный класс - содержит приватный конструктор и статичные методы.
 * Используем для удобства. Вызвали один метод, который сгенерировал сразу 3 поля (имя, телефон, номер карты).
 */
@UtilityClass
public class DataGenerator {

    @UtilityClass
    public static class Registration {
        public static RegistrationInfo generateInfo(String locale) {
            Faker faker = new Faker(new Locale(locale));
            return new RegistrationInfo(faker.name().fullName(),
                    faker.phoneNumber().phoneNumber(),
                    faker.finance().creditCard());
        }
    }
}
