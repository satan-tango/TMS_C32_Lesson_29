package com.varkovich.lesson_29.O.wrong;

/**
 * Классы, методы должны быть открыты для расширения,
 * но закрыты для модификации
 */
public class OpenClosedPrinciple {

    class BankService {
        //В данном примере нарушен принцип открытости-закрытости, для того чтобы добавить
        //карту другого банка, нам будет нужно изменять метод withdraw.
        //Для решения, необходимо использовать абстракции, создать интерфейс Card, все карты
        //должны от него наследоваться и меть метод withdraw, затем в класс BankService передать
        //интерфейс, который будет хранить ссылку на определенную карту и уже и интерфейса вызвать
        //метод withdraw.

        public void withdraw(String cardType, double amount) {
            switch (cardType) {
                case "visa" -> {
                    //logic
                    System.out.println("Withdrawing from Visa card");
                }
                case "mastercard" -> {
                    //logic
                    System.out.println("Withdrawing from Mastercard card");
                }
            }
        }
    }


}
