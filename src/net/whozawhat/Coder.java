package net.whozawhat;

public class Coder implements Observer {
    public String name ;

    public Coder(String aName) {
        name = aName ;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println( "Hi, " +  name + ", AndroidWeekly更新啦, 内容 : " + arg);
    }

    @Override
    public String toString() {
        return "Coder : " + name;
    }

}
