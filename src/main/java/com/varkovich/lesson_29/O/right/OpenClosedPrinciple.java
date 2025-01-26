package com.varkovich.lesson_29.O.right;

/**
 * Классы, методы должны быть открыты для расширения,
 * но закрыты для модификации
 */
public class OpenClosedPrinciple {

    class BankService {
        Card card;

        public BankService(Card card) {
            this.card = card;
        }

        public void withdraw(double amount) {
            card.withdraw(amount);
        }
    }

    interface Card {
        void withdraw(double amount);
    }

    class VisaCard implements Card {
        @Override
        public void withdraw(double amount) {
            System.out.println("Withdraw money from Visa Card");
        }
    }

    class MasterCard implements Card {
        @Override
        public void withdraw(double amount) {
            System.out.println("Withdraw money from Master Card");
        }
    }
}
