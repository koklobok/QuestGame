package org.javajunior.quest.dialog.task;


public class LogicTaskOne implements LogicTask{

    public LogicTaskOne(){
        System.out.println("Для того чтобы пройти дальше ты должен разгадать следующюю задачу: \n");
        System.out.println("********************************************************************");
        System.out.println(" Пять работников за 5 часов засыпали 5 метров болота, \n сколько потребуется работников" +
                " чтобы засыпать болото полностью \n (100 метров) за 100 часов ?");
        System.out.println("********************************************************************");
    }

    @Override
    public boolean checkAnswer(int answer) {
        System.out.println("Твой ответ :" + answer);
        try {
            Thread.sleep(5000);
            if (answer != 5) {
                System.out.println("Твой ответ не верен попробуй еще раз\n");
                Thread.sleep(1000);
                return false;
            }
            System.out.println("Ты ответил правильно, посмотрим сможешь ли ты решить" +
                    " еще оду задачку\n");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
