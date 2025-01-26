package com.varkovich.lesson_29.L.right;

/**
 * Когда вы наследуетесь, то дочерние классы должны уметь делать все, что и родительские, а
 * так же результат метод родительского класса не должен меняться в дочерних.
 */
public class BarbaraLiskovPrinciple {

    class Robot {
        public void move() {
            //Robot can swim.
        }
    }

    class AmphibiousRobot extends Robot {

        @Override
        public void move() {
            super.move();
        }

        public void run(){
            //Robot can run.
        }
    }
}
