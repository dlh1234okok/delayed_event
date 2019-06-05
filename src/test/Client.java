package test;

import delayed_prototype.DelayGetWithImpl;
import excutor.ExecutorServer;

/**
 * @author: dulihong
 * @date: 2019/6/5 17:21
 */
public class Client {

    public static void main(String[] args) {
        DelayGetWithImpl delayGetWith = DelayGetWithImpl.getInstance();
        delayGetWith.put(10000L, "test");
        ExecutorServer e = new ExecutorServer();
        e.startThread();
    }

}
