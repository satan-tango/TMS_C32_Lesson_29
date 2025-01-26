package com.varkovich.lesson_29.L.wrong;

/**
 * Когда вы наследуетесь, то дочерние классы должны уметь делать все, что и родительские, а
 * так же результат метод родительского класса не должен меняться в дочерних.
 */
public class BarbaraLiskovPrinciple {
    //В данном примере нарушан принцип Барбары Лисков. Дочерний класс GroundRobot меняет логику метода
    //move() родительского класса. Для решения необходимо создавать отдельный метод в дочернем классе
    //с новой логикой.

    class Robot {
        public void move() {
            //Robot can swim.
        }
    }

    class GroundRobot extends Robot {

        @Override
        public void move() {
            //Robot can run.
        }
    }
}
