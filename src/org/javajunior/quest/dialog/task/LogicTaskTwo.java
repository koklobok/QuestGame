package org.javajunior.quest.dialog.task;


public class LogicTaskTwo implements LogicTask{

    public LogicTaskTwo() {
        System.out.println("Для того чтобы подраться с драконом ты должен разгадать еще одну задачу: \n");
        System.out.println("********************************************************************");
        System.out.println("В этом болоте один рыбак поймал огромную рыбу и решил узнать сколько \n рыба весит целиком  " +
                "но рыба на весы целиком не помещалась, \n поэтому он взял и взвесил ее частями. \n Хвост весил 40 кг, голова" +
                " весила столько же, сколько хвост с половиной туловища,\n  туловище весило столько же, сколько голова с хвостом. " +
                "Сколько рыба весила целиком?");
        System.out.println("********************************************************************");
    }

    @Override
    public boolean checkAnswer(int answer) {
        System.out.println("Твой ответ :" + answer);
        try {
            Thread.sleep(5000);
            if (answer != 320) {
                System.out.println("Твой ответ не верен попробуй еще раз\n");
                Thread.sleep(1000);
                return false;
            }
            System.out.println("Ты ответил правильно, теперь ты сможешь сразится с драконом\n");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
