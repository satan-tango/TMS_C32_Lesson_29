package com.varkovich.lesson_29.S.wrong;

/**
 * Каждый класс (метод) должен отвечать только за одну задачу.
 */
public class SingleResponsibilityPrinciple {

    class BankService {
        //Имеется класс, которые выполняет банковские операции. Так же в этот класс, добавлен метод
        //для оправки уведомления, это нарушает принцип single responsibility, необходимо сделать отдельаный
        //класс для отправки уведомлений.

        public void withdraw(double amount) {
            //logic
        }

        public void deposit(double amount) {
            //logic
        }

        public void sendNotification(String message) {
            //logic
        }
    }

}
