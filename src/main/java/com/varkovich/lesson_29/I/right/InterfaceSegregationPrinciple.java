package com.varkovich.lesson_29.I.right;

/**
 * Принцип гласит, что в интерфейсе должны быть только те методы, которые 100%
 * буду необходимо, если есть неуверенность, что клиенту будет нужно какой-то метод
 * переопределить, то необходимо вынести его в отдельный интерфейс.
 */
public class InterfaceSegregationPrinciple {

    interface Cookable {
        void cook();
    }

    interface Buildable {
        void build();
    }

    class CookRobot implements Cookable {

        @Override
        public void cook() {
            //logic
        }

    }

    class BuilderRobot implements Buildable {

        @Override
        public void build() {
            //logic
        }
    }

}
