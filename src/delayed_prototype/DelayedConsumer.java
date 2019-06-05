package delayed_prototype;


/**
 * @author: dulihong
 * @date: 2019/5/28 14:03
 */
public class DelayedConsumer implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                DelayGetWith delayGetWith = DelayGetWithImpl.getInstance();
                delayGetWith.callback();
                System.out.println("end:" + System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
