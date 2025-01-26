package com.varkovich.lesson_29.I.wrong;

/**
 * Принцип гласит, что в интерфейсе должны быть только те методы, которые 100%
 * буду необходимо, если есть неуверенность, что клиенту будет нужно какой-то метод
 * переопределить, то необходимо вынести его в отдельный интерфейс.
 */
public class InterfaceSegregationPrinciple {

    interface Robot {
        void cook();

        void build();
    }

    class CookRobot implements Robot {
        //Нарушен принцип разделение интерфейсов. Интерфейс Robot, содержит методы, которые могут
        //не пригодиться определенным реализациям. Поэтому необходимо разбить интерфейс на два интерфейса.

        @Override
        public void cook() {
            //logic
        }

        @Override
        public void build() {
            throw new UnsupportedOperationException();
        }
    }

    class BuilderRobot implements Robot {
        @Override
        public void cook() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void build() {
            //logic
        }
    }

}
