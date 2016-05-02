package org.javajunior.quest.dialog.start;


public class LogicTaskOne {

    private int answer = 0;

    public LogicTaskOne(){
        System.out.println("Для того чтобы пройти дальше ты должен разгадать следующюю задачу: \n");
        System.out.println("********************************************************************");
        System.out.println(" Пять работников за 5 часов засыпали 5 метров болота, \n сколько потребуется работников" +
                " чтобы засыпать болото полностью \n (100 метров) за 100 часов ?");
        System.out.println("********************************************************************");
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }


}
