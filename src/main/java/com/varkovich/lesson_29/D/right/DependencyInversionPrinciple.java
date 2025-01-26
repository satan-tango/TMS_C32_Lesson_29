package com.varkovich.lesson_29.D.right;

/**
 * Классы должны зависеть от абстракций, а не от отдельных реализаций.
 */

public class DependencyInversionPrinciple {

    class FileLogger implements Logger {

        public void log(String msg) {
            System.out.println(msg);
        }
    }

    interface Logger {
        public void log(String msg);
    }

    class BankService {
        Logger logger;

        public BankService(Logger logger) {
            this.logger = logger;
        }

        public void withdraw(double amount) {
            //logic
            logger.log("Withdrawal");
        }
    }
}
