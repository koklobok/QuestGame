package org.javajunior.quest.dialog.start;


public class LogicTaskTwo {
    private int answer = 0;

    public LogicTaskTwo() {
        System.out.println("Для того чтобы подраться с драконом ты должен разгадать еще одну задачу: \n");
        System.out.println("********************************************************************");
        System.out.println("В этом болоте один рыбак поймал огромную рыбу и решил узнать сколько \n рыба весит целиком  " +
                "но рыба на весы целиком не помещалась, \n поэтому он взял и взвесил ее частями. \n Хвост весил 40 кг, голова" +
                " весила столько же, сколько хвост с половиной туловища,\n  туловище весило столько же, сколько голова с хвостом. " +
                "Сколько рыба весила целиком?");
        System.out.println("********************************************************************");
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
