public class Test{
    public static void main(String[] args) {
        MagaSubject magazine = new MagaSubject();
        CustObserver a = new CustObserver("A");
        CustObserver b = new CustObserver("B");
        CustObserver c = new CustObserver("C");
        magazine.addObserver(a);
        magazine.addObserver(b);
        magazine.addObserver(c);
        //数据更新后，通知所有已注册的观察者
        magazine.publish();
    }
}