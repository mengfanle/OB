public interface Observer {
    //主题状态改变时,更新通知
    public void update(int version);
}