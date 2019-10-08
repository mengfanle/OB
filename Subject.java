public interface Subject {
    //添加观察者
    void addObserver(Observer obj);
    //移除观察者
    void deleteObserver(Observer obj);
    //主题方法改变时,通知所有观察者
    void notifyObserver();
}