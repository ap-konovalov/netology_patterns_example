package entities;

import lombok.Data;

/**
 * Data класс (класс данных) - содержит только поля и простейшие методы
 * для доступа к ним(геттеры и сеттеры).
 * Это просто контейнеры для данных,используемых другими классами.
 */

@Data
public class RegistrationInfo {
    private final String name;
    private final String phone;
    private final String cardNumber;

//    public RegistrationInfo(String name,String phone, String cardNumber){
//        this.name = name;
//        this.phone = phone;
//        this.cardNumber = cardNumber;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public String getPhone(){
//        return this.phone;
//    }
//
//    public String getCardNumber(){
//        return this.cardNumber;
//    }
}
