package net.whozawhat;
/**
 * AndroidWeekly这个网站是被观察者,它有更新所有的观察者 (这里是程序员) 都会接到相应的通知.
 *
 * @author mrsimple
 */
public class AndroidWeekly extends Observable {
    public void postNewPublication(String content) {
        notifyObservers(content);
    }
}