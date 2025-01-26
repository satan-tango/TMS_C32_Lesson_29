package com.varkovich.lesson_29.D.wrong;

/**
 * Классы должны зависеть от абстракций, а не от отдельных реализаций.
 */
public class DependencyInversionPrinciple {

    class FileLogger {

        public void log(String msg) {
            System.out.println(msg);
        }
    }

    class BankService {
        //Нарушен принцип инверсии зависимостей, наш класс BankService зависит от конкретной
        //реализации Logger, а именно FileLogger, необходимо создать интерфейс Logger, реализовать
        //контракт в FileLogger, и уже в поле интерфейса в сервисе передать ссылку на FileLogger,
        //таким образом, если мы захотим поменять Logger на CloudLogger, нам нужно будет подставить
        //другую реализацию, при этом ничего не изменяю в самом BankService.

        FileLogger logger = new FileLogger();

        public void withdraw(double amount) {
            //logic
            logger.log("Withdrawal");
        }
    }
}
