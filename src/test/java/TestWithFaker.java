import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import entities.RegistrationInfo;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.DataGenerator;

import java.util.Locale;

public class TestWithFaker {

    private static Faker faker;

    @BeforeAll
    static void setUpAll() {
        faker = new Faker(new Locale("ru"));
    }

    @Test
    void shouldGenerateTestData() {
        String name = faker.name().fullName();
        String phone = faker.phoneNumber().phoneNumber();
        String cardNumber = faker.finance().creditCard(CreditCardType.MASTERCARD);
        printTestData(name, phone, cardNumber);
    }

    @Test
    void shouldGenerateTestDataUsingUtils() {
        RegistrationInfo info = DataGenerator.Registration.generateInfo("ru");
        printTestData(info);
    }

    private void printTestData(String name, String phone, String cardNumber) {
        System.out.println(StringUtils.repeat("=", 30));
        System.out.println(name + "\n" + phone + "\n" + cardNumber);
        System.out.println(StringUtils.repeat("=", 30));
    }

    private void printTestData(entities.RegistrationInfo registrationInfo) {
        printTestData(registrationInfo.getName(), registrationInfo.getPhone(), registrationInfo.getCardNumber());
    }
}
