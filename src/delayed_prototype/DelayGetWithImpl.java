package delayed_prototype;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;

/**
 * @author: dulihong
 * @date: 2019/5/28 16:36
 */
public class DelayGetWithImpl implements DelayGetWith {

    private static DelayGetWithImpl delayGetWith = new DelayGetWithImpl();

    private DelayQueue<Delayed> delayQueue = new DelayQueue<>();

    @Override
    public void callback() {
        try {
            DelayedQueueConfig take = (DelayedQueueConfig) delayQueue.take();
            System.out.println(take.getMsg());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void put(long delayTime, String msg) {
        long time = System.currentTimeMillis();
        delayQueue.put(new DelayedQueueConfig(time + delayTime, msg));
        System.out.println("put..start" + time);
    }

    public static DelayGetWithImpl getInstance() {
        return delayGetWith;
    }
}
